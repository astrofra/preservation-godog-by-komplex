#!/usr/bin/env python3
"""Run one decompiler into a fresh directory and retain exact run evidence.

This script invokes decompilers only; it never runs the recovered demo.
"""

import argparse
from datetime import datetime, timezone
import hashlib
import json
from pathlib import Path
import shutil
import subprocess
import sys


def sha256(path):
    with path.open("rb") as source:
        return hashlib.file_digest(source, "sha256").hexdigest()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("tool", choices=("cfr", "procyon"))
    parser.add_argument("--jar", required=True, type=Path)
    parser.add_argument("--input", type=Path, default=Path("original/GODOG.ZIP"))
    parser.add_argument("--output-root", type=Path, default=Path("reverse"))
    parser.add_argument("--java", default="java")
    args = parser.parse_args()
    java = shutil.which(args.java)
    if not java or not args.jar.is_file() or not args.input.is_file():
        parser.error("Java, the decompiler JAR and the recovered input ZIP must exist")
    output = args.output_root / args.tool
    if output.exists() and any(p.name != ".gitkeep" for p in output.iterdir()):
        parser.error("Output already contains evidence; choose a fresh --output-root")
    evidence = args.output_root / "evidence"
    record_path = evidence / f"{args.tool}.run.json"
    log_path = evidence / f"{args.tool}.log"
    if record_path.exists() or log_path.exists():
        parser.error("Run evidence already exists; choose a fresh --output-root")
    output.mkdir(parents=True, exist_ok=True)
    evidence.mkdir(parents=True, exist_ok=True)
    command = [java, "-Xmx2g", "-Dfile.encoding=UTF-8", "-jar", str(args.jar)]
    if args.tool == "cfr":
        command += [str(args.input), "--analyseas", "JAR", "--outputdir", str(output),
                    "--outputencoding", "UTF-8", "--removeboilerplate", "false",
                    "--removedeadmethods", "false", "--hidebridgemethods", "false",
                    "--removeinnerclasssynthetics", "false", "--skipbatchinnerclasses", "false"]
    else:
        command += ["-jar", str(args.input), "-o", str(output), "-ec", "-ps", "-ss"]
    version = subprocess.run([java, "-jar", str(args.jar), "--version"],
                             capture_output=True, text=True, check=True)
    runtime = subprocess.run([java, "-version"], capture_output=True, text=True, check=True)
    record = {
        "tool": args.tool,
        "version": (version.stdout + version.stderr).strip(),
        "jar_path": str(args.jar), "jar_sha256": sha256(args.jar),
        "java_version": (runtime.stdout + runtime.stderr).strip(),
        "input": str(args.input), "input_sha256": sha256(args.input),
        "command": command, "working_directory": str(Path.cwd()),
        "started_at_utc": datetime.now(timezone.utc).isoformat(timespec="seconds"),
        "log": str(log_path),
    }
    record_path.write_text(json.dumps(record, indent=2) + "\n")
    with log_path.open("wb") as log:
        result = subprocess.run(command, stdout=log, stderr=subprocess.STDOUT)
    record.update({"exit_code": result.returncode,
                   "finished_at_utc": datetime.now(timezone.utc).isoformat(timespec="seconds"),
                   "java_file_count": len(list(output.rglob("*.java")))})
    record_path.write_text(json.dumps(record, indent=2) + "\n")
    print(f"{args.tool}: exit {result.returncode}; {record['java_file_count']} Java files; {log_path}")
    return result.returncode


if __name__ == "__main__":
    sys.exit(main())

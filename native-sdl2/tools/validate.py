#!/usr/bin/env python3
"""Regenerate independent Java fixtures and run the native differential checks."""
import argparse
from pathlib import Path
import os
import subprocess

parser=argparse.ArgumentParser()
parser.add_argument('--build',type=Path,default=Path('native-sdl2/build'))
args=parser.parse_args()
repo=Path(__file__).resolve().parents[2]
build=args.build.resolve()

def run(*argv,cwd=repo):
    subprocess.run([str(a) for a in argv],cwd=cwd,check=True)

# Compile the Java reference without Gradle/network dependencies.
classes=build/'reference-classes';classes.mkdir(parents=True,exist_ok=True)
sources=sorted((repo/'java-desktop/src/main/java').rglob('*.java'))
argfile=build/'javac-sources.txt'
argfile.write_text('\n'.join('"'+str(p).replace('\\','/')+'"' for p in sources+[repo/'native-sdl2/tools/ExportReference.java']))
run('javac','-d',classes,'@'+str(argfile))
fixtures=build/'reference'
run('java','--add-opens','java.base/java.lang=ALL-UNNAMED','-Djava.awt.headless=true','-cp',classes,'ExportReference',repo,fixtures)
run('cmake','-S',repo/'native-sdl2','-B',build,'-DCMAKE_BUILD_TYPE=Release','-DGODOG_REFERENCE_DIR='+str(fixtures))
run('cmake','--build',build,'--config','Release','--parallel')
run('ctest','--test-dir',build,'-C','Release','--output-on-failure')

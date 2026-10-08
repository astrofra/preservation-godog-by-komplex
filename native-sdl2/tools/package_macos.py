#!/usr/bin/env python3
"""Build a relocatable local .app, including SDL2-compat's dynamic SDL3 if needed."""
import argparse
import platform
import plistlib
import shutil
import subprocess
from pathlib import Path

parser=argparse.ArgumentParser()
parser.add_argument('--build',type=Path,default=Path('native-sdl2/build'))
parser.add_argument('--output',type=Path,default=Path('dist/native/macos-'+platform.machine()+'/Godog.app'))
parser.add_argument('--sdl3',type=Path,help='SDL3 dylib when SDL2-compat is used')
args=parser.parse_args()
if platform.system()!='Darwin':parser.error('This packager requires macOS tooling')
repo=Path(__file__).resolve().parents[2]
app=args.output.resolve();contents=app/'Contents';macos=contents/'MacOS';resources=contents/'Resources';frameworks=contents/'Frameworks'
for d in [macos,resources,frameworks]:d.mkdir(parents=True,exist_ok=True)
exe=macos/'godog';shutil.copy2(args.build.resolve()/'godog',exe)
shutil.copytree(repo/'java-desktop/assets',resources/'assets',dirs_exist_ok=True)
licenses=resources/'licenses';licenses.mkdir(exist_ok=True)
shutil.copy2(repo/'native-sdl2/vendor/stb/LICENSE',licenses/'stb.txt')
shutil.copy2(repo/'native-sdl2/PROVENANCE.md',resources/'PROVENANCE.md')

def run(*a):subprocess.run([str(v) for v in a],check=True)
def linked(path):
    return [line.strip().split(' (compatibility')[0] for line in subprocess.check_output(['otool','-L',str(path)],text=True).splitlines()[1:]]

copied={}
def bundle(source,name=None):
    source=Path(source)
    if str(source) in copied:return copied[str(source)]
    target=frameworks/(name or source.name);shutil.copy2(source,target);target.chmod(0o755);copied[str(source)]=target
    run('install_name_tool','-id','@rpath/'+target.name,target)
    for dep in linked(source):
        if Path(dep).resolve()==source.resolve() or dep.startswith(('/usr/lib/','/System/')):continue
        if not Path(dep).is_absolute():raise RuntimeError('Resolve non-absolute dependency explicitly: '+dep)
        child=bundle(dep);run('install_name_tool','-change',dep,'@loader_path/'+child.name,target)
    for license in [source.parent.parent/'LICENSE.txt',source.parent.parent/'COPYING.txt']:
        if license.is_file():shutil.copy2(license,licenses/(target.stem+'.txt'));break
    return target

for dep in linked(exe):
    if dep.startswith(('/usr/lib/','/System/')):continue
    if not Path(dep).is_absolute():raise RuntimeError('Resolve non-absolute dependency explicitly: '+dep)
    lib=bundle(dep);run('install_name_tool','-change',dep,'@executable_path/../Frameworks/'+lib.name,exe)
    if b'@loader_path/libSDL3.dylib' in Path(dep).read_bytes():
        sdl3=args.sdl3
        if sdl3 is None:
            libdir=subprocess.check_output(['pkg-config','--variable=libdir','sdl3'],text=True).strip();sdl3=Path(libdir)/'libSDL3.dylib'
        bundle(sdl3,'libSDL3.dylib')
with (contents/'Info.plist').open('wb') as f:
    plistlib.dump({'CFBundleExecutable':'godog','CFBundleIdentifier':'fi.komplex.godog.preservation','CFBundleName':'Godog','CFBundlePackageType':'APPL','CFBundleShortVersionString':'0.1','CFBundleVersion':'1','NSHighResolutionCapable':True},f)
for lib in copied.values():run('codesign','--force','--sign','-',lib)
run('codesign','--force','--sign','-',app)
run('codesign','--verify','--deep','--strict',app)
print(app)

import os
from pathlib import Path

def getCurrentDirectory():
    return str(Path().resolve())

print(123123123)
print(str(Path().resolve()))
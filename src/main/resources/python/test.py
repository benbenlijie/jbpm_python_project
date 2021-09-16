import os
from pathlib import Path

def getCurrentDirectory():
    return str(Path().resolve())

print(123123123)
print(str(Path().resolve()))

def paperPreprocess():
    # read papaer data from csv file
    # get topic key word from abstract data
    # write data to csv file or somewhere else
    pass

paperPreprocess()

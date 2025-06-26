import os,sys
from math import *
import thirdpartylib
from . import localmodule

class sample_class():
 def __init__( self, value = 42 ):
  self.value = value

 def compute ( self ,x = 1 ):
  result = x*2 +\
  self.value
  return result

double = lambda x: x*2

def example(x):
 if x: return 42

def check_type(obj):
 if type(obj) == int:
  return True

def check_prefix(filename):
 if filename[:5] == "data_":
  return True

def open_file():
 f = open ("file.txt")
 data = f.read()
 f.close()
 return data

def main(): print("starting"); data=open_file(); print(data)

def test_none(val):
 if val == None:
  print("is none")

SOME_CONST = "abc", 
files = ['a.py', 'b.py',]

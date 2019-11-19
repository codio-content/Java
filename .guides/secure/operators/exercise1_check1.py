import sys

with open('code/operators/Exercise1.java') as subfile:
  subtext = subfile.read()
  
  if 'System.out.println(a * 3 + b - 8 / 2);' in subtext:
    sys.exit(0)  
  else:
    sys.exit(1)

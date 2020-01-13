import sys

with open('code/fundamentals/Exercise5.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('System.out.print') == 2:
    sys.exit(0)
  else:
    sys.exit(1)

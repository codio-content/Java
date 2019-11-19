import sys

with open('code/operators/Exercise3.java') as subfile:
  subtext = subfile.read()

  if subtext.count('System.out.print') > 1:
    print("Make sure you are using only 1 print statement!")
    sys.exit(1)  

  #there is a "String" in the main method header...
  if subtext.count('String') < 3:
    print("You should have 2 varaibles")
    sys.exit(1)

sys.exit(0)
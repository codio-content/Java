import sys

with open('code/methods/Exercise1.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('double x = Double.parseDouble(args[0]);') !=1 or \
  subtext.count('double y = Double.parseDouble(args[1]);') !=1 or \
  subtext.count('System.out.println(getAvg(x, y));') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
sys.exit(0)
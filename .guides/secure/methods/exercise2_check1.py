import sys

with open('code/methods/Exercise2.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('boolean x = Boolean.parseBoolean(args[0]);') !=1 or \
  subtext.count('ArrayList<Integer> y = new ArrayList<Integer>();') !=1 or \
  subtext.count('for (int i = 1; i < args.length; i++) {') !=1 or \
  subtext.count('y.add(Integer.parseInt(args[i]));') !=1 or \
  subtext.count('getOddsEvens(x, y);') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
sys.exit(0)
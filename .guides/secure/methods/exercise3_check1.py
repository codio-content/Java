import sys

with open('code/methods/Exercise3.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('String x = args[0];') !=1 or \
  subtext.count('ArrayList<String> y = new ArrayList<String>();') !=1 or \
  subtext.count('for (int i = 1; i < args.length; i++) {') !=1 or \
  subtext.count('y.add(args[i]);') !=1 or \
  subtext.count('System.out.println(findTerm(x, y));') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
sys.exit(0)
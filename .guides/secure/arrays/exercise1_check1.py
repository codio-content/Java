import sys

with open('code/arrays/Exercise1.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('String[] oceans = {"Pacific", "Atlantic", "Indian", "Arctic", "Southern"};') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
  if subtext.count('oceans') < 2:
    print("You need to include the array name, oceans, in your code!")
    sys.exit(1)
    
  if (subtext.count('Pacific') > 1) or \
  (subtext.count('Atlantic') > 1) or \
  (subtext.count('Indian') > 1) or \
  (subtext.count('Arctic') > 1) or \
  (subtext.count('Southern') > 1):
    print("Please refer to the array elements when printing, not the individual Strings!")
    sys.exit(1)
    
sys.exit(0)
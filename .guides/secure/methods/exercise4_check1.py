import sys

with open('code/methods/Exercise4.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('String x = args[0];') !=1 or \
  subtext.count('System.out.println(isPalindrome(x));') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
sys.exit(0)
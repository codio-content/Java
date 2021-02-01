import sys

with open('code/methods/Exercise5.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('public static String reverse(String x) {') !=1 or \
  subtext.count('public static void main(String args[]) {') !=1 or \
  subtext.count('String x = args[0];') !=1 or \
  subtext.count('System.out.println(isPalindrome(x));')!=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
  if subtext.count('isPalindrome') < 2:
    print("You need to create a method called isPalindrome!")
    sys.exit(1)
    
  if subtext.count('reverse') < 2:
    print("You need to include the reverse method within isPalindrome!")
    sys.exit(1)
    
sys.exit(0)
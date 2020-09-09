import sys

with open('code/loops/Exercise4.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('for (int i = 100; i <= 100; i--) {') !=1 or \
  subtext.count('while (true) {') !=1 or \
  subtext.count('System.out.println("Print me!");') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)

  if subtext.count('break') < 2:
    print("You must include two and ONLY two break statements!")
    sys.exit(1)
    
sys.exit(0)
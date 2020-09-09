import sys

with open('code/loops/Exercise5.java') as subfile:
  subtext = subfile.read()
  
  forloop = subtext.count("for")
  
  whileloop = subtext.count("while")
  
  loop = forloop + whileloop
  
  println = subtext.count("System.out.print")
  
  # Prevents use of System.out.print(".") and System.out.print('.')
  dot1 = subtext.count("\".\"")
  dot2 = subtext.count("\'.\'")
  coutdot = dot1 + dot2
  
  # Prevents use of printing too many periods
  dot = subtext.count(".")
  
  if loop != 2:
    print("You did not include two and only two loops in your code!")
    sys.exit(1)

  if println != 2:
    print("You did not include two and only two print statements in your code!")
    sys.exit(1)
    
  if (coutdot >= 10) or (dot >= 20):
    print("You did not satisfy all of the requirements outlined in the assignment.")
    sys.exit(1)

sys.exit(0)
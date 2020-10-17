import sys

with open('code/loops/LabChallenge.java') as subfile:
  subtext = subfile.read()
  
  forloop = subtext.count("for")
  
  intcount = subtext.count("int ")
  
  printcount = subtext.count("System.out.print")

  if forloop < 2:
    print("Please incorporate at least two for loops!")
    sys.exit(1)
  if intcount < 2:
    print("You did not use for loops correctly. Check your code and try again.")
    sys.exit(1)
  if printcount > 2:
    print("You are only allowed to use, at most, two print statements!")
    sys.exit(1)
    
sys.exit(0)
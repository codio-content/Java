import sys

with open('code/loops/LabChallenge.java') as subfile:
  subtext = subfile.read()
  
  forloop = subtext.count("for")
  
  intcount = subtext.count("int ")

  if forloop < 2:
    print("Please incorporate at least two for loops!")
    sys.exit(1)
  if intcount < 2:
    print("You did not use for loops correctly. Check your code and try again.")
    sys.exit(1)
    
sys.exit(0)
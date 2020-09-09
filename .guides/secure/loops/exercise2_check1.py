import sys

with open('code/loops/Exercise2.java') as subfile:
  subtext = subfile.read()
  
  forloop = subtext.count("for")
  
  whileloop = subtext.count("while")
  
  println = subtext.count("System.out.println")

  if ((forloop < 1) and (whileloop < 1)):
    print("You did not include either a for or while loop!")
    sys.exit(1)
  if println != 1:
    print("You need to include ONE and ONLY ONE System.out.println statement!")
    sys.exit(1)
    
sys.exit(0)
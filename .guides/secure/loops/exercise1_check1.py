import sys

subfile = open("code/loops/Exercise1.java", "r")
subtext = subfile.read().replace(" ", "")
subfile.close()

forloop = False
if "for(" in subtext:
  forloop = True

inti = False
if "inti=0;" in subtext:
  inti = True
  
ipp = False
if "i++" in subtext:
  ipp = True

two = False
if "<=2" in subtext:
  two = True

three = False
if "<3" in subtext:
  three = True

forward = False
if "tina.forward(100)" in subtext:
  forward = True

turn = False
if "tina.left(120)" in subtext:
  turn = True

if forloop == False:
  print("You did not use a for loop in your code.")
  sys.exit(1)
if inti == False:
  print("You did use an iterating variable i and/or did not set i to zero.")
  sys.exit(1)
if ipp == False:
  print("You did not increment i by 1 after each iteration by using i++.")
  sys.exit(1)
if ((two == False) and (three == False)):
  print("It appears your loop header is not implemented correctly.")
  sys.exit(1)
if forward == False:
  print("It appears you did not direct tina's path correctly.")
  sys.exit(1)
if turn == False:
  print("It appears you did not direct tina's path correctly.")
  sys.exit(1)

sys.exit(0)
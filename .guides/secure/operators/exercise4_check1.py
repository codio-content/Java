import sys

with open('code/operators/Exercise4.java') as subfile:
  subtext = subfile.read()

  if subtext.count('System.out.print') > 1:
    print("Make sure you are using only 1 print statement!")
    sys.exit(1) 
    
  if subtext.count("=") != 2:
    print("Make sure you are declaring two variables.")
    sys.exit(1)

  if "(double)" in subtext:
    print("Nice use of type-casting")
  elif not (' int ' in subtext):
    print("Did you know that only one of your variables needs to be a double?")
    
sys.exit(0)
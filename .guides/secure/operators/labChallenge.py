import sys

with open('code/operators/LabChallenge.java') as subfile:
  subtext = subfile.read()
  
  equality = subtext.count("==") + subtext.count("!=")
  lessThan = subtext.count("<") + subtext.count("<=")
  greaterThan = subtext.count(">") + subtext.count(">=")
  logical = subtext.count("&&") + subtext.count("||") + subtext.count("!")

  if equality < 1:
    print("Incorporate at least one equality operator")
    sys.exit(1)
  if lessThan < 1:
    print("Incorporate at least one less than operator")
    sys.exit(1)
  if greaterThan < 1:
    print("Incorporate at least one greater than operator")
    sys.exit(1)
  if logical < 2:
    print("Incorporate at least two logical operators")
    sys.exit(1)

sys.exit(0)
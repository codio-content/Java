import sys

with open('code/operators/Exercise2.java') as subfile:
  subtext = subfile.read()

  if 'false' in subtext:
    sys.exit(1)  
  elif 'true' in subtext:
    sys.exit(1)

  if '||' in subtext:
    print("Nice use of OR!")
  if '&&' in subtext:
    print("Awesome AND usage!")
  if '!' in subtext:
    print("Fantastic not use!")
  if '<=' in subtext or '<' in subtext:
    print("Sweet less than")
  if '>=' in subtext or '>' in subtext:
    print("Great greater than")

sys.exit(0)
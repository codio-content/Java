import sys

with open('code/arrays/Exercise5.java') as subfile:
  subtext = subfile.read()
  
  add = subtext.count('add')
  remove = subtext.count('remove')
  setter = subtext.count('set')
  
  if subtext.count('ArrayList<String> oceans = new ArrayList<String>();') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
  if subtext.count('System.out.println(oceans);') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
  if (add < 1) or (remove < 1) or (setter < 1):
    print("You need to include at least ONE add(), ONE remove(), and ONE set() method!")
    sys.exit(1)
    
sys.exit(0)
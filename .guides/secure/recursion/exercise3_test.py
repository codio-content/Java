import os, sys, random, re, io, subprocess
#change for correct language
from java_grader_methods import *

## uses the above method to grade programs
def main():
    path = 'code/recursion'
    file = 'Exercise3.java'
    destination = 'recursion/' + file
    has_recusion = False
    no_multiplication = False
    student_code = os.path.join(path, file)
    copy_code_file(student_code, destination)
    
    # loop through line-by-line to check for more than keywords
    with open('.guides/secure/recursion/' + file, 'r') as student_code:
      code_without_comments = strip_comments(student_code.read())
      
      if not(check_code_for_recursive_call(code_without_comments, 'bunnyEars', 'public static int bunnyEars')):
        has_recusion = True
        
      banned = ['*']
      if not(check_code_for_banned(code_without_comments, banned)):
        no_multiplication = True
        
    if has_recusion and no_multiplication:
      sys.exit(0)
    else:
      sys.exit(1)

if __name__ == "__main__":
    main()
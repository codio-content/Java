import os, sys, random, re, io, subprocess
#change for correct language
from java_grader_methods import *

## uses the above method to grade programs
def main():
    path = 'code/recursion'
    file = 'Exercise5.java'
    destination = 'recursion/' + file
    student_code = os.path.join(path, file)
    copy_code_file(student_code, destination)
    
    # loop through line-by-line to check for more than keywords
    with open('.guides/secure/recursion/' + file, 'r') as student_code:
      code_without_comments = strip_comments(student_code.read())
      
      if not(check_code_for_recursive_call(code_without_comments, 'getMax', 'public static int getMax')):
        print('Code did not recursively call the "getMax" method')
        sys.exit(1)
      else:
        print('Code recursively called the "getMax" method')
        sys.exit(0)

if __name__ == "__main__":
    main()
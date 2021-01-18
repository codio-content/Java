import os, sys, random, re, io, subprocess
#change for correct language
from java_grader_methods import *

## uses the above method to grade programs
def main():
    path = 'code/recursion'
    file = 'LabChallenge.java'
    destination = 'recursion/' + file
    student_code = os.path.join(path, file)
    copy_code_file(student_code, destination)
    has_recusion = False
    no_power = False
    
    # loop through line-by-line to check for more than keywords
    with open('.guides/secure/recursion/' + file, 'r') as student_code:
        code_without_comments = strip_comments(student_code.read())
        
        if not(check_code_for_recursive_call(code_without_comments, 'recursivePower', 'public static int recursivePower')):
            has_recusion = True
        
        banned = ['Math.pow']
        if not(check_code_for_banned(code_without_comments, banned)):
            no_power = True
        
    if has_recusion and no_power:
        sys.exit(0)
    else:
        sys.exit(1)

if __name__ == "__main__":
    main()
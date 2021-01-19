import os, sys, random, re, io, subprocess
#change for correct language
import java_grader_methods as jgm

## uses the above method to grade programs
def check_recursion():
    path = 'code/recursion'
    file = 'Exercise1.java'
    destination = 'recursion/' + file
    student_code = os.path.join(path, file)
    jgm.copy_code_file(student_code, destination)
    
    # loop through line-by-line to check for more than keywords
    with open('.guides/secure/recursion/' + file, 'r') as student_code:
      code_without_comments = jgm.strip_comments(student_code.read())
      
      if not(jgm.check_code_for_recursive_call(code_without_comments, 'recursiveSum', 'public static int recursiveSum')):
        sys.exit(1)
      else:
        sys.exit(0)

if __name__ == "__main__":
    check_recursion()
import os, sys, requests, random, re, io, subprocess
#change for correct language
from java_grader_methods import *
sys.path.append('/usr/share/codio/assessments')
from lib.grade import send_partial_v2, FORMAT_V2_MD, FORMAT_V2_HTML, FORMAT_V2_TXT

## uses the above method to grade programs
def main():
    path = ''
    file = 'filename.ext'
    student_code = os.path.join(path, file)
    copy_code_file(student_code, file)
    
    points = 100
    feedback = ''
    
    #check functionality
    if not(check_output(file, 'INPUT', "OUTPUT", True)):
      feedback += "Test case failed: INPUT \n"
      points -= 20
    
    #check compliance with problem spec
    with open(file) as student_code:
      code_without_comments = strip_comments(student_code.read())
      
      limited = {"keyword":1}
      if not(check_code_for_limited(code_without_comments, limited)):
        feedback += "FEEDBACK \n"
        points -= 20
      
      banned = []
      if not(check_code_for_banned(code_without_comments, banned)):
        feedback += "FEEDBACK \n"
        points -= 20
      
      required = []
      if not(check_code_for_required(code_without_comments, required)):
        feedback += "FEEDBACK \n"
        points -= 20
    
    # loop through line-by-line to check for more than keywords
    with open(file) as student_code:
      if not(check_code_for_recursive_call(student_code, "method name", "method header")):
        feedback += "FEEDBACK \n"
        points -= 20
    
    feedback+= "<h2>On this question you earned " + str(points) + "% out of 100%</h2>"
    res = send_partial_v2(points, feedback, FORMAT_V2_HTML)
    exit(0 if res else 1)

if __name__ == "__main__":
    main()
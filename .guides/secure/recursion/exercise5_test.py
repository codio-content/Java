import os, sys, requests, random, re, io, subprocess
sys.path.append('/usr/share/codio/assessments')
from lib.grade import send_partial_v2, FORMAT_V2_MD, FORMAT_V2_HTML, FORMAT_V2_TXT
#change for correct language
import java_grader_methods as jgm

## uses the above method to grade programs
def main():
    path = 'code/recursion/'
    file = 'Exercise5.java'
    student_code = os.path.join(path, file)
    points = 100
    feedback = ''
    
    if not(jgm.check_output(path, file, '10 20 30 40', '40', False)):
      feedback += 'Test case failed: {10, 20, 30, 40} \n'
      points -= 20
      
    if not(jgm.check_output(path, file, '130 -5 15 30', '130', False)):
      feedback += 'Test case failed: {130, -5, 15, 30} \n'
      points -= 20
      
    if not(jgm.check_output(path, file, '40 320 80 160', '320', False)):
      feedback += 'Test case failed: {40, 320, 80, 160} \n'
      points -= 20
      
    if not(jgm.check_output(path, file, '15 10 20 5', '20', False)):
      feedback += 'Test case failed: {15, 10, 20, 5} \n'
      points -= 20
    
    # loop through line-by-line to check for more than keywords
    with open(student_code, 'r') as java_code:
      if not(jgm.check_code_for_recursive_call(java_code.readlines(), 'getMax', 'public static int getMax')):
        feedback += '<code>getMax</code> method is not recursive \n'
        points -= 20
        
    feedback += '<h2>On this question you earned {}% out of 100%</h2>'.format(points)
    res = send_partial_v2(points, feedback, FORMAT_V2_HTML)
    exit(0 if res else 1)

if __name__ == "__main__":
    main()
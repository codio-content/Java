import os, sys, requests, random, re, io, subprocess
sys.path.append('/usr/share/codio/assessments')
from lib.grade import send_partial_v2, FORMAT_V2_MD, FORMAT_V2_HTML, FORMAT_V2_TXT
#change for correct language
import java_grader_methods as jgm

## uses the above method to grade programs
def main():
    path = 'code/recursion/'
    file = 'Exercise3.java'
    student_code = os.path.join(path, file)
    points = 100
    feedback = ''
    
    if not(jgm.check_output(path, file, '10', '20', False)):
      feedback += 'Test case failed: 10 \n'
      points -= 16
      
    if not(jgm.check_output(path, file, '29', '58', False)):
      feedback += 'Test case failed: 29 \n'
      points -= 16
      
    if not(jgm.check_output(path, file, '14', '28', False)):
      feedback += 'Test case failed: 14 \n'
      points -= 16
      
    if not(jgm.check_output(path, file, '200', '400', False)):
      feedback += 'Test case failed: 200 \n'
      points -= 16
    
    # loop through line-by-line to check for more than keywords
    with open(student_code, 'r') as java_code:
      code_without_comments = jgm.strip_comments(java_code.read())
        
      banned = ['*']
      if not(jgm.check_code_for_banned(code_without_comments, banned)):
        feedback += 'Method should not use multiplication \n'
        points -= 18
        
    with open(student_code, 'r') as java_code:
      if not(jgm.check_code_for_recursive_call(java_code.readlines(), 'bunnyEars', 'public static int bunnyEars')):
        feedback += '<code>bunnyEars</code> method is not recursive \n'
        points -= 18
        
    feedback += '<h2>On this question you earned {}% out of 100%</h2>'.format(points)
    res = send_partial_v2(points, feedback, FORMAT_V2_HTML)
    exit(0 if res else 1)

if __name__ == "__main__":
    main()
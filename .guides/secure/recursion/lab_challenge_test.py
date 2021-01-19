import os, sys, requests, random, re, io, subprocess
sys.path.append('/usr/share/codio/assessments')
from lib.grade import send_partial_v2, FORMAT_V2_MD, FORMAT_V2_HTML, FORMAT_V2_TXT
#change for correct language
import java_grader_methods as jgm

## uses the above method to grade programs
def check_lab_challenge():
    path = 'code/recursion/'
    file = 'LabChallenge.java'
    student_code = os.path.join(path, file)
    points = 100
    feedback = ''
    
    if not(jgm.check_output(path, file, '2 3', '8', False)):
      feedback += 'Test case failed: 2 3\n'
      points -= 16
      
    if not(jgm.check_output(path, file, '7 4', '2401', False)):
      feedback += 'Test case failed: 7 4\n'
      points -= 16
      
    if not(jgm.check_output(path, file, '3 7', '2187', False)):
      feedback += 'Test case failed: 3 7\n'
      points -= 16
      
    if not(jgm.check_output(path, file, '5 0', '1', False)):
      feedback += 'Test case failed: 5 0\n'
      points -= 16
    
    # loop through line-by-line to check for more than keywords
    with open('.guides/secure/recursion/' + file, 'r') as student_code:
      code_without_comments = jgm.strip_comments(student_code.read())
        
      
        
      banned = ['Math.pow']
      if not(jgm.check_code_for_banned(code_without_comments, banned)):
        feedback += 'Method should not use <code>Math.pow</code> \n'
        points -= 18
        
    with open('.guides/secure/recursion/' + file, 'r') as student_code:
      if not(jgm.check_code_for_recursive_call(student_code.readlines(), 'recursivePower', 'public static int recursivePower')):
        feedback += '<code>recursivePower</code> method is not recursive \n'
        points -= 18
        
    feedback += '<h2>On this question you earned {}% out of 100%</h2>'.format(points)
    res = send_partial_v2(points, feedback, FORMAT_V2_HTML)
    exit(0 if res else 1)

if __name__ == '__main__':
    check_lab_challenge()
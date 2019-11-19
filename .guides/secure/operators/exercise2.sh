#!/bin/sh

javac code/operators/Exercise2.java 

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above"
  exit 1; 
fi

OUTPUT1=("$(java -cp code/operators/ Exercise2)")
if [ -z "$OUTPUT1" ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code does not seem to be outputting anything. Make sure you are using <code>System.out.println();</code>"
  exit 1;
elif [ "$OUTPUT1" != "false" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the correct value"
  exit 1
fi

python3 .guides/secure/operators/exercise2_check1.py

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>You use 'true' or 'false'</h3>"
  echo "Remember to only use numbers and operators to generate the output of 'false' "
  exit 1; 
fi
  echo "<h3>Your code is error-free and works as expected!</h3>"
  echo "Nice work"
  exit 0;
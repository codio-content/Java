#!/bin/sh

javac code/operators/Exercise1.java 

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above"
  exit 1; 
fi

OUTPUT1=("$(java -cp code/operators/ Exercise1)")

if [ "$OUTPUT1" != "17" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the correct value"
  exit 1
fi

python3 .guides/secure/operators/exercise1_check1.py

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>You have changed the wrong parts of the code</h3>"
  echo "Restore the code file by clicking on the gear in the top-right and choosing <i>Restore Files</i>"
  exit 1; 
fi
  echo "<h3>Your code is error-free and works as expected!</h3>"
  echo "Nice work"
  exit 0;
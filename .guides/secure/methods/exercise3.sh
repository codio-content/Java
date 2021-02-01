#!/bin/sh

javac code/methods/Exercise3.java

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above."
  exit 1; 
fi

OUTPUT1=("$(java -cp code/methods/ Exercise3 true true)") #Testing
OUTPUT2=("$(java -cp code/methods/ Exercise3 Cat dog fish cat)")
OUTPUT3=("$(java -cp code/methods/ Exercise3 toy water toy house)")
OUTPUT4=("$(java -cp code/methods/ Exercise3 mouse box car hat house)")
OUTPUT5=("$(java -cp code/methods/ Exercise3 1 1)")

if [ -z "$OUTPUT1" ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code does not seem to be outputting anything. Make sure you are implementing correct method syntax."
  exit 1;
fi

if [ "$OUTPUT2" != "false" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

if [ "$OUTPUT3" != "true" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

if [ "$OUTPUT4" != "false" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

if [ "$OUTPUT5" != "true" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

python3 .guides/secure/methods/exercise3_check1.py
if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Something is not quite right...</h3>"
  echo "Your output is correct but see the comments above to ensure you are following the assignment guidelines."
  exit 1; 
fi

echo "<h3>Your code is error-free and works as expected!</h3>"
echo "Nice work."
exit 0;
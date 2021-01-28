#!/bin/sh

javac code/methods/Exercise2.java

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above."
  exit 1; 
fi

OUTPUT1=("$(java -cp code/methods/ Exercise2 false 1)") #Testing
OUTPUT2=("$(java -cp code/methods/ Exercise2 true 13 22 8 31)")
OUTPUT3=("$(java -cp code/methods/ Exercise2 false 13 22 8 31)")
OUTPUT4=("$(java -cp code/methods/ Exercise2 true 1 2 3 4 5)")
OUTPUT5=("$(java -cp code/methods/ Exercise2 false 1 2 3 4 5)")

if [ -z "$OUTPUT1" ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code does not seem to be outputting anything. Make sure you are implementing correct method syntax."
  exit 1;
fi

if [ "$OUTPUT2" != "22
8" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

if [ "$OUTPUT3" != "13
31" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

if [ "$OUTPUT4" != "2
4" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

if [ "$OUTPUT5" != "1
3
5" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the requested output correctly."
  exit 1
fi

python3 .guides/secure/methods/exercise2_check1.py
if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Something is not quite right...</h3>"
  echo "Your output is correct but see the comments above to ensure you are following the assignment guidelines."
  exit 1; 
fi

echo "<h3>Your code is error-free and works as expected!</h3>"
echo "Nice work."
exit 0;
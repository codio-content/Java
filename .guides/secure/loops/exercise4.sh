#!/bin/sh

javac code/loops/Exercise4.java

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above."
  exit 1; 
fi

OUTPUT1=("$(java -cp code/loops/ Exercise4)")
if [ "$OUTPUT1" != "Print me!" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not printing the correct output. Instead of <code>"Print me!"</code> it is printing: "
  echo "$OUTPUT1"
  exit 1
fi

python3 .guides/secure/loops/exercise4_check1.py
if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Something is not quite right...</h3>"
  echo "Your output is correct but see the comments above to ensure you are following the assignment guidelines."
  exit 1; 
fi

echo "<h3>Your code is error-free and works as expected!</h3>"
echo "Nice work."
exit 0;
#!/bin/sh

javac code/arrays/Exercise3.java

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above."
  exit 1; 
fi

OUTPUT1=("$(java -cp code/arrays/ Exercise3)")
if [ -z "$OUTPUT1" ]; then
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code does not seem to be outputting anything. Make sure you are using correct ArrayList method syntax."
  exit 1;
elif [ "$OUTPUT1" != "[Pacific, Atlantic, Indian, Arctic, Southern]" ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputting the correct result. It is outputting:"
  echo "$OUTPUT1"
  exit 1
fi

python3 .guides/secure/arrays/exercise3_check1.py
if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Something is not quite right...</h3>"
  echo "Your output is correct but see the comments above to ensure you are following the assignment guidelines."
  exit 1; 
fi
echo "<h3>Your code is error-free and works as expected!</h3>"
echo "Nice work."
exit 0;
#!/bin/sh

cd code/loops
javac Exercise1.java

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above."
  exit 1; 
fi

cd ../..
python3 .guides/secure/loops/exercise1_check1.py
if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Something is not quite right...</h3>"
  echo "Your code doesn't appear to follow all of the assignment guidelines."
  exit 1; 
fi
echo "<h3>Your code fulfills all of the requirements.</h3>"
echo "Nice work."
exit 0;
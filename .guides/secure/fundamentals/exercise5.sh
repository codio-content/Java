#!/bin/sh

javac code/fundamentals/Exercise5.java 

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above"
  exit 1; 
fi

OUTPUT1=("$(java -cp code/fundamentals/ Exercise5)")

if [ "$OUTPUT1" != "Okay, it is time to learn about operators." ]; then 
  echo "<br/><hr/><h3>Challenge Feedback</h3>"
  echo "Your code is not outputing the correct value"
  exit 1
fi

python3 .guides/secure/fundamentals/exercise5_check1.py

if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>You have not used two print statements</h3>"
  echo "Make sure you are using <b>two</b> print statements as requested by the prompt"
  exit 1; 
fi
  echo "<h3>Your code is error-free and works as expected!</h3>"
  echo "Nice work"
  exit 0;
#!/bin/sh
#the above line denotes the file is a bash script
#the line below takes in the student code (including file path) and attempts to compile
javac $1
#this if statement exits based on the exit value of the compilation
if [ $? -ne 0 ]; then 
  echo "</br><hr/><h3>Your code has compilation errors!</h3>"
  echo "Try correcting the errors listed above"
  exit 1; 
fi
  echo "<h3>Your code is error-free!</h3>"
  echo "Nice work"
  exit 0;
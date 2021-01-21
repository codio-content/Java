#!/bin/bash

javac -cp "jars/*" code/files/"$1".java && java -cp "jars/*:code/files/:." "$1" "$2"
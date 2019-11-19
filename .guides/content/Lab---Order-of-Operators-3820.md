## Tutorial Lab 3: Order of Operations

Java uses PEMDAS when determining the order of operations.

![PEMDAS](.guides/img/pemdas.png)

<details><summary><b>Modulo and PEMDAS</b></summary>Since modulo is based on division, modulo operations happen at the time of multiplication and division, going from left to right.</details>

Use the text editor open in the left pane, and enter the following code:

```java
System.out.println(5 * 8 / 3 + (18 - 8) % 2 - 25);
```

{Try it}(sh .guides/bg.sh javac code/operators/LabPEMDAS.java java -cp code/operators/ LabPEMDAS)

Below are the steps that Java takes when evaluating the code above.
1) `5 * 8 / 3 + (18 - 8) % 2 - 25`
1) `5 * 8 / 3 + 10 % 2 - 25`
1) `40 / 3 + 10 % 2 - 25`
1) `13 + 10 % 2 - 25`
1) `13 + 0 - 25`
1) `13 - 25`
1) `-12`

{Check It!|assessment}(parsons-puzzle-1182062674)

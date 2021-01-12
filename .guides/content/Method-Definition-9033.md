----------

## Method Syntax

You have seen and used built-in methods like the length method (`my_string.length()`). This unit deals with user-defined methods. Methods are composed of two parts, the header and the body.

![Fuction Header & Body](.guides/images/function-header-body.png)

The method header contains the `def` keyword which signals the definition of a method. Next is the name of the method. Function names follow the same rules as variable names; letters, numbers, and underscores. Method names cannot start with a number. Parentheses are required, and any parameters go between them. Finally, the header ends with a colon.

![Function Header](.guides/images/function-header.png)

The method body is the list of actions the method performs. All of the code for the method body must be indented (four spaces is the Python standard) from the method header. The method ends when the code is no longer indented.

![Function Body](.guides/images/function-body.png)

## Calling a Method

Enter the code below into the editor and click the `TRY IT` button. Nothing is printed. Defining a method does not cause Python to run it.

```python
def greet_twice():
    print("Hello")
    print("Hello")
```

{try it}(python3 code/functions/call-function.py 1)

You have to explicitly call the method if you want it to run. Add `greet_twice()` after the method definition. Remember **do not** indent the method call. Run the code again.

```python
def greet_twice():
    print("Hello")
    print("Hello")
    
greet_twice()
```

{try it}(python3 code/functions/call-function.py 2)

|||challenge
## What happens if you:
* Add another line code that says `greet_twice()`?
* Indent `greet_twice` four spaces?
* Add a `1` between the parentheses of the function call `greet_twice(1)`?

|||

{try it}(python3 code/functions/call-function.py 3)


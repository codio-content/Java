----------

## The Return Keyword

Rather than **printing** data, methods can also **return** data. Think of the `length()` method. This method returns the length (an int) of either a string or list. So the return value of `len` is of type int. `len` does not print anything to the screen, it just returns a number. From here on out, methods will no longer use the print statement. Instead, methods will return a value — use the `return` keyword in place of `print`.

```python
def add_five(num):
    """Add five to the parameter num"""
    return(num + 5)
  
add_five(10)
```

{try it}(python3 code/functions/returning-values.py 1)

The program no longer prints anything to the screen. That is because the method only adds 5 to whatever parameter is passed to the method, and back the method returns this value to the program. Explicitly tell Python to print the return value of the method.

```python
def add_five(num):
    """Add five to the parameter num"""
    return(num + 5)
  
new_number = add_five(10)
print(new_number)
```

{try it}(python3 code/functions/returning-values.py 2)

|||challenge
## What happens if you:
* Remove the last two lines of the program and replace them with this: `print(add_five(10))`?

|||

{try it}(python3 code/functions/returning-values.py 3)

<details>
  <summary><strong>What is the return value for methods that use <code>print</code>?</strong></summary>
  If every method in Python has a return value, what is the return value for methods that use <code>print</code>? The keyword <code>return</code> is not used, so you cannot see if it returns a string, a float, a list, etc. Methods that use <code>print</code> instead of <code>return</code> have a special return value called <code>NoneType</code>. Enter the code below to see the return type of the print statement as compared to the return value of the <code>len</code> method.
  
  ```python
  def print_hello():
      '''Prints the string Hello'''
      print('Hello')
  
  print(type(print_hello()))
  print(type(len('Hello')))
  ```
  
</details>

## Returning Values

Methods can return any value in Python — ints, floats, strings, lists, etc.

```python
def return_int(num1, num2):
    """Return the floor division of num1 divided by num2"""
    return(num1 // num2)
  
def return_float(num1, num2):
    """Return num1 divided by num2"""
    return(num1 / num2)
  
def return_string(string):
    """Return the value of string appended to 'Hello' """
    return("Hello" + string)
  
print(return_int(10, 3))
print(return_float(10, 3))
print(return_string(" friend"))
```

{try it}(python3 code/functions/returning-values.py 4)

|||challenge
## Can you write a method that returns a list?
If you want to return a list, it is a good idea to have a list be passed as a parameter. Modify the list in some way, and then return it to the program.
<details>
  <summary><strong>One possible solution</strong></summary>
  The code below takes a list of numbers as a parameter. Each element of the list is multiplied by 5, and the new list is returned.
  
  ```python
  def mult_by_5(my_list):
      '''Takes a list of ints and returns a new
      list where each element is multiplied by 5'''
      new_list = []
      for elem in my_list:
          new_list.append(elem * 5)
      return new_list
  
  print(mult_by_5([1, 2, 3, 4, 5]))
  ```
  
</details>

|||

{try it}(python3 code/functions/returning-values.py 5)


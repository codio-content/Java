----------

## The Title Method

The `title` method creates a copy of a string, and returns a string with the first letter of each word capitalized. All other characters of the word will be lowercase.

```python
my_string = "the big brown dog"
print(my_string.title())
```

{try it}(python3 code/strings/title-method.py 1)

|||challenge
## What happens if you:
* Change `my_string` to `"tHe BiG bRoWn DoG"`?
* Change `my_string` to `"thebigbrowndog"`?
* Change `my_string` to `"a1 1a a a a"`?

|||

{try it}(python3 code/strings/title-method.py 2)

<details>
  <summary><strong>Other String Methods</strong></summary>
  There are <a href="https://www.tutorialspoint.com/python/python_strings.htm">many more</a> string methods. Here are a few examples:
  <table>
    <tr><th>Method</th><th>Example</th><th>Description</th></tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_center.htm">Center</a></td>
      <td><code>center(width, fill)</code></td>
      <td>Center a string in a given width, fill any whitespace with a given character</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_count.htm">Count</a></td>
      <td><code>count(str, start, end)</code></td>
      <td>Count how many times a string appears</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_endswith.htm">Ends With</a></td>
      <td><code>endswith(str, start, end)</code></td>
      <td>Return <code>True</code> if a string ends with a specific string</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_index.htm">Index</a></td>
      <td><code>index(str, start, end)</code></td>
      <td>Return index of <code>str</code> in a string, will raise an exception if not found</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_isalnum.htm">Is Alphanumeric</a></td>
      <td><code>isalnum()</code></td>
      <td>Returns <code>True</code> if string is alphanumeric</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_isalpha.htm">Is Alphabetic</a></td>
      <td><code>isalpha()</code></td>
      <td>Returns <code>True</code> if string is alphabetic</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_isdigit.htm">Is Digit</a></td>
      <td><code>isdigit()</code></td>
      <td>Returns <code>True</code> if string is just digits</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_islower.htm">Is Lower</a></td>
      <td><code>islower()</code></td>
      <td>Returns <code>True</code> if the string is lowercase</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_isspace.htm">Is Space</a></td>
      <td><code>isspace()</code></td>
      <td>Returns <code>True</code> if the strings is nothing but spaces</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_istitle.htm">Is Title</a></td>
      <td><code>istitle()</code></td>
      <td>Returns <code>True</code> if the string is title case</td>
    </tr>
    <tr>
      <td><a href="https://www.tutorialspoint.com/python/string_isupper.htm">Is Upper</a></td>
      <td><code>isupper()</code></td>
      <td>Returns <code>True</code> if string is all uppercase</td>
    </tr>
  </table>

{Check It!|assessment}(multiple-choice-2695027968)

----------

## Method Syntax

You have seen and used built-in methods like the length method (`myString.length()`). This unit deals with user-defined methods. Methods are composed of two parts, the header and the body.

![.guides/img/MethodFull](.guides/img/MethodFull.png)

The method header contains several keywords to determine the method type. Next is the name of the method. Names of "[m]ethods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized" (https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html). Some examples include: `greetTwice`, `addThree`, `findArea`, etc. Parentheses are required but the parameter(s) within them are not. Any command(s) associated with the method should be indented and enclosed within curly braces `{}`. This command(s) comprises the body of the method.

## Method Header

![.guides/img/MethodHeader](.guides/img/MethodHeader.png)

The method header usually starts with a few keywords:
* `public` - Determines from where the method can be accessed. Other options include **private** and **protected**. For this module, we will be working with mostly **public** methods.
* `static` - Determines what can access the method. **static** methods can be accessed without needing a particular instance or object. If you want the method to be exclusive to an object, do not include **static**. For this module, we will be working with mostly **static** methods.
* `void` - Determines whether there is a return value or not for the method. If the method has no return value, use **void**. If the method returns an integer, use **int**, etc.
* `greetTwice` - This is an example of a method name. See above for naming conventions.
* `()` - Parentheses are required for all methods. Any parameters that the method takes in will go into the parentheses but they are optional.

## Method Body

![.guides/img/MethodBody](.guides/img/MethodBody.png)

The method body is the list of actions the method performs. All of the code for the method body should be enclosed within curly braces `{}` and indented to show association. This convention is similar to how conditionals and loops are written.

{Check It!|assessment}(fill-in-the-blanks-3810149836)


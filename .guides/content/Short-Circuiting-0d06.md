----------

## Short Circuiting

If Java can determine the result of a boolean expression before evaluating the entire thing, it will stop and return the value.

![Short Circuiting](.guides/img/shortcircuiting.png)

```Java
System.out.println( false 
                           && 
/*Java never reaches this line*/ true); 

System.out.println( true 
                          || 
/*Java never reaches this line*/ false); 
```

{Check It!|assessment}(fill-in-the-blanks-1476766980)

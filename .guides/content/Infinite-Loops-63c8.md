Once of the common things that can happen with loops is that you forget to increment your counter.

If, when doing the exercises in this unit, you see that nothing happens, the chances are you have created an infinite loop.

Take a look at the psudeo-code below. Can you see what is wrong with it?

```
input0 = 10;
ctr = 0;

loop while ctr < input0
    print(ctr);
```

If you run this, it will run forever and your program will crash.

The reason is that because you are never incrementing the `counter` variable, the condition is always true (less than 10), so it goes round and round the loop until domesday.
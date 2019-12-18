----------

## While Loop Syntax
While loops, just like for loops, use curly braces `{}` and indent for all commands that should be repeated. Here is a while loops that prints "Hello" based on the variable `count`.

```java
int count = 5; //some unknown number set by user
while(count > 0 ){
    System.out.println("Hello");
    count--;
}
```

[Code Visualizer](open_tutor code/loops/WhileLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/WhileLoops.java java -cp code/loops/ WhileLoops )

|||challenge
## What happens if you:
* Change the while statement to `while(count > -1*count)`?
* Change the second to last line of code to `count = count - 2`?
* Change the while statement to `while(count < 10)`?

|||

## Infinite Loops
Infinite loops are loops that never have a test condition that causes the loop to stop. For example, this is a common mistake:

```java
int count = 5; //some unknown number set by user
while(count > 0 ){
    System.out.println("Hello");
}
```

Since the variable `count` never gets decremented. It remains 5, and 5 will forever be greater than 0. So the loop will never stop.

|||warning
Run the code above to see what happens. Java will eventually stop the loop due to an output limit, but it will take some time before this happens. 
|||

{Try it}(sh .guides/bg.sh javac code/loops/WhileLoops.java java -cp code/loops/ WhileLoops 2)

## Why Use a While Loop?
If a while loop does the same thing as a for loop and infinite loops more frequently occur in a while loop, why use them? While loops are useful when you are waiting for a certain event to occur. Imagine you are making a video game. The game should continue until the player loses all of their lives. You don't know how long this will take, so a while loop would be appropriate.

```java
int playerLives = 3;

while(player_lives > 0) {
    # video game code
    # goes here
}
```
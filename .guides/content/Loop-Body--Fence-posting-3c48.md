Sometimes when writing a loop body, you realize the output is a little funny. Take a look at the output of the flowchart to the left by clicking the "Run" button that looks like a play triangle.

You might notice 2 things:
1. The print out start counting at 0
1. The print out has an extra comma

Try fixing the first one by making sure the loopVariable gets to 1 *before* the output variable is added to.

The second problem is a common one and it is addressed through the **fence post analogy**.

|||info

**Fence-posting** is the idea that you often need to add an extra action before or after a loop. 

![.guides/img/Fence](.guides/img/Fence.png)

This is like when building a fence, you need an extra post to hold up either the start or end of your fence.

|||

In the example to the left, we want the last number so be special, so we need to add it *after* the loop has exited.

*Hint:* You will need to change the loop condition.

{See Solution|assessment}(test-2965980592)

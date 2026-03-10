package LinkedList;

import java.util.LinkedList;

public class QueueUsingStacks {

    private LinkedList<Integer> inStack;
    private LinkedList<Integer> outStack;

    public QueueUsingStacks() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }

    public void push(int x) {
        // Push to the input stack
        inStack.addLast(x);
    }

    public int pop() {
        // Ensure outStack has data before removing
        peek();
        return outStack.removeLast();
    }

    public int peek() {
        // If outStack is empty, move everything from inStack
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                // Moving from top of inStack to top of outStack reverses the order
                outStack.addLast(inStack.removeLast());
            }
        }
        // Return the top element of outStack (which is the front of the queue)
        return outStack.getLast();
    }

    public boolean empty() {
        // Queue is empty only if both stacks are empty
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingStacks myQueue = new QueueUsingStacks();

        System.out.println("Pushing 1, 2, 3");
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        System.out.println("Peek (should be 1): " + myQueue.peek()); // Should return 1

        System.out.println("Pop (should be 1): " + myQueue.pop());   // Should return 1

        System.out.println("Peek (should be 2): " + myQueue.peek()); // Should return 2

        System.out.println("Is Empty? " + myQueue.empty());          // Should return false
    }
}

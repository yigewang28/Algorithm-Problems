class MyQueue {
    Stack<Integer> myQueue = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        if (myQueue.isEmpty()) {
            myQueue.push(x);
        } else {
            Stack<Integer> tempStack = new Stack<Integer>();
            while (!myQueue.isEmpty()) {
                tempStack.push(myQueue.pop());
            }
            myQueue.push(x);
            while (!tempStack.isEmpty()) {
                myQueue.push(tempStack.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        myQueue.pop();
    }

    // Get the front element.
    public int peek() {
        return myQueue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return myQueue.isEmpty();
    }
}
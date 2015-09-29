class MyStack {
    LinkedList<Integer>  myStack = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        if(myStack.size() == 0) {
            myStack.addLast(x);
        } else {
            LinkedList<Integer> queue = new LinkedList<Integer>();
            while(myStack.size() != 0) {
                queue.addLast(myStack.pollFirst());
            }
            myStack.addLast(x);
            while(queue.size() != 0) {
                myStack.addLast(queue.pollFirst());
            }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        myStack.removeFirst();
    }

    // Get the top element.
    public int top() {
        return myStack.getFirst();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return myStack.size() == 0;
    }
}
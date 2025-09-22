class MinStack {
    private Stack<Integer> stack;
    // regular LIFO stack
    // preserves insertion order of elements
    private Stack<Integer> minStack;
    // auxiliary stack 
    // keeps track of consecutive minimum elements 

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // we push the same value 'val' into both stack and minStack
    // stack and minStack store copies of the same value 'val'
    // both copies of the value 'val' have different memory locations
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    // we remove the top element from stack
    // we also remove the copy of the same element from minStack
    // the two stacks need to be synchronized 
    public void pop() {
        int popped = stack.pop();
        if(popped == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
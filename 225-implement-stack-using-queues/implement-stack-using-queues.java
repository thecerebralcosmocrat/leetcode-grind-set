// implementation of a stack using two queues
class MyStack {
    private Queue<Integer> queue1;
    // primary queue that always holds the elements in stack order
    private Queue<Integer> queue2;
    // secondary queue used temporarily during push operations

    public MyStack() {
    // constructor: Initialize both queues
       queue1 = new LinkedList<>(); // primary queue
       queue2 = new LinkedList<>(); // secondary queue
    }
    
    public void push(int x) {
    // push element x into the stack
        queue2.offer(x);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        // swap the references in memory
        // queue1 and queue2 remain in memory
        // only their object references in memory have been swapped or exchanged
    }
    
    public int pop() {
    // removes the element from the top of the stack and returns it
        return queue1.poll();
    }
    
    public int top() {
    // gets the element at the top of the stack without removing it
        return queue1.peek();
    }
    
    public boolean empty() {
    // checks whether the stack is empty
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
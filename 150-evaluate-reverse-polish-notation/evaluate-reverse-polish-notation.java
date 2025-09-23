class Solution {
    public int evalRPN(String[] tokens) {
    
    // RPN = regular postfix expression 
    // the operator working on two specific operands immediately succeeds them
    // (3 + 4 - 5) is evaluated as (3 4 + 5 -) in RPN/postfix form
    
    Stack<Integer> stack = new Stack<>();
    // we push elements as Integer into stack

    for(int i=0; i<tokens.length; i++){
        String token = tokens[i];

        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
            int b = stack.pop();
            int a = stack.pop();
            int result = 0;

            switch(token){
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break; 
                // integer division in Java truncates to zero by default
                // + and * are commutative but - and / are not
                // - and / are cases that will break code if elements are not popped properly
            }
            stack.push(result);
        } else {
            stack.push(Integer.parseInt(token));
            // Integer.parseInt(token) returns a primitive int which is autoboxed to Integer when pushed
            // stack.pop() returns an Integer which is auto-unboxed to int when used in arithmetic or assigned to an int
            // Be careful: unboxing a null Integer will throw NullPointerException
        }
    }
    return stack.pop();
    // return the final element pushed into the stack by popping it
    // this element will be the final answer to the evaluated RPN/postfix expression
  }
}
class Solution {
    public int evalRPN(String[] tokens) {
    
    Deque<Integer> stack = new ArrayDeque<>();
    // using ArrayDeque under the hood to implement Stack
    // faster because its unsynchronized

    Set<String> ops = Set.of("+", "-", "*", "/");
    // Set of valid operators

    for(String token : tokens){

        if(ops.contains(token)){
            int b = stack.pop();
            int a = stack.pop();
            int result = 0;

            switch(token){
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break; 
                // integer division truncates towards zero by default
            }
            stack.push(result);
        } else {
            stack.push(Integer.parseInt(token));
        }
    }
    return stack.pop();
    // final result
  }
}
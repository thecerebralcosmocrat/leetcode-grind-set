class Solution {
    public int calPoints(String[] operations) {

        int sumOfScores = 0;
        Stack<Integer> stack = new Stack<Integer>();
        // we use a stack to keep track of valid scores 
        // and to access and update the last or second-last elements based on the operations
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int top = stack.peek();
                stack.push(top * 2);
            }
            else if(operations[i].equals("+")){
                int top = stack.peek();
                int secondLast = stack.get(stack.size() - 2);
                stack.push(top + secondLast);
                // stack.size() gives the total number of elements
                // stack.get(index) retrieves the element at that index
                // stack.get(stack.size() - 2) gives the second-last element
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        for(Integer s : stack){
            sumOfScores += s;
        }
        return sumOfScores;
    }
}
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String resultString = "";
        int i = 0;

        while(i < s.length()){
            if(stack.isEmpty() || s.charAt(i) != stack.peek()){
                stack.add(s.charAt(i));
                i++;
            }
            else{
                stack.pop();
                i++;
            }
        }
        while(!stack.isEmpty()){
            resultString = stack.peek() + resultString;
            stack.pop();
        }
            return resultString;
    }
}
class Solution {
    public boolean isValid(String s) {
        char[] checkValid = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<checkValid.length; i++){
            if(checkValid[i]=='(' || checkValid[i]=='{' || checkValid[i]=='['){
                stack.push(checkValid[i]);
            }
            else if(checkValid[i]==')' || checkValid[i]=='}' || checkValid[i]==']'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if(checkValid[i]==')' && top=='('){
                        stack.pop();
                    }
                    else if(checkValid[i]=='}' && top=='{'){
                        stack.pop();
                    }
                    else if(checkValid[i]==']' && top=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
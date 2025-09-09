class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n];  
        int top = -1; 

        for(int i=0; i<n; i++){
             char ch = s.charAt(i);

             // if opening bracket --> push
             if(ch=='(' || ch=='{' || ch=='['){
                stack[++top] = ch;   
             }

             // if closing bracket --> check top
             else{
                if(top == -1){
                    return false;  // no matching opening
                }
                // access top element of stack
                char last = stack[top--];  
                if(ch==')' && last!='(' || ch=='}' && last!='{' || ch==']' && last!='['){
                    return false;
                }
            }
        }
        return top == -1;
    }
}
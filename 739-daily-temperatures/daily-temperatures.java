class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int[] nextGreaterTemperature = new int[temperatures.length];
        Arrays.fill(nextGreaterTemperature, 0);

        for(int i=0; i<temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int stackTop = stack.pop();
                nextGreaterTemperature[stackTop] = i - stackTop;
            }

            stack.push(i);
        }

        return nextGreaterTemperature;
    }
}
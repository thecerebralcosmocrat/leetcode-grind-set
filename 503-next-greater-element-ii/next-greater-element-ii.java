class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        int[] nextGreater = new int[nums.length];
        Arrays.fill(nextGreater, -1);


    for(int j=0; j<2; j++){

            for(int i=0; i<nums.length; i++){

                while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                    int stackTop = stack.pop();
                    nextGreater[stackTop] = nums[i];
                }

                stack.push(i);
            }

        }

        return nextGreater;
    }
}
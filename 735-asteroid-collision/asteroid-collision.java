class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length == 0 || asteroids.length == 1){
            return asteroids;
            // return Arrays.copyOf(original, asteroids.length);
        }
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            if(a > 0){
                stack.push(a);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && (Math.abs(stack.peek()) < Math.abs(a))){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() > 0 && (Math.abs(stack.peek()) == Math.abs(a))){
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(a);
                }
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
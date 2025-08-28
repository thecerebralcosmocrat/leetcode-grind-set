class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> twoSum = new HashMap<>();
        // declare a HashMap with key and value as Integer type

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];

            if(twoSum.containsKey(diff) && twoSum.get(diff) != i){
            // twoSum.containsKey(diff) checks if the key (number) is present in the map
            // twoSum.get(diff) checks if the diff key index and the current index are different
            // diff and i cannot have the same index value

                return new int[]{twoSum.get(diff), i};
                // returns an array containing the indexes of the keys that add up to target
            }
            twoSum.put(nums[i], i);
            // stores key-value pairs in the map
            // here the keys are the numbers and the values are their indices
        }

        return new int[]{};
    }
}
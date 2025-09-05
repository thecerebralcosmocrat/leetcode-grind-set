// two-pass HashMap/counting method
class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        HashMap<Integer, Integer> freqMapM = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freqMapM.put(nums[i], freqMapM.getOrDefault(nums[i], 0) +1);
        }
        for(Integer key : freqMapM.keySet()){
        // the keySet() method returns a set of all keys in the HashMap
        // you iterate through each key in the HashMap
            if(freqMapM.get(key) > nums.length/2){
            //freqMapM.get(key) retrieves the value associated with the key
            // the value being the frequency of occurence of the element
            // checks if the frequency of occurence is greater than nums.length/2
                majority = key;
                // if yes assign key (the element) to majority
            }
        }
        return majority;
        // return majority (every array will definitely have a majority element)
    }
}
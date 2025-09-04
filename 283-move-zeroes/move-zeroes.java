class Solution {
    // slow-fast two-pointers approach
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        // track position to place non-zero elements
        for(int readIndex=0; readIndex<nums.length; readIndex++){
            if(nums[readIndex] != 0){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        for(int i = writeIndex; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
class Solution {
    public void moveZeroes(int[] nums){
        int m = nums.length;
        int[] resultArray = new int[m];
        // additional array to store the elements 
        int frontIndex = 0;
        // controls index from the front
        int backIndex = nums.length-1;
        // controls index from the back
        for(int i=0; i<m; i++){
            if(nums[i] != 0){
                resultArray[frontIndex] = nums[i];
                frontIndex++;
            }
            else{
                resultArray[backIndex] = nums[i];
                backIndex--;
            }
        }
        for(int i=0; i<m; i++){
            nums[i] = resultArray[i];
        }
    }
}
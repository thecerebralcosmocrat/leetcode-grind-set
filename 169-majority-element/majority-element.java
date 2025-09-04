// brute force (sorting) approach
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majority = nums[nums.length/2];
        return majority;
    }
}
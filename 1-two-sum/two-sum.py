class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        twoSum = {}

        for i,n in enumerate(nums):
            diff = target - n
            if diff in twoSum and twoSum[diff]!=i:
                return [twoSum[diff], i]

            twoSum[n] = i

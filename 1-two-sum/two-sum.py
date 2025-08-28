class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        twoSum = {}
        # empty dictionary to store key->value pairs
        # the keys are the numbers and the values are their indices

        for i,n in enumerate(nums):
            twoSum[n] = i
            # i  = index
            # n = value at that index
            # will return a dictionary with key->value pairs
            # for example: [1,2,3] will return {1:0, 2:1, 3:2}

        for i,n in enumerate(nums):
            diff = target - n
            if diff in twoSum and twoSum[diff]!=i:
                return [twoSum[diff], i]
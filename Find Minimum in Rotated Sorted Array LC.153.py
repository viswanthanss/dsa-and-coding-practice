from typing import List  # To use List type

class Solution:
    def findMin(self, nums: List[int]) -> int:
        l = 0  # l is the start index
        r = len(nums) - 1  # r is the end index

        while l < r:  # Keep searching while l is less than r
            m = (l + r) // 2  # Find the middle index
            
            if nums[m] > nums[r]:  # If middle is bigger than right
                l = m + 1  # Minimum is in the right part     #the middle number is bigger than the right → min must be on the right side
            else:  # Else minimum is at mid or in the left part
                r = m  # Move right to mid    # the mid is smaller than or equal to right → min could be at m or on the left.So we move r to m to keep m in our search (we don't skip it, because m could be min).



        return nums[l]  # l points to the smallest number   #That’s the minimum element we’ve been searching for.
        #after loop, l(left)  points at min

#https://chatgpt.com/share/685aeecd-6a6c-8010-a7a4-add2a2a77c60
# sol = Solution()
# print(sol.findMin([3,4,5,1,2]))  # Output: 1
# print(sol.findMin([4,5,6,7,0,1,2]))  # Output: 0
# print(sol.findMin([11,13,15,17]))  # Output: 11

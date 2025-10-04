class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        //HashSet

        HashSet<Integer> set = new HashSet<Integer>(); //set

        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))  //hashset name   .contains(nums[i])
            {
                return true;

            }
            //otherwise add it to set

            set.add(nums[i]);   //hashset name .add(nums[i]) 
        }

        return false;
        
    }
}



/*
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

*/

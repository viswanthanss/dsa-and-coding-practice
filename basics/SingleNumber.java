class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}

/*
🧠 How it works (super simple explanation):

XOR (^) has a special property:

a ^ a = 0 (same numbers cancel each other)

a ^ 0 = a (XOR with zero keeps the number same)

So, when you XOR all numbers together, all pairs cancel out, leaving the single number.

✅ Example:
nums = [4,1,2,1,2]
→ (((((0 ^ 4) ^ 1) ^ 2) ^ 1) ^ 2) = 4


  */

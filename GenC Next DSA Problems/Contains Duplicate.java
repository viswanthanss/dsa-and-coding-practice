import java.util.HashSet;
//hashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a set to store seen numbers
        HashSet<Integer> set = new HashSet<>();

        // Go through each number in the array (traditional loop)
        for (int i = 0; i < nums.length; i++) {
            // If this number is already in the set, it's a duplicate
            if (set.contains(nums[i])) {
                return true;
            }
            // Otherwise, add it to the set
            set.add(nums[i]);
        }

        // If loop ends, no duplicates found
        return false;
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // middle index

            if (nums[mid] == target) {
                return mid; // found it
            } else if (nums[mid] < target) {
                left = mid + 1; // search right side
            } else {
                right = mid - 1; // search left side
            }
        }

        return -1; // not found
    }
}

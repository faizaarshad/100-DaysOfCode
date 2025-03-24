// Solution for Day 3  
// Day 3 - Minimum Operations to Make Binary Array Elements Equal to One  

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int flips = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                flips++;
            }
        }

        // Additional check for the last few elements
        for (int i = n - 3; i < n; i++) {
            if (nums[i] == 0) {
                return -1; // Impossible case
            }
        }

        return flips;
    }
}

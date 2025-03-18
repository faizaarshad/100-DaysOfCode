"// Solution for Day 2" 
// Day 2 - Longest Nice Subarray
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = 0; // Bitwise OR of current window
        int j = 0; // Left boundary of the window
        int max = 0; // Maximum length of nice subarray
        
        for (int i = 0; i < nums.length; i++) {
            // Shrink the window if AND operation is not zero
            while ((n & nums[i]) != 0) {
                n = n ^ nums[j]; // Remove nums[j] from bitwise OR
                j++; // Move left boundary
            }
            n = n | nums[i]; // Add nums[i] to current window
            max = Math.max(max, i - j + 1); // Update max length
        }
        
        return max;
    }
}

// 🚀 Day 1 - Divide Array Into Equal Pairs Solution  
import java.util.HashMap;

class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if all numbers have even occurrences
        for (int count : map.values()) {
            if (count % 2 != 0) { // If any number appears an odd number of times, pairing is impossible
                return false;
            }
        }

        return true; // If all numbers appear an even number of times, they can be paired
    }
}

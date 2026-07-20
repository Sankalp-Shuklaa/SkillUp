import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; 
    }
}

// Time Complexity: O(n) – single pass through the array with constant-time hashmap operations.
// Space Complexity: O(n) – hashmap may store up to n entries in the worst case.
// This is the optimal solution for the Two Sum problem; any solution must examine each element at least once.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna

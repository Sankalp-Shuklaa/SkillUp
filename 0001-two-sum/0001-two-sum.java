import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize a HashMap to store each number and its index.
        // This allows O(1) lookup for the complement of any number.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array once.
        // For each element, compute the needed complement (target - nums[i])
        // and check if that complement has been seen before.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, we have found the solution.
            if (map.containsKey(complement)) {
                // Return the index of the complement and the current index.
                return new int[] { map.get(complement), i };
            }

            // Store the current number with its index for future complement checks.
            map.put(nums[i], i);
        }

        // The problem guarantees exactly one solution, so this line is unreachable.
        // Returning an empty array as a safeguard.
        return new int[] {}; // Never reached because one solution exists
    }
}

// Time Complexity: O(n) – single pass through the array with constant-time hashmap operations.
// Space Complexity: O(n) – hashmap may store up to n entries in the worst case.
// This is the optimal solution for the Two Sum problem; any solution must examine each element at least once.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // Map to store the first occurrence of a cumulative sum
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // To handle subarrays starting from index 0

        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1
            sum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}


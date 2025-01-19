class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, i = 0, j = 0, n = 0;
        while (j < nums.length) {
            if (n <= 1) {
                if (nums[j] == 1) {
                    j++;
                } else {
                    n++;
                    j++;
                }
                while (n > 1) {
                    if (nums[i] == 0) n--;
                    i++;
                }
                max = Math.max(max, j - i);
            }
        }
        return max-1;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, i = 0, j = 0, zero = 0;
        while (j < nums.length) {
            if (zero <= k) {
                if (nums[j] == 0) {
                    zero++;
                    j++;
                } else if (nums[j] == 1) {
                    j++;

                }
                while (zero > k) {
                    if (nums[i] == 0) zero--;
                    i++;
                } 
                max = Math.max(max, j - i);
            }
        }
        return max;
    }
}
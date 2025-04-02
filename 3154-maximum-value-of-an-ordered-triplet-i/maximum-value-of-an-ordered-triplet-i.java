class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    long diff = nums[i] - nums[j];
                    max = Math.max(max, diff * nums[k]);
                }
            }
        }
        return max;
    }
}
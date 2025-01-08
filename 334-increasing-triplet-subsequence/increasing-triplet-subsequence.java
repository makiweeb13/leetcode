class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length, first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        if (n > 2) {
            for (int i = 0; i < n; i++) {
                if (nums[i] > second) {
                    return true;
                } else if (nums[i] > first) {
                    second = nums[i];
                } else if (nums[i] < first) {
                    first = nums[i];
                }
            }
        } 

        return false;
    }
}
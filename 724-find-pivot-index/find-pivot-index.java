class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int n : nums) {
            rightSum += n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (rightSum - nums[i] == leftSum) return i;
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return -1;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int l, r;
        for (l = 0, r = 1; r < nums.length; r++) {
            if (nums[l] != 0) {
                l++;
            } else if (nums[r] != 0) {
                nums[l++] = nums[r];
                nums[r] = 0;
            }
        }
    }
}
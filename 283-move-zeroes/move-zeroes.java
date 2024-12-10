class Solution {
    public void moveZeroes(int[] nums) {
        int l, r, temp;
        for (l = 0, r = 1; r < nums.length; r++) {
            if (nums[l] != 0) {
                l++;
            } else if (nums[r] != 0) {
                temp = nums[r];
                nums[r] = nums[l];
                nums[l++] = temp;
            }
        }
    }
}
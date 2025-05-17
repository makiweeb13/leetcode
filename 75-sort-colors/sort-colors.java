class Solution {
    public void sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i], j = i;
            for ( ; j > 0 && nums[j-1] > temp; j--) {
                nums[j] = nums[j-1];
            }
            nums[j] = temp;
        }
    }
}
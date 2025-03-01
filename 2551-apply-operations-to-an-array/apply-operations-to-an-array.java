class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length-1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            int j = i;
            while (nums[j] == 0 && j < n) {
                j++;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        
        return nums;
    }
}
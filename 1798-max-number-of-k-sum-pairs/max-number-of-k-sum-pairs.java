class Solution {
    public int maxOperations(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0, j = nums.length-1; i < j; ) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                res++;
                i++;
                j--;
            } else if (sum < k) {
                if (nums[i] < nums[j]) i++;
                else j--;
            } else {
                if (nums[i] > nums[j]) i++;
                else j--;
            }
        }
        return res;
    }
}
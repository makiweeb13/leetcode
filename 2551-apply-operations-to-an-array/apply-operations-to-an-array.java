class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length, j = 0, i;
        int[] res = new int[n];
        
        for (i = 0; i < n-1; i++) {
            if (nums[i] != 0) {
                if (nums[i] == nums[i+1]) {
                    res[j] = nums[i] * 2;
                    i++;
                } else {
                    res[j] = nums[i];
                } 
                j++;
            }
        }
        
        if (i < n) {
            res[j] = nums[n-1];
        }

        return res;
    }
}
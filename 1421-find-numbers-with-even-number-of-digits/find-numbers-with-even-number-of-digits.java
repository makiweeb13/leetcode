class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i], count = 0;

            while (n > 0) {
                n /= 10;
                count++;
            }

            if (count%2 == 0) res++;
        }

        return res;
    }
}
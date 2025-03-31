class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1, mid;

        while (l <= r) {
            mid = l + (r-l) / 2;
            if (nums[mid] > 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        int pos = n-l;

        l = 0;
        r = n-1;

        while (l <= r) {
            mid = l + (r-l) / 2;
            if (nums[mid] < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        int neg = r+1;
        
        return Math.max(pos, neg);
    }
}
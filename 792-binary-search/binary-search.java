class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = (l+r)/2;
        while (l <= r && nums[mid] != target) {
            l = nums[mid] < target ? mid + 1 : l;
            r = nums[mid] > target ? mid - 1 : r;
            mid = (l+r)/2;
        }
        return l > r ? -1 : mid;
    }
}
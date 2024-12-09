class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        int n = 0;
        for (int i = 0; i < nums.length && n == 0; i++) {
            majority.put(nums[i], majority.containsKey(nums[i]) ? majority.get(nums[i]) + 1 : 1);
            if (majority.get(nums[i]) > (nums.length/2)) n = nums[i];
        }
        return n;
    }
}
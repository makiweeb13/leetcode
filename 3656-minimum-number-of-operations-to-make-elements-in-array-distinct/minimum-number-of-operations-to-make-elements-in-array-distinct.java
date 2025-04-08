class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> dist = new HashMap<>();
        int i;
        for (i = nums.length-1; i >= 0; i--) {
            if (dist.containsKey(nums[i])) break;
            dist.put(nums[i], dist.getOrDefault(nums[i], 1));
        }
        return (i+3)/3;
    }
}
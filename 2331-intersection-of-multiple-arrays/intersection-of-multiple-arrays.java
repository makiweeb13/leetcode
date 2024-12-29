class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                num.put(nums[i][j], num.get(nums[i][j]) == null ? 1 : num.get(nums[i][j])+1);
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        num.forEach((k, v) -> {
            if (v >= nums.length) res.add(k);
        });
        res.sort(null);
        return res;
    }
}
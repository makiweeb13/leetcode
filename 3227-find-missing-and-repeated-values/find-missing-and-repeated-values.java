class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        int[] ans = new int[2];
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (nums.containsKey(num)) ans[0] = num;
                nums.put(num, null);
            }
        }
        
        n *= n;
        for (int i = 1; i <= n; i++) {
            if (!nums.containsKey(i)) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> row = new HashMap<>(), col = new HashMap<>();
        int n = grid.length, res = 0;

        for (int i = 0; i < n; i++) {
            StringBuilder rowKey = new StringBuilder(), colKey = new StringBuilder();
            for (int j = n-1; j >= 0; j--) {
                rowKey.append("_" + String.valueOf(grid[i][j]));
                colKey.append("_" + String.valueOf(grid[j][i]));
            }
            String rk = rowKey.toString(), ck = colKey.toString();
            row.put(rk, row.getOrDefault(rk, 0)+1);
            col.put(ck, col.getOrDefault(ck, 0)+1);
        }

        for (String i : row.keySet()) {
            if (col.containsKey(i)) res += row.get(i) * col.get(i);
        }

        return res;
    }
}
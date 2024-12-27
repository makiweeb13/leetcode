class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length, max = 0;
        int[] leftMax = new int[n];
        leftMax[0] = values[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, leftMax[i - 1] + (values[i] - i));
            leftMax[i] = Math.max(values[i] + i, leftMax[i - 1]);
        }
        return max;
    }
}
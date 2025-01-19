class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, alt = 0;
        for (int n : gain) {
            alt += n;
            max = Math.max(max, alt);
        }
        return max;
    }
}
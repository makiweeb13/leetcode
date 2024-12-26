class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int count = 0, num = i;
            while (num > 0) {
                count += num % 2;
                num /= 2;
            }
            bits[i] = count;
        }
        return bits; 
    }
}
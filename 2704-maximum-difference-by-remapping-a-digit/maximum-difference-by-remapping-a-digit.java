class Solution {
    public int minMaxDifference(int num) {
        int[] place = new int[9];
        int x = 0, n, d1, d2;

        while (num > 0) {
            int d = num%10;
            place[x++] = d;
            num /= 10;
        }

        n = x;
        while (n > 0 && place[--n] == 9);
        d1 = place[n];
        d2 = place[x-1];

        int maxVal = 0, minVal = 0;
        for (int i = x-1; i >= 0; i--) {
            int multiplier = (int)Math.pow(10, i);
            if (place[i] == d1) {
                maxVal += 9 * multiplier;
            } else {
                maxVal += place[i] * multiplier;
            }
            if (place[i] != d2) {
                minVal += place[i] * multiplier; 
            } 
        }
        
        return maxVal - minVal;
    }
}
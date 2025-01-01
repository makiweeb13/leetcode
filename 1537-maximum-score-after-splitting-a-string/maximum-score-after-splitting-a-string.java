class Solution {
    public int maxScore(String s) {
        int zero = 0, one = 0, max = 0, i = 0; 
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                one++;
            }
            i++;
        }
        
        i = 0;
        while (i < s.length()-1) {
            if (s.charAt(i) == '0') {
                zero++;
            } else if (one > 0) {
                one--;
            }
            max = Math.max(max, zero + one);
            i++;
        }
        return max;
    }  
}
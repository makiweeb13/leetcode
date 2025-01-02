class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i = 1;
        while (i <= s.length()/2) {
            String copy = s.substring(i).concat(s.substring(0, i));
            if (copy.equals(s)) return true;
            i++;
        }
        return false;
    }
}
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) return "";
        return str2.substring(0, gcd(str1.length(), str2.length()));
    }

    public int gcd(int x, int y) {
        int n = x%y;
        while (n > 0) {
            x = y;
            y = n;
            n = x%n;
        }
        return y;
    }
}
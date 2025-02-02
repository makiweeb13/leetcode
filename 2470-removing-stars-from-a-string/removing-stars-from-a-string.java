class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                str.deleteCharAt(str.length()-1);
            } else {
                str.append(s.charAt(i));
            }
        }
        return new String(str);
    }
}
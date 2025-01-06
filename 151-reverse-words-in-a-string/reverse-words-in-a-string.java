class Solution {
    public String reverseWords(String s) {
        String[] sep = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for (String word : sep) {
            str.insert(0, word + " ");
        }
        return str.toString().trim();
    }
}
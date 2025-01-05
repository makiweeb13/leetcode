class Solution {
    public String reverseVowels(String s) {
        String vowels = "aieouAEIOU";
        int n = s.length();
        char[] con = new char[n];
        LinkedList<Character> vow = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) con[i] = s.charAt(i);
            else vow.add(s.charAt(i));
        }

        for (int i = 0; !vow.isEmpty(); i++) {
            if (con[i] == '\u0000') con[i] = vow.removeLast();
        }

        return new String(con);
    }
}
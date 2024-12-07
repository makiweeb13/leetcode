class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> toReplace = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (!toReplace.containsKey(s.charAt(i)) && toReplace.containsValue(t.charAt(i))) {
                    return false;
                }
                toReplace.put(s.charAt(i), t.charAt(i));
            }
        }

        char[] new_s = s.toCharArray();
        for (int i = 0; i < new_s.length; i++) {
            if (new_s[i] == t.charAt(i) && toReplace.containsValue(new_s[i])) {
                return false;
            }
            if (toReplace.containsKey(new_s[i])) {
                new_s[i] = toReplace.get(new_s[i]);
            }
        }

        return t.equals(String.valueOf(new_s));
    }
}
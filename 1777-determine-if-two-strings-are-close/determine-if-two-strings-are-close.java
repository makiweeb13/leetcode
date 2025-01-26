class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> freq1 = new HashMap<>(), freq2 = new HashMap<>(); 
        for (int i = 0; i < word1.length(); i++) {
            freq1.put(word1.charAt(i), freq1.getOrDefault(word1.charAt(i), 0) + 1);
            freq2.put(word2.charAt(i), freq2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        HashSet<Character> comChar = new HashSet<>(freq2.keySet());
        LinkedList<Integer> comInt = new LinkedList<>(freq2.values());
        
        for (Integer n : freq1.values()) {
            comInt.remove(n);
        }

        for (Character c : freq1.keySet()) {
            comChar.remove(c);
        }

        return comInt.size() == 0 && comChar.size() == 0 ? true : false;
    }
}
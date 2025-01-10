class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<String, Integer> freq = new HashMap<>();
        for (String s : words2) {
            HashMap<String, Integer> count = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                String key = String.valueOf(s.charAt(i));
                int n = count.get(key) == null ? 1 : count.get(key)+1;
                count.put(key, n);
            }
            for (String i : count.keySet()) {
                int n = freq.get(i) == null ? 1 : freq.get(i);
                freq.put(i, Math.max(n, count.get(i)));
            }
        }
        ArrayList<String> res =  new ArrayList<>();
        for (String s : words1) {
            HashMap<String, Integer> count = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                String key = String.valueOf(s.charAt(i));
                int n = count.get(key) == null ? 1 : count.get(key)+1;
                count.put(key, n);
            }
            int match = 0;
            for (String i : freq.keySet()) {
                if (count.get(i) != null && count.get(i) >= freq.get(i)) match++;
            }
            if (match == freq.size()) {
                res.add(s);
            }
        }
        return res;
    }
}
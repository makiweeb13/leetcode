class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            end = Math.max(end, lastIndex.get(c));
            if (i == end) {
                res.add(end - start + 1);
                start = i+1;
            }
        }
        return res;
    }
}
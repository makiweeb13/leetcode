class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        ArrayList<Integer> res = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            end = Math.max(end, lastIndex[c - 'a']);
            if (i == end) {
                res.add(end - start + 1);
                start = i+1;
            }
        }
        return res;
    }
}
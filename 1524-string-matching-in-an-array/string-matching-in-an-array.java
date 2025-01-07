class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i && words[j].contains(words[i])) {
                    res.add(words[i]);
                    j = n;
                }
            }
        }
        return res;
    }
}
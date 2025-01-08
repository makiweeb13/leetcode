class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0, n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j]) && j != i)
                    count++;
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1) ? true : false;
    }
}
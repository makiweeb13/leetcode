class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            count.put(key, count.getOrDefault(key, 0)+1);
        }

        int oddCount = 0;
        for (String key : count.keySet()) {
            if (count.get(key)%2 != 0) oddCount++;
        }
        if (oddCount > k) return false;
        
        return true;
    }
}
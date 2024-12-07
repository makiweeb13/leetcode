class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> distinctStr = new LinkedHashMap<>();
        int i = 1;

        for (String str : arr) {
            distinctStr.put(str, distinctStr.get(str) == null ? 1 : distinctStr.get(str) + 1);
        }

        for (String key : distinctStr.keySet()) {
            if (distinctStr.get(key) == 1) {
                if (i == k) return key;
                else i++;
            }
        }
        
        return "";
    }
}
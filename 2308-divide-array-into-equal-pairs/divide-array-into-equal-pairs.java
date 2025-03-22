class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }
        for (int n : counter.keySet()) {
            if (counter.get(n)%2 != 0) return false;
        }
        return true;
    }
}
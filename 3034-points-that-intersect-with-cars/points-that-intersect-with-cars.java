class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> res = new HashSet<>();
        for (List<Integer> n : nums) {
            for (int i = n.get(0); i <= n.get(1); i++) res.add(i);
        }
        return res.size();
    }
}
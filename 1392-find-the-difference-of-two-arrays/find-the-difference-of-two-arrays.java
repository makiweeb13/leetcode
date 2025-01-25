class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> dist1 = new HashMap<>(), dist2 = new HashMap<>();
        for (int i : nums1) {
            dist1.put(i, null);
        }
        for (int i : nums2) {
            dist2.put(i, null);
        }
        
        List<Integer> n = new ArrayList<>(), m = new ArrayList<>();
        for (Integer i : dist1.keySet()) {
            if (!dist2.containsKey(i)) n.add(i);
        }
        for (Integer i : dist2.keySet()) {
            if (!dist1.containsKey(i)) m.add(i);
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(n);
        res.add(m);

        return res; 
    }
}
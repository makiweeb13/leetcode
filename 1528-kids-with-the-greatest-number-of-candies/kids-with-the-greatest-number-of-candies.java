class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0, n = candies.length;
        for (int i = 0; i < n; i++) {
            max = candies[i] > max ? candies[i] : max;
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
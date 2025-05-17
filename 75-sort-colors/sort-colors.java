class Solution {
    public void sortColors(int[] nums) {
        int[] countArray = new int[3];
        for (int i = 0; i < nums.length; i++) {
            countArray[nums[i]]++;
        }
        
        int n = 0;
        for (int i = 0; i < 3; i++) {
            while (countArray[i] > 0) {
                nums[n++] = i;
                countArray[i]--;
            } 
        }
    }
}
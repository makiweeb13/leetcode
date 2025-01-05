class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean validPos = true;
        if (flowerbed[0] == 0 && flowerbed.length == 1) n--;
        for (int i = 0; i < flowerbed.length-1 && n > 0; i++) {
            if (flowerbed[i] == 1) {
                validPos = false;
            } else if (validPos && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                validPos = false;
                n--;
            } else if (!validPos && flowerbed[i+1] == 0 && i+2 == flowerbed.length) {
                validPos = false;
                n--;
            } else {
                validPos = true;
            }
        }
        return n < 1 ? true : false;
    }
}
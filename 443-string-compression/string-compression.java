class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();

        int count = 1;
        char curr = chars[0];
        str.append(curr);
        
        for (int i = 1; i < chars.length; ) {
            if (curr == chars[i]) {
                count++;
                i++;
            } else {
                if (count > 1) str.append(String.valueOf(count));
                curr = chars[i];
                str.append(String.valueOf(curr));
                count = 0;   
            }
        }

        if (count > 1) str.append(String.valueOf(count));
        
        int i = 0;
        for ( ; i < chars.length && i < str.length(); i++) {
           chars[i] = str.charAt(i);
        }

        return i;
    }
}
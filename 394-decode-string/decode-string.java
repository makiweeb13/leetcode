class Solution {
    public String decodeString(String s) {
        Stack<Integer> n = new Stack<>();
        Stack<String> encoded = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            if (Character.isDigit(s.charAt(i))) {
                str.append(s.charAt(i));
                while (Character.isDigit(s.charAt(++i))) {
                    str.append(s.charAt(i));
                }
                i--; 
                n.push(Integer.valueOf(str.toString()));
            } else if (s.charAt(i) == '[') {
                while (Character.isLetter(s.charAt(++i))) {
                    str.append(s.charAt(i));
                }
                encoded.push(str.toString());
                i--;
            } else if (s.charAt(i) == ']') {
                if (!n.isEmpty() && !encoded.isEmpty()) {
                    int k = n.pop();
                    String c = encoded.pop();
                    while (k > 0) {
                        str.append(c);
                        k--;
                    }
                    if (!encoded.isEmpty()) {
                        str.insert(0, encoded.pop());
                        encoded.push(str.toString());
                    }
                    else res.append(str);
                }
            } else {
                if (encoded.isEmpty()) {
                    res.append(s.charAt(i));
                } else {
                    str.append(encoded.pop());
                    str.append(s.charAt(i));
                    encoded.push(str.toString());
                }   
            }
        }

        return res.toString();
    }
}
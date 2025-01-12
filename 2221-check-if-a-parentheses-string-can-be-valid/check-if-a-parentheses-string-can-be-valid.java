class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length()%2 != 0) return false;

        Stack<Integer> pLeft = new Stack<>(), unlocked = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                unlocked.push(i);
            } else if ((s.charAt(i) == '(' && locked.charAt(i) == '1')) {
                pLeft.push(i);
            } else if (s.charAt(i) == ')' && locked.charAt(i) == '1') {
                if (!pLeft.isEmpty()) {
                    pLeft.pop();
                } else if (!unlocked.isEmpty()) {
                    unlocked.pop();
                } else {
                    return false;
                }
            } 
        }

        while (!pLeft.isEmpty() && !unlocked.isEmpty() && pLeft.peek() < unlocked.peek()) {
            pLeft.pop();
            unlocked.pop();
        }

        return pLeft.isEmpty();
    }
}
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();
        ast.push(asteroids[0]);

        for (int i = 1; i < asteroids.length; i++) {
            int curr = asteroids[i];
            while (!ast.isEmpty() && ast.peek() > 0 && curr < 0) {
                int last = ast.pop(), a = Math.abs(last), b = Math.abs(curr);
                if (a == b) {
                    curr = 0;
                } else if (a > b) {
                    curr = last;
                }
            }
            if (curr != 0) ast.push(curr);             
        }

        int n = ast.size();
        int[] res = new int[n];

        while (!ast.isEmpty()) {
            res[--n] = ast.pop(); 
        }

        return res;
    }
}
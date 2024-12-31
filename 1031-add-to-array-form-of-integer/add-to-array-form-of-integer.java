import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        StringBuilder stringNum = new StringBuilder();

        for (int n : num) {
            stringNum.append(n);
        }

        BigInteger intNum = new BigInteger(stringNum.toString());
        String sum = intNum.add(BigInteger.valueOf(k)).toString();

        for (int i = sum.length()-1; i >= 0; i--) {
            res.push(Integer.parseInt(String.valueOf(sum.charAt(i))));
        }
        
        return res;
    }
}
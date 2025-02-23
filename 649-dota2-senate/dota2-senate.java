class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> q = new LinkedList<>();
        int R = 0, D = 0;
        char party = '\u0000';

        for (int i = 0; i < senate.length(); i++) {
            party = senate.charAt(i);
            if (party == 'R') R++;
            else D++;
            q.add(party);
        }

        while(q.size() > 1 && R > 0 && D > 0) {
            party = q.poll();
            q.add(party);
            if (party == 'R') {
                q.remove('D');
                D--;
            } else {
                q.remove('R');
                R--;
            }
        }

        return q.poll() == 'R' ? "Radiant" : "Dire";
    }
}
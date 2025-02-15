class RecentCounter {

    LinkedList<Integer> counter;
    int mil = 3000;

    public RecentCounter() {
        this.counter = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.counter.add(t);
        int res = 0, min = t - mil;
        for (Integer m : counter) {
            if (m >= min && m <= t) res++;
        }
        return res;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
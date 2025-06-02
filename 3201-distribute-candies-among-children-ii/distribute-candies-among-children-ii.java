class Solution {
    public long distributeCandies(int n, int limit) {
        long ways = 0;
        int minchild1 = Math.max(0, n - 2 * limit);
        int maxchild1 = Math.min(n, limit);
        for (int i = minchild1; i <= maxchild1; i++) {
            int rem = n - i;
            int minchild2 = Math.max(0, rem - limit);
            int maxchild2 = Math.min(rem, limit);
            ways += (maxchild2 - minchild2 + 1);
        }
        return ways;
    }
}

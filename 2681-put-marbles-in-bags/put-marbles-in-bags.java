class Solution {
    public long putMarbles(int[] w, int k) {
        int n = w.length;
        int[] p = new int[n - 1];
        for (int i = 0; i < n - 1; ++i) {
            p[i] = w[i] + w[i + 1];
        }
        Arrays.sort(p, 0, n - 1);
        long ans = 0l;
        for (int i = 0; i < k - 1; ++i) {
            ans += p[n - 2 - i] - p[i];
        }
        return ans;
    }
}

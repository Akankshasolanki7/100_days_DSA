class Solution {
    /**
     * Returns the maximum total free time you can accumulate by skipping up to k events
     * (which merges k+1 consecutive free gaps).
     *
     * @param eventTime total duration (e.g. of the day)
     * @param k         number of whole events you may skip
     * @param startTime array of event start times (ascending)
     * @param endTime   array of event end times   (ascending)
     * @return          maximum merged free-time duration
     */
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;

        // 1) Build array of free gaps
        int[] freeArray = new int[n + 1];
        freeArray[0] = startTime[0];  // gap from time 0 to first event
        for (int idx = 1; idx < n; idx++) {
            freeArray[idx] = startTime[idx] - endTime[idx - 1];
        }
        freeArray[n] = eventTime - endTime[n - 1];  // gap after the last event

       int i = 0;
        int j = 0;
        int maxSum = 0;
        int currSum = 0;

        int m = freeArray.length;

        while (j < m) {
            // include gap at j
            currSum += freeArray[j];

            // if window size exceeds k+1, remove gap at i and advance i
            if (j - i + 1 > k + 1) {
                currSum -= freeArray[i];
                i++;
            }

            // update maxSum
            maxSum = Math.max(maxSum, currSum);
            j++;
        }

        return maxSum;
    }
}
    
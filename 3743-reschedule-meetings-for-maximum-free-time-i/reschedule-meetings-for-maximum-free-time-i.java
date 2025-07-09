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

        // 2) Sliding window with pointers i (window start) and j (window end)
        int maxSum = 0;
        int currSum = 0;
        int i = 0;  // left pointer

        for (int j = 0; j < freeArray.length; j++) {
            currSum += freeArray[j];             // include the j-th gap

            // If window size > (k+1), move i forward
            if (j - i + 1 > k + 1) {
                currSum -= freeArray[i];
                i++;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}

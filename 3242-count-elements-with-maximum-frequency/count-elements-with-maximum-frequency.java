class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        int maxfreq=0;
        int total=0;
        for(int num:nums){
              arr[num]++;
            int freq = arr[num];
            if (freq > maxfreq) {
                maxfreq = freq;
                total = freq;
            } else if (freq == maxfreq) {
                total += freq;
            }
        }
        return total;
        }
    }

class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        int [] freq=new int[26];
        for(int i=0;i<n;i++){
          freq[s.charAt(i)-'a']++;
        }
        int maxodd=0;
        int mineven=n+1;
        for(int i=0;i<26;i++){
            if(freq[i]==0)  continue;
            if(freq[i]%2==0){
                mineven=Math.min(mineven,freq[i]);
            }
            else{
                maxodd=Math.max(maxodd,freq[i]);
            }
        }
        return maxodd-mineven;
    }
}
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<n){
            int j=(i+k-1>=n)?n-1 :(i+k-1);
            String temp=s.substring(i,j+1);
            if(j-i+1<k){
                int remain=k-(j-i+1);
                  StringBuilder sb = new StringBuilder(temp);
                      while (sb.length() < k) {
                sb.append(fill);
            }
            temp = sb.toString();

            }
               ans.add(temp);
            i += k;
        }
           return ans.toArray(new String[0]);
    }
}
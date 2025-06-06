class Solution {
    public boolean isAnagram(String s, String t) {
        //  char [] sarray=s.toCharArray();
        //  char [] tarray=t.toCharArray();
        //  Arrays.sort(sarray);
        //  Arrays.sort(tarray);
        //  return Arrays.equals(sarray,tarray);
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // int[] charcounts=new int[26];
        // for(int i=0;i<s.length();i++){
        //     charcounts[s.charAt(i)-'a']++;
        //     charcounts[t.charAt(i)-'a']--;
        // }
        // for(int count:charcounts){
        //     if(count!=0){
        //         return false;
        //     }
        // }
        // return true;




        if(s.length()!=t.length()){
            return false;
        }
        int [] charfreq= new int[26];
        for(int i=0;i<s.length();i++){
            charfreq[s.charAt(i)-'a']++;
            charfreq[t.charAt(i)-'a']--;
        }
        for(int count:charfreq){
            if(count!=0){
                return false;
            }
        }
        return  true;
    }
}
     
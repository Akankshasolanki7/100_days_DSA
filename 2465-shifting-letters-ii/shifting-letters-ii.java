class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
       int n=s.length();
       //step 1-make the  difference array of size 
       int[] diff=new int[n];
       //populate the difference array
       for(int shift[]:shifts){
        int start=shift[0];
        int end=shift[1];
        int direction=shift[2];
       
       if(direction==1){ //forward shift
         diff[start]+=1;
         if(end+1<n){
            diff[end+1]-=1;
         }
       }
        else{
        diff[start]-=1;
        if(end+1<n){
            diff[end+1]+=1;
        }
       }
       }
       //step2:find cumulative sum
       for(int i=1;i<n;i++){
        diff[i]+=diff[i-1];
       }
       //applying the shift/change
       StringBuilder result=new StringBuilder(s);
       for(int i=0;i<n;i++){
         int shift=diff[i]%26;
         if(shift<0){
            shift+=26;
         }
       // Apply the shift to character
     char newChar = (char) (((result.charAt(i) - 'a' + shift) % 26) + 'a');
    result.setCharAt(i, newChar);
       }
     return result.toString();

    }
}
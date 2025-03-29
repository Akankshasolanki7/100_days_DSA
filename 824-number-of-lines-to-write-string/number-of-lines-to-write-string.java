class Solution {
    public int[] numberOfLines(int[] widths, String s) {
       int line=1;
       int count=0;
       for(int i=0;i<s.length();i++){
        int place=s.charAt(i)-'a';
        count+=widths[place];
        if(count>100){
            line++;
            count=widths[place];
        }
       }
       return new int[]{line ,count};
    }
}
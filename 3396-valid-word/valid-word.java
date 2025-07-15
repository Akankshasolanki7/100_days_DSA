class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean istrue=false;
        boolean isfalse=false;
        for(int ch:word.toCharArray()){
             if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')        {
                    istrue=true;
                }
                else {
                    isfalse=true;
                }
             }
             else if(!Character.isDigit(ch)){
                return false;
             }
        }
        return istrue && isfalse;
    }
}
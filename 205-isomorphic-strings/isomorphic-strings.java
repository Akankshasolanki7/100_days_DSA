class Solution {
    public boolean isIsomorphic(String s, String t) {
    //     if(s.length() != t.length()){
    //         return false;
    //     }
    //     HashMap<Character,Character> add=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         if(!add.containsKey(s.charAt(i))){
    //              if(!add.containsValue(t.charAt(i))){        add.put(s.charAt(i),t.charAt(i));
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     else{
    //         if(add.get(s.charAt(i))!=t.charAt(i)){
    //             return false;
    //         }
    //     }
    // }
    // return true;
     //Using two unordered map
     Map<Character,Character> mp1=new HashMap<>();
     Map<Character,Character> mp2=new HashMap<>();
     int m=s.length();
     for(int i=0;i<m;i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        if(mp1.containsKey(ch1) && mp1.get(ch1)!=ch2 || mp2.containsKey(ch2)&&  mp2.get(ch2)!=ch1){
            return false;
        }
            mp1.put(ch1,ch2);
            mp2.put(ch2,ch1); 
             
        }
        return true;
    }
}
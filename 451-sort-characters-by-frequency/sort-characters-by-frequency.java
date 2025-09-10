class Solution {
    public String frequencySort(String s) {
      //Hashmap to count frequency
       Map<Character,Integer> mp=new HashMap<>();
       for(char ch:s.toCharArray()){
        mp.put(ch,mp.getOrDefault(ch,0)+1);
       }

       //store into list 
       List<Character> ls=new ArrayList<>(mp.keySet());
       //sort 
     Collections.sort(ls,(a,b)->mp.get(b)-mp.get(a));
     //store the  res into new 
     StringBuilder sb=new StringBuilder();
     for(char ch:ls){
        int freq=mp.get(ch);
        for(int i=0;i<freq;i++){
            sb.append(ch);
        }
     }
     return sb.toString();
    }
}

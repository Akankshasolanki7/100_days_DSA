class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       Set<Integer> st=new HashSet<>();
       List<Integer> ls=new ArrayList<>();
       for(int num:nums){
        if(!st.add(num)){
            ls.add(num);
        }
       } 
       return ls;
    }
}
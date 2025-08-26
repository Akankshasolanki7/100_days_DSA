class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> st=new HashSet<>();
       List<Integer> ls=new ArrayList<>();
       for(int num:nums){
            st.add(num);
       }
       for(int i=1;i<=nums.length;i++){
        if(!st.contains(i)){
            ls.add(i);
        }
       }
       return ls;
    }
}
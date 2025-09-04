class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
   
   Set<Integer> st1=new HashSet<>();
   Set<Integer> st2=new HashSet<>();
   for(int x:nums1){
    st1.add(x);
   }
   for(int y:nums2){
    if(st1.contains(y)){
        st2.add(y);
    }
   }
   int[] ans=new int[st2.size()];
   int i=0;
   for(int val:st2){
    ans[i++]=val;
   }
       return ans;

    }
}
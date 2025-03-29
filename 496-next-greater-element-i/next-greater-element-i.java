class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     int [] arr=new int[10001];
     Stack<Integer> s=new Stack<Integer>();
     for(int i=0;i<nums2.length;i++){
        while(!s.isEmpty() && nums2[i]>s.peek()){
            arr[s.pop()]=nums2[i];
        }
        s.push(nums2[i]);
     }
     int ans=-1;
     for(int i=0;i<nums1.length;i++){
        ans= arr[nums1[i]];
        if(ans==0){
            nums1[i]=-1;
        }
        else{
            nums1[i]=ans;
        }
     }
     return nums1;
    }
}
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
      int n=nums.length;
      //step :make difference array
      int[] diff=new int[n];
      for(int [] query:queries){
        int start=query[0];
        int end=query[1];
        int x=1;
        diff[start]+=x;
        if(end+1<n){
            diff[end+1]-=x;
        }
      }
      //cumulative sum array
      int [] result=new int[n];
      int cum=0;
      for(int i=0;i<n;i++){
        cum+=diff[i];
        result[i]=cum;
      }
      for(int i=0;i<n;i++){
        if(result[i]<nums[i]){
            return false;
        }
      }
      return true;
    }
}
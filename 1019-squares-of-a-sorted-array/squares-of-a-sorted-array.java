class Solution {
    public int[] sortedSquares(int[] nums) {
        // int n=nums.length;
        // int [] arr= new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=nums[i]*nums[i];

        // }
        // Arrays.sort(arr);
        // return arr;
   //Approach 2
   //using two pointer approach
     int n=nums.length;
     int [] arr=new int[n];
     int i=0;
     int j=n-1;
     int  k=n-1;
     while(k>=0){
        int a=nums[i]*nums[i];
        int b=nums[j]*nums[j];
        if(a>b){
            arr[k]=a;
            i++;
        }
        else{
            arr[k]=b;
            j--;
        }
        k--;
     }
     return arr;
    }
}
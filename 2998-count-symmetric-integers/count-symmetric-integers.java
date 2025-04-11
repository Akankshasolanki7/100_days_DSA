class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(i>=10 && i<=99 && i%11==0){
                count++;
            }
            else if(i>=1000 && i<=9999){
                int fourth=i/1000;
                int third=(i/100)%10;
                int second=(i/10)%10;
                int first=i%10;
                if(fourth+third==second+first){
                    count++;
                }
            }
        }
         return count;
    }
}

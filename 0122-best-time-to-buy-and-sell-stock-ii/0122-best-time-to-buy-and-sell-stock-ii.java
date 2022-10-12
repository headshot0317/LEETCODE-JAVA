class Solution {
    public int maxProfit(int[] a) {
        int max=a[0];int sum=0;
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>min){
                sum+=a[i]-min;
                min=a[i];
                max=a[i];
            }else if(a[i]<max){
                min=a[i];
                max=a[i];
            }
        }
        return sum;
    }
}
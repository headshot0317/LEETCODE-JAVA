class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index=0;int max=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int j=0;
        List<Integer> lis=new ArrayList<>();
        for(int i=k;i<arr.length;i++){
            if(Math.abs(arr[j]-x)>Math.abs(arr[i]-x)){
                j=i-k+1;
            }
      }      
        for(int i=0;i<k;i++){
            lis.add(arr[i+j]);
        }
        return lis;
    }
}
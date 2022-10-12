class Solution {
    public int maxScoreSightseeingPair(int[] a) {
       int a1[]=new int[a.length];
        int a2[]=new int[a.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
           max =Math.max(max,a[i]+i);
            a1[i]=max;
        }
         for(int i=0;i<a.length;i++){
            a2[i]=a[i]-i;
        }
        int j=1;int ans=0;
        for(int i=0;i<a.length-1;i++){
            ans=Math.max(ans,a1[i]+a2[j]);
            j++;
        }
        return ans;
    }
}
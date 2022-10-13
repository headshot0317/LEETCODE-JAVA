class Solution {
    public long score(int st,int end,int a[],long b[][]){
          if(st==end){
              return a[st];
          }
          if(st>end){
              return 0;
          }
        if(b[st][end]!=0){
            return b[st][end];
        }
        long c1=a[st]+Math.min(score(st+2,end,a,b),score(st+1,end-1,a,b));
        long c2=a[end]+Math.min(score(st+1,end-1,a,b),score(st,end-2,a,b));
        return b[st][end]=Math.max(c1,c2);
    }
    public boolean stoneGame(int[] a) {
        long sum=0;
      long b[][]=new long[a.length+2][a.length+2];
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        long ans=sum-score(0,a.length-1,a,b);
        if(ans>score(0,a.length-1,a,b)){
            return false;
        }else{
            return true;
        }
    }
  
}
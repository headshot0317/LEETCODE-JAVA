class Solution {
    public int coinChange(int[] c, int amount) {
       
       int dp[]=new int[amount+3]; 
       for(int i=1;i<dp.length;i++){
                dp[i]=-1;
       }
      dp[0]=0;
       for(int i=1;i<dp.length;i++){
           int min=Integer.MAX_VALUE;
           for(int j=0;j<c.length;j++){
               if(i-c[j]>=0){
                   if(dp[i-c[j]]!=-1&&dp[i-c[j]]<min){
                  dp[i]=Math.min(min,dp[i-c[j]])+1; 
                       min=Math.min(min,dp[i-c[j]]);
                   }
               }
           }
       }     
   return dp[amount];
    }
}
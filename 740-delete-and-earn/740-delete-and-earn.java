class Solution {
    public int deleteAndEarn(int[] nums) {
       int freq[]=new int[200000];
        Arrays.sort(nums);int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }else{
                freq[nums[i]]=c;
                c=1;
            }
        }
        freq[nums[nums.length-1]]=c;
        int dp[]=new int[100001];
        dp[0]=freq[1];
        dp[1]=Math.max(dp[0],freq[2]*2);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],(freq[i+1]*(i+1))+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}
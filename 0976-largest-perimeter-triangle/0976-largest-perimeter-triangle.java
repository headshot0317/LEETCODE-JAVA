class Solution {
    public int largestPerimeter(int[] nums) {
      int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+1]>nums[i+2]&&nums[i+1]+nums[i+2]>nums[i]&&nums[i]+nums[i+2]>nums[i+1]){
                ans=Math.max(nums[i]+nums[i+1]+nums[i+2],ans);
            }
        }
        return ans;
    }
}
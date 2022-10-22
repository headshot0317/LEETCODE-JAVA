class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=0;int max=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(-1*nums[i])){
                if(nums[i]>0)ans=nums[i];
                else if(nums[i]<0)ans=(-1*nums[i]);
                max=Math.max(ans,max);
            }
            set.add(nums[i]);
        }
       return max;
    }
}
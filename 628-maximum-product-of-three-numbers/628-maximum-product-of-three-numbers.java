class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
        int n=nums.length;
        int p1=nums[0]*nums[1]*nums[2];
        int p2=nums[n-1]*nums[n-2]*nums[n-3];
        int p3=nums[0]*nums[1]*nums[n-1];
      
        return Math.max(p1,Math.max(p3,p2));
    }
}
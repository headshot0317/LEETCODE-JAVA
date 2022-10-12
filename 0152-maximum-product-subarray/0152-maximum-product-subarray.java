class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
    
    int curMax=1;
    int curMin=1;
    int result=0;
    
    for(int num : nums){
        if(num==0){
            curMax=1;
            curMin=1;
            continue;
        }
        int temp = curMax*num;
        curMax = Math.max(Math.max(temp,curMin*num),num);
        curMin= Math.min(Math.min(temp,curMin*num),num);
        result= Math.max(result,curMax);
    
    }
    
    return result;
    }
}
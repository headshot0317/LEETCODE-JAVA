class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int a[]=new int[2];int sum=0;
        for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
                a[0]=nums[i];
           }
            sum+=nums[i];
        }
       sum-=a[0];
        sum+=nums[nums.length-1];
        a[1]=((nums.length*(nums.length+1))/2)-sum;
        System.out.println(sum);
        return a;
    }
}
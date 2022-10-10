class Solution {
    public int subarraySum(int[] nums, int k) {
         int sum=0;int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(sum,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int find=sum-k;
            if(map.containsKey(find)){
                count+=map.get(find);
            }
                map.put(sum,map.getOrDefault(sum,0)+1); 
            
        }
        return count;
    }
}
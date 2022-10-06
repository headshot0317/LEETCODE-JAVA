class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i])&&map.get(nums[i])>0&&map.get(k-nums[i])>0){
                if(map.get(nums[i])==1&&map.get(k-nums[i])==1&&nums[i]==k-nums[i]){
                    continue;
                }else{
                    map.put(nums[i],map.get(nums[i])-1);
                map.put(k-nums[i],map.get(k-nums[i])-1);
                count++;
                }
            }
        }
        return count;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;int i1=0;int i2=0;
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<l;i++){
        if(map.containsKey(nums[i])){
          map.put(nums[i],map.get(nums[i])+1);
        }else{
          map.put(nums[i],1);
        }
      }
      int a=0;
      for(int i=0;i<l;i++){
        if(map.containsKey(target-nums[i])){
          if((target-nums[i])==nums[i]){
            if(map.get(nums[i])>1){
              i1=i;a=nums[i];break;
            }
          }else{
           i1=i;
           a=target-nums[i];break;
         }         
        }
      }
        for(int i=0;i<l;i++){
          if(a==nums[i]&&i!=i1){
            i2=i;break;
          }
        }
      int b[]={i1,i2};
      return b;
    }
}
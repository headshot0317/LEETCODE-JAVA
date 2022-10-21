class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Set<Integer> set = new HashSet<Integer>();
     
            for(int j = 0 ; j <nums.length ; j++){
			
                if( j > k ) set.remove( nums[j-k-1] );
				
                if( !set.add(nums[j]) ){
				
                   return true;
                 
                }
            }
      
    return false;
    }
}
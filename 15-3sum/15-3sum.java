class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       Set<List<Integer>> set=new HashSet<>();
      int l=nums.length;
       for (int i = 0; i < nums.length - 2; i++) {
             //to avoid duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
              
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];

                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        ArrayList < Integer > temp = new ArrayList < > ();
                        temp.add(nums[i]);
                        temp.add(nums[lo]);
                        temp.add(nums[hi]);
                        set.add(temp);

                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;

                    else hi--;
                }
            }
        }
      List<List<Integer>> ans=new ArrayList<>(set);
      return ans; 
    }
}
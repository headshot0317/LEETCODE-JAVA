class Solution {
    public int minSteps(String s, String t) {
         HashMap<Character , Integer> map=new HashMap<>();
        for(char c : s.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        
        for(char c: t.toCharArray())map.put(c,map.getOrDefault(c,0)-1);
        
        int ans=0;
        
        for(char c:map.keySet()){
            if(map.get(c)>0)ans+=map.get(c);
        }
        return ans;
    }
}
class Solution {
    public int countAsterisks(String s) {
        int n=s.length();int c=0;int ans=0;
      for(int i=0;i<n;i++){
          if(c%2==0&&s.charAt(i)=='*'){
            ans++;
          }else if(s.charAt(i)=='|'){
              c++;
          }
      }
      return ans;
      
    }
}
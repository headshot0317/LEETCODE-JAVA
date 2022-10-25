class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String s1=word1.toString();
      String s2=word2.toString();
      StringBuffer sb1 = new StringBuffer();
      for(int i = 0; i < word1.length; i++) {
         sb1.append(word1[i]);
      }
      String str1 = sb1.toString();
         StringBuffer sb2 = new StringBuffer();
      for(int i = 0; i < word2.length; i++) {
         sb2.append(word2[i]);
      }
         String str2=sb2.toString();
        
      return str1.equals(str2);
    }
}
class Solution {
    public String defangIPaddr(String str) {
          String s="";
        
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='.'){
               s=s+"[.]";             
           }else{
               s=s+str.charAt(i);
           }
       }
        return s;
    }
}
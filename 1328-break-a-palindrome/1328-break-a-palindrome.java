class Solution {
    public String breakPalindrome(String str) {
     String ans="";
        if(str.length()==1){
            return ans;
        }
        char s[]=str.toCharArray();
        int flag=0;int ind=0;
        for(int i=0;i<str.length();i++){
            if(s[i]!='a'){
                s[i]='a';
                flag=1;ind=i;
                break;
            }
        }
        if(flag==0){
            s[str.length()-1]='b';
        }
        int flag1=0;
        for(int i=0;i<s.length-1;i++){
            if(s[i]!=s[i+1]){
                flag1=1;
            }
        }
        if(flag1==0){
            for(int i=0;i<str.length();i++){
                if(i==ind){
                    s[i]='b';
                }
            }
        }
        if(flag1==0){
            s[s.length-1]='b';
        }
        String ans1="";
        for(int i=0;i<s.length;i++){
            ans1+=s[i];
        }
        String ans3="a";  
        if(ans1.length()==3&&str.charAt(0)=='a'){
            ans3+=str.charAt(1);
            ans3+='b';
            return ans3;
        }
        return ans1;   
    }
}
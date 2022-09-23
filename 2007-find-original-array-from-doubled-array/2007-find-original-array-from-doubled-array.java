class Solution {
    public int[] findOriginalArray(int[] a) {
        Map<Integer,Integer> h1=new HashMap<>();
        List<Integer> lis=new ArrayList<>();
        for(int i=0;i<a.length;i++){            
           h1.put(a[i],h1.getOrDefault(a[i],0)+1); 
        }
   
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(h1.containsKey(a[i]*2)&&    (h1.get(a[i]*2)>0)&&h1.get(a[i])>0&&a[i]!=a[i]*2){                
                lis.add(a[i]);
                h1.put(a[i]*2,h1.get(a[i]*2)-1);
                 h1.put(a[i],h1.get(a[i])-1);
            }
           
        }int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c++;
                if(c%2==0){
                    lis.add(0);
                }
            }
        }
        int arr[]=new int[lis.size()];
        int ar[]=new int[0];
        if((lis.size()!=a.length/2)||(a.length%2)!=0){
            return ar;
        }else{
            for(int i=0;i<lis.size();i++){
                arr[i]=lis.get(i);
            }
            return arr;
        }
    }
}
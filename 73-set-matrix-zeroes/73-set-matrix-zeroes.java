class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        int rol=matrix.length;int cl=matrix[0].length;
        for(int i=0;i<rol;i++){
            for(int j=0;j<cl;j++){
                if(matrix[i][j]==0){
                    row.add(i);col.add(j);
                }
            }
        }
        for(int i=0;i<rol;i++){
            for(int j=0;j<cl;j++){
                if(row.contains(i)||col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
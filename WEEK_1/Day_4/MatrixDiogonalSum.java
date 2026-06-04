class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;      
        for(int i = 0; i<mat.length; i++){
           sum+=mat[i][i];
            
        }   
        int j = mat[0].length-1;
        for(int i =0; i<mat.length; i++){
            if(i!=j)sum+=mat[i][j];          
            j--;
        }
        return sum;       
    }
}
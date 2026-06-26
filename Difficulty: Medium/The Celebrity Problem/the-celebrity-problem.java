class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int i=0;
        int n=mat.length;
        int j=n-1;
        while(i<j){
            if(mat[i][j]==1){
                
                i++;
            }
            else{
                j--;
            }}
            
            int c=i;
            for(int l=0;l<=n-1;l++){
                if(mat[c][l]==1 && l!=i){
                    return -1;
                }
                if(mat[l][c]==0&l!=i){
                    return -1;
                }
            }
           return c; 
        }
    }

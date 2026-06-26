class Solution {
    public int celebrity(int mat[][]) {
        // code here
        /*int i=0;
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
           return c; */
           Stack<Integer>st=new Stack<>();
           for(int i=0;i<mat.length;i++){
               st.push(i);
           }
           while(st.size()>1){
               int a=st.peek();
               st.pop();
               int b=st.peek();
               st.pop();
               if(mat[a][b]==1){
                   st.push(b);
               }else{
                   st.push(a);
               }
               
           }
           int c=st.peek();
           st.pop();
           for(int i=0;i<mat.length;i++){
               if(i==c){
                   continue;
               }
               if(mat[c][i]==1 || mat[i][c]==0){
                   return -1;
               }
           }
          return c; 
        }
    }

class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;//rows
        int m=matrix[0].length;//cols

        boolean firstrow=false;
        boolean firstcol=false;

        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                firstcol=true;
                break;
            }
        }
    
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                firstrow=true;
                break;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }

            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }

            }
        }
    
        if(firstrow){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
    
        if(firstcol){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    
    
    }
}
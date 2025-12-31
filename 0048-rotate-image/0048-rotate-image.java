class Solution {
    public void rotate(int[][] matrix) {
        
        int edge_length=matrix.length;

        int top=0,bottom=edge_length-1;

        while(top<bottom){
            for(int col=0;col<edge_length;col++){
                int temp=matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col]=temp;
            }
            bottom--;
            top++;
        }

        for(int row=0;row<edge_length;row++){
            for(int col=row+1;col<edge_length;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;
        int top=0,bottom=rows-1;
        int left=0,right=cols-1;
        List<Integer> res=new ArrayList<>();

        while(top<=bottom && left<=right){
        //right
        for(int i=left;i<=right;i++){
            res.add(matrix[top][i]);
        }
        top++;

        //bottom
        for(int i=top;i<=bottom;i++){
            res.add(matrix[i][right]);
        }
        right--;

        if(top<=bottom){

        //left
        for(int i=right;i>=left;i--){
            res.add(matrix[bottom][i]);
        }
        bottom--;
        }

        if(left<=right){
            
        //up
        for(int i=bottom;i>=top;i--){
            res.add(matrix[i][left]);
        }
        left++;
        }
        }
        return res;
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int i0 = 0,j0 = 0;
        int i1 = n-1,j1 = m-1;
        while(i0<=i1 && j0<=j1){
            for(int j=j0;j<=j1;j++){
                list.add(matrix[i0][j]);
            }
            for(int i=i0+1;i<=i1;i++){
                list.add(matrix[i][j1]);
            }
            if(i0<i1){
                for(int j=j1-1;j>=j0;j--){
                    list.add(matrix[i1][j]);
                }
            }
            if(j0<j1){
                for(int i=i1-1;i>i0;i--){
                    list.add(matrix[i][j0]);
                }
            }
            i0++;
            j0++;
            i1--;
            j1--;
        }
        return list;
    }
}
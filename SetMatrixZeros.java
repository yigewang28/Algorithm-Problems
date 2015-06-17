public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null) return;
        int m = matrix.length;
        if(m <= 0) return;
        int n = matrix[0].length;
        if( n <= 0) return;
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> column = new ArrayList<Integer>();
        boolean[][] record = new boolean[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        
        int index = 0;
        while(index < row.size()) {
            int index0 = row.get(index);
            for(int k = 0; k < n; k++) {
                matrix[index0][k] = 0;
                record[index0][k] = true;
            }
            index ++;
        }
        index = 0;
        while(index < column.size()) {
            int index0 = column.get(index);
            for(int k = 0; k < m; k++) {
                if(!record[k][index0])
                    matrix[k][index0] = 0;
            }
            index ++;
        }
        
    }
}
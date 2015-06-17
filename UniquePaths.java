public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) return 1;
        int[][] record = new int[m][n];
        for(int i = 0; i < m; i++) record[i][0] = 1;
        for(int j = 0; j < n; j++) record[0][j] = 1;
        for(int k = 1; k < n; k++) {
            for(int g = 1; g < m; g++) {
                record[g][k] = record[g][k-1] + record[g-1][k];
            }
        }
        return record[m-1][n-1];
    }
}
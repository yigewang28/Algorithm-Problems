public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        //if(m == 1 || n == 1) return 1;
        int[][] record = new int[m][n];
        for(int i = 0; i < m; i++) {
            if(obstacleGrid[i][0] == 1) {
                record[i][0] = 0;
                for(int j = i + 1; j < m; j++)
                    record[j][0] = 0;
                break;
            }
            record[i][0] = 1;
        }
        for(int j = 0; j < n; j++) {
            
            if(obstacleGrid[0][j] == 1) {
                record[0][j] = 0;
                for(int i = j + 1; i < n; i++)
                    record[0][i] = 0;
                break;
            }
            record[0][j] = 1;
        }
        for(int k = 1; k < m; k++) {
            for(int g = 1; g < n; g++) {
                if(obstacleGrid[k][g] == 1) record[k][g] = 0;
                else record[k][g] = record[k-1][g] + record[k][g-1];
            }
        }
        return record[m-1][n-1];
    }
}
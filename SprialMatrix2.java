public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int pattern = 1;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        int top = 0;
        
        int i = 0;
        int j = 0;
        while(num <= n*n) {
            if(pattern == 1) {
                result[i][j] = num;
                j++;
                if(j == right) {
                    pattern = 2;
                    top++;
                }
            }else if(pattern == 2) {
                result[i][j] = num;
                i++;
                if(i == bottom) {
                    pattern = 3;
                    right--;
                }
            } else if(pattern == 3) {
                result[i][j] = num;
                j--;
                if(j == left) {
                    pattern = 4;
                    bottom--;
                }
            } else if(pattern == 4) {
                result[i][j] = num;
                i--;
                if(i == top) {
                    pattern = 1;
                    left++;
                }
            }
            num++;
        }
        return result;
    }
}
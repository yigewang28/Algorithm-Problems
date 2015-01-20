public class Solution {
    /*boolean result;
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        searchDms1(matrix, 0, matrix.length-1, target);
        return result;

    }

    public void searchDms1(int[][] matrix, int start1, int end1, int target)
    {
        int mid = (start1 + end1) / 2;
        if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1])
        {
            searchDms2(matrix[mid], 0, matrix[0].length-1, target);
            return;
        }
        if(start1 == end1) 
            return;
        if(target < matrix[mid][0])
            searchDms1(matrix, start1, mid, target);
        if(target > matrix[mid][matrix[0].length-1])
            searchDms1(matrix, mid+1, end1, target);

    }

    public void searchDms2(int[] array, int start, int end, int target)
    {
        int mid = (start + end) / 2;
        if(target == array[mid]) 
        {
            result = true;
            return;
        }

        if(start == end) 
        {
            result = false;
            return;
        }

        if(target < array[mid]) searchDms2(array, start, mid, target);
        else searchDms2(array, mid + 1, end, target);
    }
    */

    public boolean searchMatrix(int[][] matrix, int target)
    {
        return search(matrix, 0, matrix.length * matrix[0].length -1, target);
    }
    public boolean search(int[][] matrix, int start, int end, int target)
    {
        int mid = (start + end) / 2;
        if(target == matrix[mid/matrix[0].length][mid%matrix[0].length]) 
            return true;

        if(start == end) 
            return false;

        if(target < matrix[mid/matrix[0].length][mid%matrix[0].length]) return search(matrix, start, mid, target);
        else return search(matrix, mid + 1, end, target);
    }
}
public class SearchMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        
        int[] first = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++)
            first[i] = matrix[i][0];
        int num = search(first, target, 0, matrix.length-1);
        if(num == -1) return false;
        int[] second = new int[matrix[0].length];
        for(int j = 0; j < matrix[0].length; j++)
            second[j] = matrix[num][j];
        int num2 = search2(second, target, 0, matrix[0].length-1);
        if(num2 == -1) return false;
        else return true;
    }
    
    public int search(int[] array, int target, int start, int end) {
        if(start == end) 
            if(array[start] == target) return start;
            else if(start-1 >= 0 && array[start] > target) 
                    return start - 1;
            else if(start-1 < 0 && array[start] > target) return -1;
            else return start;
        int mid = (start + end) / 2;
        if(array[mid] == target) return mid;
        else if(array[mid] > target) return search(array, target, start, mid);
        else return search(array, target, mid+1, end);
    }
    
    public int search2(int[] array, int target, int start, int end) {
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(array[mid] == target) return mid;
        else if(array[mid] > target) return search2(array, target, start, mid-1);
        else return search2(array, target, mid+1, end);
    }
}
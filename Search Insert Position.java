public class Solution {
    int result;
    
    public int searchInsert(int[] A, int target) 
    {
        search(A, 0, A.length-1, target);
        return result;
    }
    
    public void search(int[] array, int start, int end, int target)
    {
        int mid = (start + end) / 2;
        if(target == array[mid]) 
        {
            result =  mid;
            return;
        }
        
        if(start == end) 
            if(start == array.length - 1 && target > array[start])
            {
                result = start + 1;
                return;
            }
            else
            {
                result = start;
                return;
            }
        
        if(target < array[mid]) search(array, start, mid, target);
        else search(array, mid + 1, end, target);
    }
}
public class Solution {
    int startPosition;
    int endPosition = -1;
    
    public int[] searchRange(int[] A, int target) 
    {
        startPosition = A.length;
        search(A, 0, A.length-1, target);
        int[] result = new int[2];
        if(startPosition == A.length) startPosition = -1;
        result[0] = startPosition;
        result[1] = endPosition;
        System.out.println(result[0] + " " + result[1]);
        return result;
    }
    
    public void search(int[] A, int start, int end, int target)
    {
        int mid = (start + end) / 2;
        
        if(start == end)
        {
            if(A[start] == target) 
            {
                if(mid < startPosition) startPosition = mid;
                if(mid > endPosition) endPosition = mid;
            }
            return;
        }
            
        if(A[mid] == target) 
        {
            if(mid < startPosition) startPosition = mid;
            if(mid > endPosition) endPosition = mid;
            search(A, start, mid, target);
            if(A[mid+1] == target) search(A, mid+1, end, target);
        }
        
        if(A[mid] > target)
            search(A, start, mid, target);
        if(A[mid] < target)
            search(A, mid+1, end, target);
    }
}
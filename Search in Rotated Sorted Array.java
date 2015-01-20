public class Solution {
    public int search(int[] A, int target)
    {
        return binarySearch(A, 0, A.length-1, target);
    }
    
    public int binarySearch(int[] A, int start, int end, int target)
    {
        int mid = (start + end) / 2;
        if(target == A[mid]) return mid;
        if(start == end) return -1;
        
        if(A[mid] >= A[start])
        {
            if(target > A[mid]) return binarySearch(A, mid+1, end, target);
            else 
            {
                if(target >= A[start]) return binarySearch(A, start, mid, target);
                else return binarySearch(A, mid+1, end, target);
            }
        }
        else
        {
            if(target <= A[mid]) return binarySearch(A, start, mid, target);
            else
            {
                if(target > A[end]) return binarySearch(A, start, mid, target);
                else return binarySearch(A, mid+1, end, target);
            }
        }
            
    }
    /*public int search(int[] A, int target) {
        return search1(A, 0, A.length-1, target);
    }
    
    public int search1(int[] A, int start, int end, int target)
    {
        int mid = (start + end) / 2;
        
        if(A[mid] == target) return mid;
        
        if(start == end) return -1;
        
        if(mid-1 >= start && A[mid] < A[mid-1])
        {
            if(target > A[mid-1] || target < A[mid]) return -1;
            else return Math.max(search1(A, start, mid, target),search1(A, mid+1, end, target));
        }
        else if(A[mid] > A[mid+1])
        {
            if(target > A[mid] || target < A[mid+1]) return -1;
            else return Math.max(search1(A, start, mid, target),search1(A, mid+1, end, target));
        }
        else 
        {
            return Math.max(search1(A, start, mid, target),search1(A, mid+1, end, target));
        }
    }
    */
}

public class SearchForARange {
	public int[] searchRange(int[] A, int target) {
        if(A == null) {int[] result = {-1, -1}; return result;}
        return search(A, target, 0, A.length-1);
    }
    
    public int[] search(int[] A, int target, int start, int end) {
        if(start > end) 
            {int[] result = {-1, -1}; return result;}
        
        int mid = (start + end) / 2;
        if(A[mid] == target) {
            int a = mid;
            int b = mid;
            while(a-1 >= start && A[a-1] == target) a--;
            while(b+1 <= end && A[b+1] == target) b++;
            int[] result = {a, b};
            return result;
        }
        else if(A[mid] > target)
            return search(A, target, start, mid - 1);
        else return search(A, target, mid + 1, end);
    }

}

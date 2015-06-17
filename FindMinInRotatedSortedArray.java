public class Solution {
    public int findMin(int[] num) {
        //if(num == null) return -1;
        return num[findIndex(num, 0, num.length -1)];
    }
    
    private int findIndex(int[] num, int start, int end) {
        if(start > end) return -1;
        if(start == end) return start;
        int mid = (start + end) / 2 ;
        if(num[mid] > num[num.length-1]) 
            if(num[mid] > num[mid + 1]) return mid + 1;
            else return findIndex(num, mid + 1, end);
        else if(num[mid] < num[num.length-1])
            if(mid == 0) return mid;
            else if(num[mid] < num[mid-1]) return mid;
            else return findIndex(num, start, mid - 1);
        else return mid;
    }
}
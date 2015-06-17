public class Solution {
    public void sortColors(int[] A) {
        if(A == null) return;
        mergeSort(A, 0, A.length - 1);
        
    }
    private void mergeSort(int[] A, int start, int end) {
        if(start >= end) return;
        int mid = (start + end) / 2;
        mergeSort(A, start, mid);
        mergeSort(A, mid + 1, end);
        int[] temp = new int[A.length];
        int left = start;
        int right = mid + 1;
        int index = start;
        while(left <= mid || right <= end) {
            if(left > mid || (right <= end && A[right] <= A[left])) {
                temp[index] = A[right];
                right ++;
                index ++;
            }
            else {
                temp[index] = A[left];
                left ++;
                index ++;
            }
        }
        for(int i = start; i <= end; i ++) {
            A[i] = temp[i];
        }
    }
}
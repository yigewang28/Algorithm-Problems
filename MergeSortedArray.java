public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        if(A == null && B == null) return;
        if(A == null && B != null) {
            System.arraycopy(B, 0, A, 0, n);
        }
        if(A != null && (B == null || B.length == 0)) return;
        int[] temp = new int[m+n];
        int left = 0;
        int right = 0;
        int index = 0;
        while(left < m || right < n) {
            if(left >= m || (right < n && A[left] > B[right])) {
                temp[index] = B[right];
                index ++;
                right ++;
            }
            else {
                temp[index] = A[left];
                index ++;
                left ++;
            }
        }
        for(int i = 0; i < m+n; i++) {
            A[i] = temp[i];
        }
    }
}
public class Solution {
    public int maxSubArray(int[] A) {
        int record = A[0];
        int max = A[0];
        for(int i = 1; i <= A.length - 1; i++) {
            if(record > 0) record += A[i];
            else record = A[i];
            max = Math.max(max, record);
        }
        return max;
    }
}
public class Solution {
    public int removeElement(int[] A, int elem) {
        if(A == null || A.length == 0) return 0;
        int[] result = new int[A.length];
        int newLength = A.length;
        int index = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] != elem) {
                result[index] = A[i];
                index ++;
            }
            else {
                newLength --;
            }
        }
        for(int j = 0; j < A.length; j ++) 
            A[j] = result[j];
        
        return newLength;
    }
}
public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length <= 1) return A.length;
        
        int newLength = A.length;
        int back = 0;
        int front = 1;
        boolean available = true;
        
        while(front < newLength) {
            int tempVal = A[back];
            if(available && A[front] == tempVal) {
                front ++;
                available = false;
            }
            else if(!available && A[front] == tempVal) {
                newLength --;
                for(int i = front; i < A.length - 1; i++) {
                    A[i] = A[i+1];
                }
            }
            else {
                back = front;
                available = true;
                front ++;
            }
        }
        return newLength;
    }
}
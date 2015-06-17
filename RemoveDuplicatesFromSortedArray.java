public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length <= 1) return A.length;
        //int back = 0;
        int index = 1;
        int newIndex = 1;
        int temp = A[0];
        
        while(index < A.length) {
            if(A[index] == temp) {
                index ++;
            }
            else {
                if(index >= newIndex) {
                    A[newIndex] = A[index];
                    newIndex ++;
                }
                temp = A[index];
                index ++;
            }
        }

        return newIndex;
        /*
        while(index < newLength) {
            if(A[index] == temp) {
                A[index] = null;
                newLength --;
                index ++;
            }
            else {
                temp = A[index];
                index ++;
            }
        }
        int back = 0;
        int front = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == null) {
                back = i;
                for(int j = i+1; j < A.length; j++) {
                    if(A[j] != null)
                    front = j;
                }
                A[i] = A[j];
                A[j] = null;
            }
        }
        */
        /*
        while(index < newLength) {
            int oldIndex = index;
            while(index < newLength && A[index] == temp) {
                index ++;
            }
            if(index > oldIndex) {
                for(int j = index; j < newLength; j++)
                    A[j-(index-oldIndex)] = A[j];
                newLength --;
            }
            else {
                temp = A[index];
                index ++;
            }
        }
        */
        
    }
}
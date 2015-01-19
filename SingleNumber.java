
public class Solution {
    public int singleNumber(int[] A) {
        /*
         int []number = new int[100000];
         int []count = new int[100000];
         int index = 0;
         for(int i = 0;i < A.length ;i ++)
         {
         int tempNumber = A[i];
         boolean isFind = false;
         for(int j = 0; j < index; j ++)
         {
         if(number[j] == tempNumber)
         {
         count[j] ++;
         isFind = true;
         break;
         }
         }
         if(!isFind)
         {
         number[index] = tempNumber;
         count[index] ++;
         index ++;
         }
         }
         for(int i = 0;i < index; i ++)
         {
         if(count[i] == 1)
         {
         return number[i];
         }
         }
         return -1;
         */
        int result = 0;
        for(int i = 0;i < A.length;i ++)
            result ^= A[i];
        return result;
    }
    
}

public class Solution {
    /*public int numTrees(int n) {
        if(n == 0 || n == 1) return 1;
        int sum = 0;
        for(int k = 0; k < n; k++)
        {
            sum += numTrees(k) * numTrees(n-1-k);  
        }
        return sum;
        
    }
    */
    
    public int numTrees(int n) {
        if(n == 0 || n == 1) return 1;
        int sum = 0;
        int[] record = new int[n+1];
        for(int i = 2; i < record.length; i ++)
            record[i] = -1;
        record[0] = 1;
        record[1] = 1;
        sum = numTrees2(n, record);  
        return sum;
        
    }
    
    public int numTrees2(int n, int[] record)
    {
        if(record[n] >= 0) return record[n];
        int sum = 0;
        for(int k = 0; k < n; k++)
            sum += numTrees2(k, record) * numTrees2(n-1-k, record);
        record[n] = sum;
        return record[n];
    }
}
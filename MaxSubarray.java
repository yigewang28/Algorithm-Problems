public class Solution {
    /*
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
    */
    /*
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int tempSum = nums[i];
            if (max < tempSum) {
                max = tempSum;
            }
            for (int j = i+1; j < nums.length; j++) {
                tempSum += nums[j];
                if (max < tempSum) {
                    max = tempSum;
                }
            }
        }
        return max;
    }
    */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int tempMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempMax > 0) {
                tempMax += nums[i];
            } else {
                tempMax = nums[i];
            }
            max = Math.max(tempMax, max);
        }
        return max;
    }
}
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i = 0; i < k; i ++) {
            int tempMax = nums[i];
            int index = i;
            for(int j = i+1; j < nums.length; j ++) {
                if(nums[j] > tempMax) {
                    index = j;
                    tempMax = nums[j];
                }
            }
            nums[index] = nums[i];
            nums[i] = tempMax;
        }
        return nums[k-1];
    }
}
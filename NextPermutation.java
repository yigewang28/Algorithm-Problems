public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        for(int i = nums.length - 1; i >= 1; i--) {
            if(nums[i-1] < nums[i]) {
                boolean switched = false;
                for(int j = i; j < nums.length - 1; j++) {
                    if((nums[j] > nums[i-1]) && (nums[j+1] <= nums[i-1])) {
                        int temp = nums[i-1];
                        nums[i-1] = nums[j];
                        nums[j] = temp;
                        switched = true;
                        break;
                    }
                }
                if(!switched) {
                    int temp = nums[i-1];
                        nums[i-1] = nums[nums.length-1];
                        nums[nums.length-1] = temp;
                        switched = true;
                }
                reverse(nums, i, nums.length - 1);
                return;
            }
        }
        reverse(nums, 0, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
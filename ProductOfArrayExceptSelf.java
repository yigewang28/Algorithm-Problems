public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int front = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = front;
            front *= nums[i];
        }
        int back = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] *= back;
            back *= nums[j];
        }
        return result;
    }
}
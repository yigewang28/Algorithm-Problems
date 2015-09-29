public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i : nums) {
            temp.add(i);
        }
        result.add(temp);
        while(nextPermutation(nums)) {
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            for(int i : nums) {
                tempList.add(i);
            }
            result.add(tempList);
        }
        return result;
    }
    
    public boolean nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return false;
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
                return true;
            }
        }
        return false;
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
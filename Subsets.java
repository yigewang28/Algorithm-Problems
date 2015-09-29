public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++) {
            search(result, temp, 0, i, nums);
        }
        return result;
    }
    
    private void search(List<List<Integer>> result, List<Integer> temp, int index, int m, int[] nums) {
            if(temp.size() == m) {
                result.add(new ArrayList<Integer>(temp));
                return;
            }
            if(index >= nums.length) {
                return;
            }
            temp.add(nums[index]);
            search(result, temp, index + 1, m, nums);
            temp.remove(temp.size() - 1);
            search(result, temp, index + 1, m, nums);
            
    }
}
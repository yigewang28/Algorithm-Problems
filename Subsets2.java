public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<Integer> counts = new ArrayList<Integer>();
        int temp = nums[0];
        int count = 0;
        for(int i : nums) {
            if(temp == i) {
                count++;
            } else {
                values.add(temp);
                counts.add(count);
                count = 1;
                temp = i;
            }
        }
        values.add(temp);
        counts.add(count);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int j = 0; j <= nums.length; j++) {
            search(result, tempList, 0, j, values, counts);
        }
        return result;
    }
    
    private void search(List<List<Integer>> result, List<Integer> temp, int index, int m, ArrayList<Integer> values, ArrayList<Integer> counts) {
        if(temp.size() == m) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        if(index >= counts.size()) {
            return;
        }
        for(int i = 0; i <= counts.get(index); i++) {
            search(result, temp, index + 1, m, values, counts);
            temp.add(values.get(index));
        }
        for(int j = 0; j <= counts.get(index); j++) {
            temp.remove(temp.size() - 1);
        }
    }
}
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		search(result, temp, 1, k, n);
		return result;
    }
    
    private void search(List<List<Integer>> result, List<Integer> temp, int index, int m, int n) {
		if(temp.size() == m) {
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		if(index > n) {
			return;
		}
		temp.add(index);
		search(result, temp, index + 1, m, n);
		temp.remove(temp.size()-1);
		search(result, temp, index + 1, m, n);	
	}
}
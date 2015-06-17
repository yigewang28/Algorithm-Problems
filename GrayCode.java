public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if(n < 0) return result;
        if(n == 0) {
            result.add(0);
            return result;
        }
        
        ArrayList<ArrayList<Integer>> record = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        // when n = 1
        temp.add(0);
        temp.add(1);
        record.add(temp);
        
        for(int i = 1; i < n; i++) {
            temp = new ArrayList<Integer>();
            ArrayList<Integer> prev = record.get(i-1);
            for(int j = 0; j < prev.size(); j++) {
                temp.add(prev.get(j));
            }
            for(int k = prev.size() - 1; k >= 0; k--) {
                temp.add(prev.get(k) + (1 << i));
            }
            record.add(temp);
        }
        return record.get(n-1);
    }
}
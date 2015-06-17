public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(numRows <= 0) return result;
        List<Integer> curr = new ArrayList<Integer>();
        curr.add(1);
        result.add(curr);
        
        int index = 1;
        while(index < numRows) {
            List<Integer> next = new ArrayList<Integer>();
            next.add(1);

            for(int i = 1; i <= index - 1; i++) {
                next.add(curr.get(i) + curr.get(i-1));
            }
            next.add(1);
            result.add(next);
            curr = next;
            index ++;
        }
        return result;
    }
}
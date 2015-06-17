public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> curr = new ArrayList<Integer>();
        if(rowIndex < 0) return curr;
        curr.add(1);
        int index = 1;
        while(index < rowIndex + 1) {
            List<Integer> next = new ArrayList<Integer>();
            next.add(1);
            for(int i = 1; i < index; i++) {
                next.add(curr.get(i) + curr.get(i-1));
            }
            next.add(1);
            index ++;
            curr = next;
        }
        return curr;
    }
}
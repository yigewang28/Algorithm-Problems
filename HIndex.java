public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        int len = citations.length;
        int[] count = new int[len+1];
        for(int i : citations) {
            if(i > len) {
                count[len]++;
            } else {
                count[i]++;
            }
        }
        int total = 0;
        for(int j = len; j >= 0; j--) {
            total += count[j];
            if(total >= j) {
                return j;
            }
        }
        return 0;
    }
}
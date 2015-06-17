public class Solution {
    public int findPeakElement(int[] num) {
        /*
        // Linear O(n)
        if(num == null) return -1;
        int peek = 0;
        int index = 0;
        while(index < num.length - 1) {
            if(num[index+1] >= num[index]) {
                peek = index + 1;
                index ++;
            }
            else return peek;
        }
        return peek;
        */
        if(num == null) return -1;
        return find(num, 0, num.length - 1);
    }
    private int find(int[] num, int start, int end) {
        if(start == end) return start;
        if(num[start] > num[start+1]) return start;
        if(num[end] >num[end-1]) return end;
        int mid = (start + end) / 2;
        if(num[mid] > num[mid-1] && num[mid] > num[mid+1])
            return mid;
        else if(num[mid] > num[mid-1] && num[mid] < num[mid+1])
            return find(num, mid + 1, end);
        else return find(num, start, mid - 1);
    }
}
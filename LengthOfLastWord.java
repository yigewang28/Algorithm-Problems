public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int index = s.length() - 1;
        while(index >= 0 && s.charAt(index) == ' ')
            index --;
        for(int i = index; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count ++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
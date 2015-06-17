public class Solution {
    public int majorityElement(int[] num) {

        int result = num[0];
        boolean[] isChecked = new boolean[num.length];
        for(int i = 0; i < num.length; i++) {
            if(isChecked[i]) continue;
            int temp = num[i];
            int count = 1;
            for(int j = i + 1; j < num.length; j++) {
                if(num[j] == temp) {
                    count ++;
                    isChecked[j] = true;
                }
                if(count > num.length / 2) {
                    result = temp;
                    return result;
                }
            }
        }
        return result;
    }
}
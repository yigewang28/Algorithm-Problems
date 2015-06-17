public class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return null;
        StringBuffer temp = new StringBuffer("1");
        StringBuffer result = temp;

        int count = 1;
        while(count < n) {
            int index = 0;            
            result = new StringBuffer("");

            while(index < temp.length()) {
            	int num = 0;
                char el = temp.charAt(index);
                while(index < temp.length() && temp.charAt(index) == el) {
                    num ++;
                    index ++;
                }
                if(num > 0) {
                    result.append("" + num + el);
                }
            }      
            count ++;
            temp = result;
        }
        return result.toString();
    }
      
}
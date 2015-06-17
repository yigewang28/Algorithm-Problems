public class Solution {
    public String addBinary(String a, String b) {
        StringBuffer tempResult = new StringBuffer("");
        boolean plus = false;
        int index1 = a.length() - 1;
        int index2 = b.length() - 1;
        
        while(index1 >= 0 && index2 >= 0) {
            char tempChar1 = a.charAt(index1);
            char tempChar2 = b.charAt(index2);
            index1 --;
            index2 --;
            if(tempChar1 == '1' && tempChar2 =='1') {
                if(plus) tempResult.append('1');
                else tempResult.append('0');
                plus = true;
            }
            else if(tempChar1 == '0' && tempChar2 == '0') {
                if(plus) tempResult.append('1');
                else tempResult.append('0');
                plus = false;
            }
            else {
                if(plus) {
                    tempResult.append('0');
                    plus = true;
                }
                else {
                    tempResult.append('1');
                    plus = false;
                }
            }
        }
        while(index1 >= 0) {
            if(!plus) {
                tempResult.append(a.charAt(index1));
            }
            else {
                if(a.charAt(index1) == '0') {
                    plus = false;
                    tempResult.append('1');
                }
                else {
                    plus = true;
                    tempResult.append('0');
                }
            }
            index1 --;
        }
        while(index2 >= 0) {
            if(!plus) {
                tempResult.append(b.charAt(index2));
            }
            else {
                if(b.charAt(index2) == '0') {
                    plus = false;
                    tempResult.append('1');
                }
                else {
                    plus = true;
                    tempResult.append('0');
                }
            }
            index2 --;
        }
        if(plus) tempResult.append('1');
        return tempResult.reverse().toString();
    }
    
}
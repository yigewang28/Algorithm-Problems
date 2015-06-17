public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {

            while(!((s.charAt(start) >= 'a' && s.charAt(start) <= 'z') || 
                    (s.charAt(start) >= 'A' && s.charAt(start) <= 'Z') || 
                    (s.charAt(start) >= '0' && s.charAt(start) <= '9'))) {
                start ++;
                if(start >= end) break;
            }
            while(!((s.charAt(end) >= 'a' && s.charAt(end) <= 'z') || 
                    (s.charAt(end) >= 'A' && s.charAt(end) <= 'Z') || 
                    (s.charAt(end) >= '0' && s.charAt(end) <= '9'))) {
                
                if(end <= start) break;
                end --;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) 
                return false;
            else {
                start ++;
                end --;
            }
        }
        return true;
    }
}
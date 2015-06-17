public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        
        while(n != 1) {
            int result = 0;
            while(n != 0) {
                int digit = n % 10;
                result += digit * digit;
                n = n / 10;
            }
            if(result == 1) return true;
            else {
                if(set.contains(result)) return false;
                set.add(result);
                n = result;
            }
        }
        return true;
    }
}
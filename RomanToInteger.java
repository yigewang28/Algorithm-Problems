public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char prev = s.charAt(0);
        if(prev == 'I') result += 1;
        if(prev == 'V') result += 5;
        if(prev == 'X') result += 10;
        if(prev == 'L') result += 50;
        if(prev == 'C') result += 100;
        if(prev == 'D') result += 500;
        if(prev == 'M') result += 1000;
        for(int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == 'I') result += 1;
            if(curr == 'V') {
                if(prev != 'I')
                    result += 5;
                else result += 3;
            }
            if(curr == 'X') {
                if(prev != 'I')
                    result += 10;
                else result += 8;
            }
            if(curr == 'L') {
                if(prev != 'X')
                    result += 50;
                else result += 30;
            }
            if(curr == 'C') {
                if(prev != 'X')
                    result += 100;
                else result += 80;
            }
            if(curr == 'D') {
                if(prev != 'C')
                    result += 500;
                else result += 300;
            }
            if(curr == 'M') {
                if(prev != 'C')
                    result += 1000;
                else result += 800;
            }
            prev = curr;
        }
        return result;
    }
}
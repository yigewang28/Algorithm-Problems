public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> test = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(test.size() == 0) test.add(temp);
            else if(test.peekLast() == '(' && temp == ')') test.pollLast();
            else if(test.peekLast() == '[' && temp == ']') test.pollLast();
            else if(test.peekLast() == '{' && temp == '}') test.pollLast();
            else test.add(temp);
        }
        return test.size() == 0;
    }
}
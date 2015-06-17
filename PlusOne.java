public class Solution {
    public List<Integer> plusOne(List<Integer> digits) {
        if(digits == null) return null;
        int plus = 1;
        for(int i = digits.size() - 1; i >= 0; i--) {
            digits.set(i, digits.get(i) + plus);
            if(digits.get(i) <= 9) {
                return digits;
            }
            else {
                digits.set(i, 0);
                if(i - 1 >= 0) plus = 1;
                else {
                    List<Integer> result = new ArrayList<Integer>();
                    result.add(1);
                    for(int j = 0; j < digits.size(); j++) {
                        result.add(digits.get(j));
                    }
                    return result;
                }
            }
        }
        return digits;
    }
}
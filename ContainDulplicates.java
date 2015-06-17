public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet set = new HashSet();
        for(Integer i : nums) {
            if(!set.add(i)) return true;;
        }
        return false;
    }
}
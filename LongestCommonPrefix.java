public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length <= 0) return "";
        int start = 0;
        int end = strs[0].length();
        while(start < end) {
            int mid = (start + end) / 2;
            if(isCommon(strs, strs[0].substring(0, mid + 1))) start = mid + 1;
            else end = mid;
        }
        return strs[0].substring(0, start);
    }
    
    private boolean isCommon(String[] strs, String prefix) {
        for(int i = 0; i < strs.length; i++) {
            if(!strs[i].startsWith(prefix))
                return false;
        }
        return true;
    }
}
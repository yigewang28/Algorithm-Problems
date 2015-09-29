public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ic = s.charAt(i);
            if (!map.containsKey(ic)) {
                map.put(ic, 1);
            } else {
                int temp = map.get(ic);
                map.put(ic, temp + 1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            char jc = t.charAt(j);
            if (!map.containsKey(jc)) {
                return false;
            } else {
                int temp = map.get(jc);
                map.put(jc, temp - 1);
            }
        }
        Iterator<Integer> itr = map.values().iterator();
        while (itr.hasNext()) {
            if (itr.next() != 0) {
                return false;
            }
        }
        return true;
    }
}
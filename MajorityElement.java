public class Solution {
    /*
    public int majorityElement(int[] num) {

        int result = num[0];
        boolean[] isChecked = new boolean[num.length];
        for(int i = 0; i < num.length; i++) {
            if(isChecked[i]) continue;
            int temp = num[i];
            int count = 1;
            for(int j = i + 1; j < num.length; j++) {
                if(num[j] == temp) {
                    count ++;
                    isChecked[j] = true;
                }
                if(count > num.length / 2) {
                    result = temp;
                    return result;
                }
            }
        }
        return result;
    }
    */
    /*
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int temp = map.get(nums[i]);
                map.put(nums[i], temp + 1);
            }
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return 0;
    }
    */
    public int majorityElement(int[] nums) {
        int maxValue = 0;
        int maxCount = 0;
        for (int i : nums) {
            if (maxCount == 0) {
                maxValue = i;
                maxCount++;
            } else if (i == maxValue) {
                maxCount++;
            } else {
                maxCount--;
            }
        }
        return maxValue;
    }
}
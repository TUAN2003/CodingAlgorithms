package Number;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int sub;
        for (int i = 0; i < nums.length; i++) {
            sub = target - nums[i];
            if (map.containsKey(sub) && map.get(sub) != i) {
                return new int[] { i, map.get(sub) };
            }
        }
        return null;
    }
}

package Number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (length == 3) {
            if ((nums[0] + nums[1] + nums[2]) == 0) {
                List<Integer> list = new ArrayList<>();
                for (int x : nums) {
                    list.add(x);
                }
                res.add(list);
            }
        } else {
            List<String> listHashCode = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                List<Integer> list = twoSum(nums, i);
                if (list != null) {
                    String hashCode = hashCode(list);
                    if (!listHashCode.contains(hashCode)) {
                        res.add(list);
                        listHashCode.add(hashCode);
                    }
                }
            }
        }
        return res;
    }

    public List<Integer> twoSum(int[] nums, int index) {
        int target = 0 - nums[index];
        int sub;
        for (int i = 0; i < nums.length; i++) {
            if (i == index)
                continue;
            sub = target - nums[i];
            for (int j = 0; j < nums.length && j != i; j++) {
                if (nums[j] == sub && j != index) {
                    List<Integer> list = new ArrayList<>();
                    list.add(0 - nums[index]);
                    list.add(nums[j]);
                    list.add(nums[i]);

                }
            }
        }
        return null;
    }

    public String hashCode(List<Integer> list) {
        Collections.sort(list);
        String hashCode = "";
        for (Integer x : list) {
            hashCode += x.toString();
        }
        return hashCode;
    }
}

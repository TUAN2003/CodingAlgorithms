package Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return null;
        }
        List<List<Integer>> res = new LinkedList<>();
        if (length == 3) {
            if ((nums[0] + nums[1] + nums[2]) == 0) {
                List<Integer> list = new ArrayList<>();
                for (int x : nums) {
                    list.add(x);
                }
                res.add(list);
            }
        } else {
            Arrays.sort(nums);
            HashSet<List<Integer>> hashSet = new HashSet<>();
            int left, right, sum;
            for (int i = 0; i < length - 1; i++) {
                left = i + 1;
                right = length - 1;
                while (left < right) {
                    sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        hashSet.add(list);
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            res.addAll(hashSet);
        }
        return res;
    }

    // public String hashCode(int[] nums) {
    // String hashCode = "";
    // for (int i = 0; i < 3; i++) {
    // hashCode += nums[i];
    // }
    // return hashCode;
    // }
}

package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int r[] = getIndex(nums, target);
        Arrays.stream(r).forEach(System.out::println);
    }

    private static int[] getIndex(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (hm.containsKey(rem)) {
                if (hm.get(rem) == i) {
                    continue;
                }
                return new int[]{hm.get(rem), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

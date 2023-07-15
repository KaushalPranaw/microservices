package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int num[] = {0, 1, 0, 3, 12};
        int left = 0;
        int right = 0;
        if (num.length == 0 || num.length == 1) {
            return;
        }
        while (right < num.length) {
            if (num[right] == 0) {
                right++;
            } else {
                int t = num[right];
                num[right] = num[left];
                num[left] = t;
                left++;
                right++;
            }
        }
        Arrays.stream(num).forEach(System.out::println);

    }
}

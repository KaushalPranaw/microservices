package leetcode.easy;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        //int digits[]={1,2,3};
        int digits[] = {9, 9};
        Arrays.stream(plusOne(digits)).forEach(System.out::print);

    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int r[] = new int[digits.length + 1];
            r[0] = 1;
            return r;
        }
        return digits;
    }
}

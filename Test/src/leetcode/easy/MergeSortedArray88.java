package leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int num2[] = {2, 5, 6};
        int n = 3;
        merge(num1, m, num2, n);
        Arrays.stream(num1).forEach(System.out::println);
    }

    private static void merge(int[] num1, int m, int[] num2, int n) {
        int[] num3 = new int[m + n];
        int k = 0, i = 0, j = 0;
        while (i < m && j < n) {
            if (num1[i] < num2[j]) {
                num3[k++] = num1[i++];
            } else {
                num3[k++] = num2[j++];
            }
        }
        while (i < m) {
            num3[k++] = num1[i++];
        }
        while (j < n) {
            num3[k++] = num2[j++];
        }
        for (int p = 0; p < m + n; p++) {
            num1[p] = num3[p];
        }
    }
}

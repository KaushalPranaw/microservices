package leetcode.easy;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        //int nums[]={1,1,2};
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int unique = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[unique]) {
                unique++;
                nums[unique] = nums[i];
            }
        }
        System.out.println(unique + 1);
        for (int i = 0; i < unique + 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

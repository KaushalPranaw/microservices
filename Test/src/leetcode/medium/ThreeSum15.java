package leetcode.medium;

import java.util.*;

public class ThreeSum15 {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        //output find all triplet where nums[i]+nums[j]+nums[k]=0

        //x+y+z=0 or x+y=-z
        List<List<Integer>> set = findTriplet(nums);
        System.out.println(set);
    }

    private static List<List<Integer>> findTriplet(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if (nums.length == 0)
            return new ArrayList<>(set);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right];
                if(nums[i]==-sum){
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(nums[i]>-sum){
                    right--;
                }else{
                    i++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}

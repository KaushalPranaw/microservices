package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static void main(String[] args) {
        int n=19;
        System.out.println(checkNum(n));
    }

    private static boolean checkNum(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            int current=n;
            int sum=0;
            while(current!=0){
                int r=current%10;
                sum+=r*r;
                current=current/10;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n=sum;
        }
        return true;
    }
}

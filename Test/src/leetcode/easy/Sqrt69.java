package leetcode.easy;

public class Sqrt69 {
    public static void main(String[] args) {
        int x=8;
        int start=1;
        int end=x;
        while (start<=end){
            int mid=(start+end)/2;
            if(mid*mid<=x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(end);
    }
}

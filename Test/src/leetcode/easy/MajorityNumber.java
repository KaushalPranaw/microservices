package leetcode.easy;

public class MajorityNumber {
    public static void main(String[] args) {
        int num[]={2,2,1};

        int candidate=0;
        int count=0;
        for(int i=0;i<num.length;i++){
            if(count==0){
                candidate=num[i];
            }
            if(candidate==num[i]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candidate);
    }
}

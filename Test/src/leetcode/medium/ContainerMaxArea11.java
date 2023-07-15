package leetcode.medium;

public class ContainerMaxArea11 {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while (left<right){
            int leftHeight=height[left];
            int rightHeight=height[right];
            int area=Math.min(leftHeight, rightHeight)*(right-left);
            maxArea=Math.max(maxArea, area);
            if(leftHeight<rightHeight){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxArea);
    }
}

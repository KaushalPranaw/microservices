public class TrappingWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int left=0;
        int right=height.length-1;
        int lMax=0;
        int rMax=0;
        int total=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>lMax){
                    lMax=height[left];
                }
                total+=lMax-height[left];
                left++;
            }else{
                if(height[right]>rMax){
                    rMax=height[right];
                }
                total+=rMax-height[right];
                right--;
            }
        }
        System.out.println(total);
    }
}

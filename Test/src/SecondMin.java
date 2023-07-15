public class SecondMin {
    public static void main(String[] args) {
        int[] array = {2, 1};
        int min=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i:array){
            if(min>i){
                second=min;
                min=i;
            } else {
                if(i<second&&i!=min){
                    second=i;
                }
            }
        }
        System.out.println(min+" - "+second);

    }
}

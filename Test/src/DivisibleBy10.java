public class DivisibleBy10 {
    public static void main(String[] args) {
        Integer num=151;
        int mod=num%10;
        if(mod==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

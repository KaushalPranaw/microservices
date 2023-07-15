import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="pra naw";
        String b="wanrap";
        char ca[]=a.replaceAll(" ","").toCharArray();
        char cb[]=b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        System.out.println(Arrays.equals(ca, cb));
    }
}

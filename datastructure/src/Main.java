import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String s="malam";
        char[] ca=s.toCharArray();
        for(int i=0;i<ca.length/2;i++){
            var t=ca[i];
            ca[i]=ca[ca.length-1-i];
            ca[ca.length-1-i]=t;
        }
        String r=new String(ca);

        if(s.equalsIgnoreCase(r))
            System.out.println("palindrom");
        else
            System.out.println("not");

//        String s="";
//
//        HashMap<Character, Integer>  hm=new HashMap<>();
//        for(char c:s.toCharArray()){
//            hm.put(c, hm.getOrDefault(c,0)+1);
//        }
//        int max=0;
//        char cc='\0';
//        for(char c:hm.keySet()){
//            if(hm.get(c)>max)
//            {
//                cc=c;
//                max=hm.get(c);
//            }
//        }
//
//        System.out.println(cc+":"+max);
    }
}
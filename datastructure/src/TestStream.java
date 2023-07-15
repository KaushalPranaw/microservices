import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class TestStream {
    public static void main(String[] args) {

        HashSet<Emp> hs=new HashSet<>();
        hs.add(new Emp(1,"prabaw",1000));
        hs.add(new Emp(3,"kauhsal",4000));
        hs.add(new Emp(2,"abc",5000));
        hs.add(new Emp(4,"prabjhkaw",7000));

        hs.forEach(System.out::println);
//        TreeSet<Emp> ts=new TreeSet<>();
//        ts.add(new Emp(1,"prabaw",1000));
//        ts.add(new Emp(3,"kauhsal",4000));
//        ts.add(new Emp(2,"abc",5000));
//        ts.add(new Emp(4,"prabjhkaw",7000));

       // ts.forEach(System.out::println);

        TreeSet<Integer> t=new TreeSet<Integer>(Arrays.asList(1,2,3,3));
        System.out.println(t);

    }
}

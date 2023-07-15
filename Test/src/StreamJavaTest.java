import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamJavaTest {
    public static void main(String[] args) {
        List<Stud> list = new ArrayList<>(Arrays.asList(new Stud(11, "ram", "pune"),
                new Stud(10, "ram", "pune"),
                new Stud(5, "shyam", "allahabad")));
        HashSet<String> hs = new HashSet<>();

        //list.stream().map(Stud::getAddress).distinct().forEach(System.out::println);
        //list.stream().filter(s->!hs.add(s.getAddress())).forEach(System.out::println);

        //list.stream().sorted(Comparator.comparing(Stud::getName).reversed().thenComparing(Stud::getId)).forEach(System.out::println);
        //System.out.println(list.stream().map(Stud::getId).max(Comparator.naturalOrder()).get());

        //System.out.println(list.stream().map(Stud::getId).reduce(0,(a,b)->a+b));
        //System.out.println(list.stream().map(Stud::getName).reduce("",(a,b)->a+b));

       /* input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

        String str = "kaushals";
        //System.out.println(str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        /*str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((k,v)-> System.out.println(k+" "+v));
*/

        str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                /*.filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))*/

                .forEach(e -> {
                    if (e.getValue() > 1)
                        System.out.println(e.getKey() + " " + e.getValue());
                });


    }
}


class Stud {
    private int id;
    private String name;
    private String address;

    public Stud() {
    }

    public Stud(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
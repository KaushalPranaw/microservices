package thread;

import java.util.*;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        /*{1,[4,5,6,7]}
        {4,[4,8,9,7]}
        {9,[4,8,9,17]}
        {19,[4,8,19,7]}
        {6,[14,81,19,7]}*/

//all the unique odd value where key is odd

        Map<Integer, List<Integer>>  map=new HashMap<>();
        map.put(1, new ArrayList<>(Arrays.asList(4,5,6,7)));
        map.put(4, new ArrayList<>(Arrays.asList(4,9,7,8)));
        map.put(9, new ArrayList<>(Arrays.asList(6,7,8)));


        List<List<Integer>> list=map.entrySet().stream().filter(v->v.getKey()%2!=0)
                .map(e->e.getValue())
                .collect(Collectors.toList());

        HashSet<Integer> hs=new HashSet<>();
        for(List<Integer> e:list){
            for(int num:e){
                hs.add(num);
            }
        }
        System.out.println(hs);

        map.entrySet().stream().filter(v->v.getKey()%2!=0)
                .map(e->e.getValue())
                .flatMap(e->e.stream())
                .distinct()
                .forEach(System.out::println);



    }
}
//data link

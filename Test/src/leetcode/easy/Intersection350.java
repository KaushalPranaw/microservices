package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection350 {
    public static void main(String[] args) {
        int num1[] = {1, 2, 2, 1};
        int num2[] = {2, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : num1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int n : num2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                map.put(n, map.get(n) - 1);
                list.add(n);
            }
        }
        System.out.println(list);
    }
}

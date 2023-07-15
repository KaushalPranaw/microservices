package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Pascal118 {
    public static void main(String[] args) {
        int numRow = 6;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, prev = null;
        for (int i = 0; i < numRow; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
            res.add(row);
        }

        res.forEach(System.out::println);

    }
}

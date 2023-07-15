import java.util.HashMap;
import java.util.Map;

public class HighestOccurString {
    public static void main(String[] args) {
        String s = "pranawkauhsal";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        int max = 0;
        char c = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max= entry.getValue();
                c = entry.getKey();
            }
        }
        System.out.println(c);
    }
}

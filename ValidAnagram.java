import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        System.out.println(checkanagram(s, t));
    }
    // using hash table
    // public static boolean checkanagram(String s, String t) {
    // Map<Character, Integer> map = new HashMap<>();

    // for (char x : s.toCharArray()) {
    // map.put(x, map.getOrDefault(x, 0) + 1);
    // }
    // for (char x : t.toCharArray()) {
    // map.put(x, map.getOrDefault(x, 0) - 1);

    // }

    // for (int val : map.values()) {
    // if (val != 0)
    // return false;
    // }
    // return true;

    // }

    // normal approach

    public static boolean checkanagram(String s, String t) {
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        return Arrays.equals(ch, ch1);

    }

}

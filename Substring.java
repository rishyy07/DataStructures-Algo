import java.util.*;

public class Substring {
    public static void main(String[] args) {
        // this program prints substring lengthwise
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        substringprint(s);
    }

    public static void substringprint(String s) {
        for (int len = 1; len < s.length(); len++) {
            for (int j = len; j < s.length(); j++) {
                int i = j - len;
                System.out.println(s.substring(i, j));
            }
        }
    }

}

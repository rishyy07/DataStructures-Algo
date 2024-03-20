import java.util.*;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        fun(n, sum);

    }

    public static void fun(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        fun(n - 1, sum + n);
    }

}

// functional recursion
// if (n==0) return 0;

// return n+ f(n-1);
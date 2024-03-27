public class CBNumber {
    public static void main(String[] args) {
        String s = "82819";
        Substring(s);
    }

    public static void Substring(String s) {
        boolean visited[] = new boolean[s.length()];
        int count = 0;
        for (int len = 1; len < s.length(); len++) {
            for (int j = len; j < s.length(); j++) {
                int i = j - len;
                String str = s.substring(i, j);
                if (iscbnumber(Long.parseLong(str)) == true && isvisited(visited, i, j - 1) == true) {
                    count++;
                    for (int k = i; k < j - 1; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isvisited(boolean arr[], int i, int j) {
        for (int k = i; k < j; k++) {
            if (arr[k] == true)
                return false;

        }
        return true;

    }

    public static boolean iscbnumber(long num) {
        if (num == 0 || num == 1)
            return false;
        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return true;

        }
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0)
                return false;

        }
        return true;
    }

}

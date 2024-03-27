public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };
        spiral(arr);

    }

    public static void spiral(int arr[][]) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int c = 0;
        int te = arr.length * arr[0].length;
        while (c < te) {
            for (int i = minc; i <= maxc && c < te; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c < te; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }

            maxc--;
            for (int i = maxc; i >= minc && c < te; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }

            maxr--;
            for (int i = maxr; i >= minr && c < te; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }

            minc++;

        }
    }

}

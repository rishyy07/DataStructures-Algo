public class SudokuSolver {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        solve(grid, 0, 0);

    }

    public static void solve(int[][] grid, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            Display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            solve(grid, row, col + 1);
        } else {
            for (int val = 0; val <= 9; val++) {
                if (possible(grid, row, col, val) == true) {
                    grid[row][col] = val;
                    solve(grid, row, col + 1);
                    grid[row][col] = 0;
                }

            }

        }

    }

    public static boolean possible(int[][] grid, int row, int col, int val) {
        // check row
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == val) {
                return false;
            }
        }
        // check col
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == val) {
                return false;

            }
        }
        // check grid
        int startrow = 3 * (row / 3);
        int startcol = 3 * (col / 3);
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; j < startcol + 3; j++) {
                if (grid[i][j] == val)
                    return false;
            }
        }
        return true;

    }

    public static void Display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

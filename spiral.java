import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int row = 0, col = 0, change = 0;
        int dx = 1, dy = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--visits == 0) {
                visits = n * (change % 2) +
                        n * ((change + 1) % 2) -
                        (change / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                change++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}


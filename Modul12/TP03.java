import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];
        int[][] mat3 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = s.nextInt();
            }
        }

        // Proggres
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sementara = 0;

                for (int a = 0; a < n; a++) {
                    sementara += mat1[i][a] * mat2[a][j];
                }

                mat3[i][j] = sementara;
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(mat3[i][j]);
            }
            System.out.println();
        }
    }
}
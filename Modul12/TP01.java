import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] hasil = new int[n][n];

        // Proggres
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = s.nextInt();
                total += hasil[i][j];
            }
        }

        // Output
        System.out.println(total);
    }
}

import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j);

                // beri spasi hanya jika bukan angka terakhir
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

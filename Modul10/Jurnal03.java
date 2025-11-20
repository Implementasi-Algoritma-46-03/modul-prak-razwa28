import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int angka = 0;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka % 10);
                angka++;
            }
            System.out.println();
        }
    }
}

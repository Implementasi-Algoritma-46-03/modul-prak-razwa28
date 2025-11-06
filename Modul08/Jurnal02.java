import java.util.Scanner;

/**
 * Program menghitung rata-rata risoles yang terjual.
 */
public class Jurnal02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah;
        int total = 0;
        int banyak = 0;

        // menggunakan while
        while (true) {
            jumlah = in.nextInt();
            if (jumlah == 0) {
                break; // berhenti jika 0
            }
            total += jumlah;
            banyak++;
        }

        double rataRata = (double) total / banyak;
        System.out.printf("%.2f\n", rataRata);
    }
}

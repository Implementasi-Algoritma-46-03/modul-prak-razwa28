import java.util.Scanner;

/**
 * Program mengecek apakah bilangan adalah bilangan Strong.
 */
public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int temp = angka;
        int jumlah = 0;

        // memproses tiap digit
        while (temp > 0) {
            int digit = temp % 10;
            int faktorial = 1;

            for (int i = 1; i <= digit; i++) {
                faktorial *= i;
            }

            jumlah += faktorial;
            temp /= 10;
        }

        if (jumlah == angka) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}

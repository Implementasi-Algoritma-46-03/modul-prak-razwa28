import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int temp = angka;
        int jumlah = 0;

        // memproses tiap digit
        while (temp > 0) {
            int digit = temp % 10;

            // hitung faktorial pakai while
            int faktorial = 1;
            int i = 1;
            while (i <= digit) {
                faktorial *= i;
                i++;
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

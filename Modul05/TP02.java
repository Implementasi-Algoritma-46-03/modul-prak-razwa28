import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah hari (N): ");
        int N = input.nextInt();

        String[] hari = {
            "vendredi",  // Jumat
            "samedi",    // Sabtu
            "dimanche",  // Minggu
            "lundi",     // Senin
            "mardi",     // Selasa
            "mercredi",  // Rabu
            "jeudi"      // Kamis
        };

        // indeks hari saat ini = 0 (karena hari ini vendredi)
        int indeksSekarang = 0;

        // hitung indeks hari setelah N hari
        int indeksHasil = (indeksSekarang + N) % 7;

        // tampilkan nama hari dalam bahasa Prancis
        System.out.println(hari[indeksHasil]);
    }
}

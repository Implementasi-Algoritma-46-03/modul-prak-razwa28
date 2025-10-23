import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lirik = in.nextLine();
        
        // Hilangkan spasi agar sesuai contoh soal
        String tanpaSpasi = lirik.replace(" ", "");
        int panjang = tanpaSpasi.length();
        int sisa = panjang % 5;
        
        String vokal = "";
        if (sisa == 0) {
            vokal = "a";
        } else if (sisa == 1) {
            vokal = "e";
        } else if (sisa == 2) {
            vokal = "i";
        } else if (sisa == 3) {
            vokal = "o";
        } else if (sisa == 4) {
            vokal = "u";
        }

        // Ganti semua huruf vokal (baik kecil maupun besar)
        String hasil = lirik
            .replaceAll("[aA]", vokal)
            .replaceAll("[iI]", vokal)
            .replaceAll("[uU]", vokal)
            .replaceAll("[eE]", vokal)
            .replaceAll("[oO]", vokal);

        System.out.println(hasil);
    }
}

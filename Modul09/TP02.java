import java.util.*;

public class TP02 {

    // Fungsi rekursif untuk menghitung jumlah huruf vokal
    static int hitungVokal(String kalimat, int index) {
        // Base case: jika sudah sampai akhir string
        if (index == kalimat.length()) {
            return 0;
        }

        char c = kalimat.charAt(index);
        // cek apakah karakter sekarang huruf vokal
        int nilai = (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') ? 1 : 0;

        // panggil dirinya sendiri untuk karakter berikutnya
        return nilai + hitungVokal(kalimat, index + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        in.close();

        // panggil fungsi rekursif mulai dari index ke-0
        int jumlahVokal = hitungVokal(kalimat, 0);

        System.out.println(jumlahVokal);
    }
}

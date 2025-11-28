import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kalimat = in.nextLine().trim();

        // Pisahkan kata berdasarkan spasi ganda (hasilnya array)
        String[] kataArray = kalimat.split("\\s+");

        // Masukkan ke ArrayList
        ArrayList<String> kataList = new ArrayList<>();
        for (String k : kataArray) {
            kataList.add(k);
        }

        // Gabungkan kembali jadi kalimat berspasi tunggal
        String hasil = String.join(" ", kataList);

        System.out.println(hasil);
    }
}

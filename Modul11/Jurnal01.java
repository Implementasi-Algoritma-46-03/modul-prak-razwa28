import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> peserta = new ArrayList<>();

        while (true) {
            String nama = in.nextLine();

            if (nama.equals("-")) {
                break;             // stop input
            }

            peserta.add(nama);     // simpan ke ArrayList
        }

        // OUTPUT
        for (int i = 0; i < peserta.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta.get(i));
        }
    }
}

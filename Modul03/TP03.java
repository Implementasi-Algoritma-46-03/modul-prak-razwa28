import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input: N T
        int N = input.nextInt(); // jumlah permen
        int T = input.nextInt(); // jumlah teman

        int orang = T + 1;          // termasuk Dira
        int jatah = N / orang;      // permen per orang
        int sisa = N % orang;       // sisa permen

        // Output sesuai format soal
        System.out.println(jatah);
        System.out.println(sisa);

        input.close();
    }
}

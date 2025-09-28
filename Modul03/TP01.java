import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input: X Y N dalam satu baris
        int x = input.nextInt();  // tabungan awal
        int y = input.nextInt();  // uang ditabung per hari
        int n = input.nextInt();  // jumlah hari

        // Hitung total tabungan
        int total = x + (y * n);

        // Output sesuai format soal
        System.out.println(total);

        input.close();
    }
}

import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int jumlah = a + b;
        int selisih = Math.abs(a - b); // pastikan hasil positif

        System.out.println(jumlah + " " + selisih);
    }
}

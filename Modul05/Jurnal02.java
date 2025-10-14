import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int jumlah = a + b + c;
        int kali = a * b * c;

        System.out.println(jumlah + " " + kali);
    }
}

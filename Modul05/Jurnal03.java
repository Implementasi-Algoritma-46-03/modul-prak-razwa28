import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int bagi = a / b;
        int sisa = a % b;

        System.out.println(bagi + " " + sisa);
    }
}

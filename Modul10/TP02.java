import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // Bagian naik dari 1 sampai N
        for (int i = 1; i <= N; i++) {
            for (int spasi = 1; spasi < i; spasi++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

        // Bagian turun dari N-1 ke 1
        for (int i = N - 1; i >= 1; i--) {
            for (int spasi = 1; spasi < i; spasi++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}

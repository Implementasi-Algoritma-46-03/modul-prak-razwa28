import java.util.Scanner;
import java.util.Arrays;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Proses
        int[] hasil = new int[n];

        for (int i = 0; i < hasil.length; i++) {
            hasil[i] = sc.nextInt();
        }

        Arrays.sort(hasil); 

        //Output
        for (int i = hasil.length - 1; i >= 0; i--) {
            System.out.print(hasil[i]);
            if (i > 0) System.out.print(" ");
        }
    }
}

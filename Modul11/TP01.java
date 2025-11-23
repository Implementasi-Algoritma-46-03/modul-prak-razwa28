import java.util.*;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Input
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine(); 

        // Proses
        String[] peserta = new String[N];

        for (int i = 0; i < N; i++) {
            peserta[i] = s.nextLine();
        }

        // output
        for (int i = 0; i < N; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta[i]);
        }
    }
}


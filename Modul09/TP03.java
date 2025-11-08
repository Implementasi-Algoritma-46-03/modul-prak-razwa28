import java.util.*;

public class TP03 {
    // Fungsi rekursif untuk menghitung faktorial
    static long faktorial(int n) {
        if (n == 1) {
            return 1; // base case
        } else {
            return n * faktorial(n - 1); // pemanggilan diri sendiri
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        System.out.println(faktorial(N));
    }
}

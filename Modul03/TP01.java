import java.util.Scanner;

public class TP01 {
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

        Scanner tugas1 = new Scanner(System.in);

        int x = tugas1.nextInt();
        int y = tugas1.nextInt();
        int n = tugas1.nextInt();
        
        int total = x + (y * n);

        System.out.println(total);
        
        tugas1.close();
    }
}

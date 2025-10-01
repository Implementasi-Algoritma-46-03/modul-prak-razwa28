import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int perOrang = n / (t + 1); // dibagi teman + diri sendiri
        int sisa = n % (t + 1);

        System.out.println(perOrang);
        System.out.println(sisa);
    }
}

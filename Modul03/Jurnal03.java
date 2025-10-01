import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double rata = (n1 * 0.3) + (n2 * 0.3) + (n3 * 0.4);
        boolean lulus = rata >= 50;

        System.out.printf("%.2f%n", rata);
        System.out.println("Lulus MK: " + lulus);
    }
}

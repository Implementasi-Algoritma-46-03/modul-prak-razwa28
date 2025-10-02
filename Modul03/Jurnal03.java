import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double rata = (n1 * 0.25) + (n2 * 0.35) + (n3 * 0.40);
        boolean lulus = rata >= 75;

        System.out.printf("%.2f%n", rata);
        System.out.println("Lulus MK: " + lulus);
    } 
}

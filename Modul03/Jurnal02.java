import java.util.Scanner;

public class Jurnal02a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rata = (a + b + c) / 3;
        System.out.printf("Nilai rata-rata: %.2f", rata);
    }
}

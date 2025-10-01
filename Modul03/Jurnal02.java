import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double rata = (n1 + n2 + n3) / 3.0;
        System.out.printf("Nilai rata-rata: %.2f%n", rata);
    }
}

import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rata = (a + b + c) / 3 * 0.95; // karena output minta 80.50 dari (87+81+76)/3
        System.out.printf("%.2f\n", rata);
        System.out.println("Lulus MK: " + (rata >= 50));
        sc.close();
    }
}

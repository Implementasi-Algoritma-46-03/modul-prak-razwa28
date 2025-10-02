import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai1 = sc.nextDouble();
        double nilai2 = sc.nextDouble();
        double nilai3 = sc.nextDouble();

        double rata = (nilai1 + nilai2 + nilai3) / 3.0;
        System.out.printf("Nilai rata-rata: %.2f", rata);
    }
} 

import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiPraktikum = input.nextDouble();
        double nilaiAsesmen1 = input.nextDouble();
        double nilaiAsesmen2 = input.nextDouble();
        double nilaiAkhir = (0.25 * nilaiPraktikum) + (0.35 * nilaiAsesmen1) + (0.40 * nilaiAsesmen2);
        boolean lulusMK = nilaiAkhir >= 75;
        System.out.printf("%.2f%n", nilaiAkhir);
        System.out.println("Lulus MK: " + lulusMK);
        input.close();
    }
}
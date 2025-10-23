import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double r = in.nextDouble(); // jari-jari
        double h = in.nextDouble(); // tinggi tabung
        double t = in.nextDouble(); // tinggi air

        double vMax = hitungVMax(r, h);
        double vAir = hitungVAir(r, t);
        double persen = hitungPersen(t, h);

        System.out.printf("%.2f %.2f %.1f%%\n", vMax, vAir, persen);
    }

    private static double hitungVMax(double r, double h) {
        return 3.14159 * r * r * h;
    }

    private static double hitungVAir(double r, double t) {
        return 3.14159 * r * r * t;
    }

    private static double hitungPersen(double t, double h) {    
        return (t / h) * 100;
    }
}

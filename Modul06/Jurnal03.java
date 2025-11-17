import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double jari2 = in.nextDouble(); // jari-jari
        double tinggitabung = in.nextDouble(); // tinggi tabung
        double tinggiair = in.nextDouble(); // tinggi air

        double vMax = hitungVMax(jari2, tinggitabung);
        double vAir = hitungVAir(jari2, tinggiair);
        double persen = hitungPersen(tinggiair, tinggitabung);

        System.out.printf("%.2f %.2f %.1f%%\n", vMax, vAir, persen);
    }

    private static double hitungVMax(double jari2, double tinggitabung) {
        return 3.14159 * jari2 * jari2 * tinggitabung;
    }

    private static double hitungVAir(double jari2, double tinggiair) {
        return 3.14159 * jari2 * jari2 * tinggiair;
    }

    private static double hitungPersen(double tinggiair, double tinggitabung) {    
        return (tinggiair / tinggitabung) * 100;
    }
}

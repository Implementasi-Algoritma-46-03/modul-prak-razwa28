import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double r = in.nextDouble(); // jari-jari
        double h = in.nextDouble(); // tinggi tabung
        double t = in.nextDouble(); // tinggi air

        double vMax = Math.PI * r * r * h;
        double vAir = Math.PI * r * r * t;
        double persen = (t / h) * 100;

        System.out.printf("%.2f %.2f %.1f%%", vMax, vAir, persen);
    }
}

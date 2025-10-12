import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Input
        Scanner s = new Scanner(System.in);
        String bentuk = s.nextLine();
        double b        = 0.0; 
        double a        = 0.0; 
        double luas     = 0.0;
        double keliling = 0.0;

        // Proses
        switch (bentuk) {
            case "Persegi":
                a = s.nextDouble();
                luas = a * a;
                keliling = 4 * a;
                break;

            case "Persegi Panjang":
                a = s.nextDouble();
                b = s.nextDouble();
                luas = a * b;
                keliling = 2 * (a + b);
                break;

            case "Segitiga":
                a = s.nextDouble();
                b = s.nextDouble(); 
                luas = (a * b) / 2;
                double t = (a * a + b * b);
                double x = 0.0;
                    if (a > b) {
                        x = a;
                    } else {
                        x = b;
                    }

                double miring = (x + (t / x)) / 2; 
                keliling = a + b + miring;
                break;

            case "Lingkaran":
                a = s.nextDouble();
                double r = a / 2.0;
                luas = 3.14 * r * r;
                keliling = 2 * 3.14 * r;
                break;
        }

        // Output
        if (bentuk.equals("Lingkaran")) {
            System.out.printf("%.2f %.2f%n", luas, keliling);
        } else {
            System.out.printf("%d %d%n", (int)luas, (int)keliling);
        }
    }
}
import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Input
        Scanner s = new Scanner(System.in);
        String bentuk = s.nextLine();
        double tinggi = 0.0;
        double alas = 0.0;
        double luas = 0.0;
        double keliling = 0.0;


        // Proses
        switch (bentuk) {
            case "Persegi":
                alas = s.nextDouble();
                luas = alas * alas;
                keliling = 4 * alas;
                break;

            case "Persegi Panjang":
                alas = s.nextDouble();
                tinggi = s.nextDouble();
                luas = alas * tinggi;
                keliling = 2 * (alas + tinggi);
                break;

            case "Segitiga":
                alas = s.nextDouble();
                tinggi = s.nextDouble(); 
                luas = (alas * tinggi) / 2;
                double t = (alas * alas + tinggi * tinggi);
                double x = 0.0;
                    if (alas > tinggi) {
                        x = alas;
                    } else {
                        x = tinggi;
                    }

                double miring = (x + (t / x)) / 2; 
                keliling = alas + tinggi + miring;
                break;

            case "Lingkaran":
                alas = s.nextDouble();
                double r = alas / 2.0;
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
import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine(); // baca nama bangun datar
        nama = nama.trim(); // hilangkan spasi tambahan

        double luas = 0, keliling = 0;

        switch (nama.toLowerCase()) {
            case "persegi": {
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                break;
            }

            case "persegi panjang": {
                double panjang = input.nextDouble();
                double lebar = input.nextDouble();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                break;
            }

            case "segitiga":
                double a = input.nextDouble();
                double b = input.nextDouble(); 
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


            case "lingkaran": {
                double diameter = input.nextDouble();
                double jari = diameter / 2;
                double pi = 3.14;
                luas = pi * jari * jari;
                keliling = pi * diameter;
                break;
            }

            default:
                System.out.println("Bangun datar tidak dikenal.");
                return;
        }

        // Cetak hasil: luas dan keliling (maksimal 2 angka di belakang koma)
        if (nama.equals("Lingkaran")) {
            System.out.printf("%.2f %.2f%n", luas, keliling);
        } else {
            System.out.printf("%d %d%n", (int)luas, (int)keliling);
        }
    }
}

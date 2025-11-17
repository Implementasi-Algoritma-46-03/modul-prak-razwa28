import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bangun = in.nextLine().toLowerCase();
        String hasil = "";

        switch (bangun) {
            case "persegi":
                hasil = hitungPersegi(in.nextInt());
                break;
            case "persegi panjang":
                hasil = hitungPersegiPanjang(in.nextInt(), in.nextInt());
                break;
            case "segitiga":
                hasil = hitungSegitiga(in.nextInt(), in.nextInt());
                break;
            case "lingkaran":
                hasil = hitungLingkaran(in.nextInt());
                break;
            default:
                hasil = "Bangun datar tidak dikenal!";
        }
        System.out.print(hasil);
    }
    static String hitungPersegi(int s) {
        double luas = s * s;
        double keliling = 4 * s;
        return String.format("%.0f %.0f", luas, keliling);
    }
    static String hitungPersegiPanjang(int p, int l) {
        double luas = p * l;
        double keliling = 2 * (p + l);
        return String.format("%.0f %.0f", luas, keliling);
    }
    static String hitungSegitiga(int a, int t) {
        double miring = Math.sqrt(a * a + t * t);
        double luas = 0.5 * a * t;
        double keliling = a + t + miring;
        return String.format("%.0f %.0f", luas, keliling);
    }
    static String hitungLingkaran(int d) {
        double r = d / 2.0;
        double luas = 3.14 * r * r;
        double keliling = 3.14 * d;
        return String.format("%.2f %.2f", luas, keliling);
    }
}
import java.text.DecimalFormat;

public class Jurnal01 {
    public static void main(String[] args) {
        // Ganti sesuai test case
        String namaMakanan = "Nasi Goreng";
        int jumlah = 3;
        int harga = 15000;

        int total = jumlah * harga;
        DecimalFormat df = new DecimalFormat("#,###");
        String totalFormat = df.format(total).replace(",", ".");

        System.out.println(namaMakanan + " " + jumlah + " buah, total harga Rp. " + totalFormat);
    }
}

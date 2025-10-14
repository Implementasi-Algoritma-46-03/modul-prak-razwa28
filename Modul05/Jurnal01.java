import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMakanan = "Nasi Goreng";
        int jumlah = 3;
        int harga = 15000;

        System.out.println(namaMakanan + " " + jumlah + " buah, total harga Rp. " + (jumlah * harga));
    }
}

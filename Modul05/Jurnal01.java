import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int kode = Scanner.nextInt();
        int jumlah = Scanner.nextInt();

        String namaMenu = "";
        int harga = 0;
        switch (kode) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15;
                break;
            case 2:
                namaMenu = "Mie Goreng / Nyemek";
                harga = 18;
                break;
            case 3:
                namaMenu = "Kwetiau Goreng / Nyemek";
                harga = 20;
                break;
            case 4:
                namaMenu = "Capcay Goreng / Kuah";
                harga = 23;
                break;
            default:
                System.out.print("Kode menu tidak valid!");
                        return;
        }
        int totalHarga = harga * jumlah;
        System.out.print(namaMenu + " " + jumlah + " buah, total harga Rp. " + totalHarga + ".000");
    }
}

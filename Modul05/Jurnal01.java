import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu = in.nextLine();
        int jumlah = in.nextInt();

        int harga = 0;

        if (menu.equalsIgnoreCase("Nasi Goreng")) {
            harga = 15000;
        } else if (menu.equalsIgnoreCase("Kwetiau Goreng") || menu.equalsIgnoreCase("Kwetiau Nyemek")) {
            harga = 20000;
        }

        int total = harga * jumlah;

        System.out.println(menu + " " + jumlah + " buah, total harga Rp. " + String.format("%,d", total).replace(',', '.'));
    }
}

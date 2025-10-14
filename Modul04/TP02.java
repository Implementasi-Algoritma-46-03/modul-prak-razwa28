import java.util.Scanner;
<<<<<<< HEAD

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int transaksi = input.nextInt();
        double total = transaksi;
        double diskon = 0;

        if (transaksi > 200000) {
            diskon = transaksi * 0.05;
            total = transaksi - diskon;
            System.out.println("Transaksi = " + transaksi);
            System.out.println("Total = " + transaksi + " - " + (int)diskon);
        } else {
            System.out.println("Transaksi = " + transaksi);
            System.out.println("Total = " + transaksi);
        }

        double ppn = total * 0.11;
        double totalDibayar = total + ppn;

        System.out.println("Ppn 11% = " + ppn);
        System.out.println("Total dibayar = " + totalDibayar);

        input.close();
=======
public class TP02 {

    public static void main(final String[] args) {
         Scanner scanner = new Scanner(System.in);
        int totalTransaksi = scanner.nextInt();

        double jumlahDiskon = 0.0;
        if (totalTransaksi > 200000) {
            jumlahDiskon = 0.05 * totalTransaksi;
        }

        double totalSetelahDiskon = totalTransaksi - jumlahDiskon;
        double pajakPpn = 0.11 * totalSetelahDiskon;
        double totalPembayaran = totalSetelahDiskon + pajakPpn;

        System.out.println("Transaksi = " + totalTransaksi);
        System.out.println("Total = " + totalTransaksi + " - " + jumlahDiskon);
        System.out.println("Ppn 11% = " + pajakPpn);
        System.out.println("Total dibayar = " + totalPembayaran);

        scanner.close();

public class TP02 {

    public static void main(final String[] args) {
        Scanner n = new Scanner(System.in);
        int harga = n.nextInt();
        double diskon = 0;

        if (harga >= 200000) {
            diskon = harga * 0.05;
        }

        double total = harga - diskon;
        double pajak = total * 0.11;
        double totalBayar = total + pajak;

        System.out.println("Transaksi = " + harga);
        if (diskon > 0) {
            System.out.printf("Total = %.0f%s%.0f%n", (double) harga, " - ", diskon);
        } else {
            System.out.printf("Total = %.0f%n", (double) harga);
        }
        System.out.printf("Ppn 11%% = %.1f%n", pajak);
        System.out.printf("Total dibayar = %.1f%n", totalBayar);
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec
    }
}
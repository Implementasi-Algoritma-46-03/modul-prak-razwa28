import java.util.Scanner;

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
    }
}

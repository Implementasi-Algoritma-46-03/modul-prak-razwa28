import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBelanja = input.nextInt();
        
        int diskonBelanja = 5; // diskon = 5%
        int pajak = 11; // pajak = 11%
        

        if (jumlahBelanja > 200_000) {
            double totalPotongan = jumlahBelanja * (diskonBelanja / 100.0);
            double hasilPotongan = jumlahBelanja - totalPotongan;

            double hasilPajak = hasilPotongan * (pajak / 100.0);
            // hasilPemotonganPajak = totalPotongan - hasilPajak;
            double totalBelanja = hasilPotongan + hasilPajak;

            System.out.println("Transaksi = " + jumlahBelanja);
            System.out.println("Total = " + jumlahBelanja + " - " + (int)totalPotongan);
            System.out.println("Ppn 11% = " + (hasilPajak));
            System.out.println("Total dibayar = " + totalBelanja);

        } else {
            double hasilPajak = jumlahBelanja * (pajak / 100.0);
            // hasilPemotonganPajak = totalPotongan - hasilPajak;
            double totalBelanja = jumlahBelanja + hasilPajak;

            System.out.println("Transaksi = " + jumlahBelanja);
            System.out.println("Total = " + jumlahBelanja);
            System.out.println("Ppn 11% = " + (hasilPajak));
            System.out.println("Total dibayar = " + totalBelanja);
        }
        input.close();
    }
}
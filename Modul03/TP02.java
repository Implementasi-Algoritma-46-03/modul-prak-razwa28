import java.util.Scanner;
public class TP02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaPembeli = input.next();
        int jumlahBarang = input.nextInt();
        int hargaPerBarang = input.nextInt();
        int totalBelanja = jumlahBarang * hargaPerBarang;
        System.out.println("Hi, " + namaPembeli + ". Total belanja adalah " + totalBelanja + " rupiah.");
        input.close();
    }
        Scanner input = new Scanner(System.in);

        // Hitung total harga belanja
        totalBelanja = jumlahBarang * hargaPerBarang;

        // Cetak output sesuai format: "Hi [nama], total belanja adalah [total] rupiah."
        // Menggunakan System.out.println untuk mencetak keseluruhan string
        System.out.println("Hi " + nama + ", total belanja adalah " + totalBelanja + " rupiah.");

        // Menutup objek Scanner
        scanner.close();
    }
}
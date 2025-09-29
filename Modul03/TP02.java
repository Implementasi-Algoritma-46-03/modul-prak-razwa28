import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan harga: ");
        int harga = input.nextInt();

        int total = jumlah * Harga;

        System.out.println("Hi," + nama + ". total belanja kamu = " + total + " Rupiah");

        input.close(); // jangan lupa tutup scanner
    }
}

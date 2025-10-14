import java.util.Scanner;
<<<<<<< HEAD

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        int jumlah = sc.nextInt();
        int harga = sc.nextInt();

        int total = jumlah * harga;
        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");
    }
} 
=======

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.next();
        int jumlahBarang = input.nextInt();
        int hargaPerBarang = input.nextInt();
        int totalBelanja = jumlahBarang * hargaPerBarang;
        System.out.println("Hi, " + nama + ". Total belanja adalah " + totalBelanja + " rupiah.");
        input.close();
public class TP02 {

    public static void main(String[] args) {
        Scanner tugas2 = new Scanner(System.in);
         // Kerjakan soalnya di sini

        String nama = tugas2.next();
        int jumlah = tugas2.nextInt();
        int harga = tugas2.nextInt();

        int total = harga * jumlah;

        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");

        tugas2.close();
    }
}

/**PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16> cd Modul01
PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> javac TP02.java
E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> java TP02
Dira 5 2000
10000*/
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec

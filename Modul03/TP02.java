import java.util.Scanner;

public class TP02b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        int jumlah = sc.nextInt();
        int harga = sc.nextInt();
        int total = jumlah * harga;
        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah");
    }
} 

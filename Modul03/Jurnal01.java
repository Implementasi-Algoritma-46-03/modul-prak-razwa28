import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        int total = angka / 1000;
        int sisa = angka %1000 ;
        System.out.println( total);
        System.out.println( sisa);
    } 
}

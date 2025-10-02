import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String angka = sc.nextLine();

        String depan = angka.substring(0, angka.length() - 3);
        String belakang = angka.substring(angka.length() - 3);

        System.out.println(depan);
        System.out.println(belakang);
    } 
}

import java.util.Scanner;

public class TP01a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modal = sc.nextInt();
        int biaya = sc.nextInt();
        int hari = sc.nextInt();
        int hasil = (modal - biaya) * hari;
        System.out.println(hasil);
    }
}  

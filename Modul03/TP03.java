import java.util.Scanner;
public class TP03 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);
        int jumlahPermen = scanner.nextInt();
        int jumlahTeman = scanner.nextInt();
        int totalOrang = jumlahTeman + 1;
        int jatahPermen = jumlahPermen / totalOrang;
        int sisaPermen = jumlahPermen % totalOrang;
        System.out.println(jatahPermen);
        System.out.println(sisaPermen);
        scanner.close();
    }
}

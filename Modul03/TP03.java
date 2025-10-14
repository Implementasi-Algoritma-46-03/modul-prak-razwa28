import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // TP03
        Scanner tugas3 = new Scanner(System.in);

        int jumlahpermen = tugas3.nextInt();
        int jumlahteman = tugas3.nextInt();

        int total = jumlahteman + 1;

        int orang = jumlahpermen / total;
        int permen = jumlahpermen % orang;

        System.out.println(orang);
        System.out.println(permen);

        tugas3.close();
    }
}

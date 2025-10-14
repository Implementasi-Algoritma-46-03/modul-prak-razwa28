import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahUang = input.nextInt();
        int lembarSeribu = jumlahUang / 1000;
        int sisaUang = jumlahUang % 1000;
        System.out.println(lembarSeribu);
        System.out.println(sisaUang);
        input.close();
    }
}


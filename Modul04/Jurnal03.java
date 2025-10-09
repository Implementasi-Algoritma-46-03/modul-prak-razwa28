import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();

        // Urutkan tiga nilai dari kecil ke besar pakai if-else
        if (dira <= radi && dira <= idar) {
            if (radi <= idar) {
                System.out.println("Dira, Radi, Idar");
            } else {
                System.out.println("Dira, Idar, Radi");
            }
        } else if (radi <= dira && radi <= idar) {
            if (dira <= idar) {
                System.out.println("Radi, Dira, Idar");
            } else {
                System.out.println("Radi, Idar, Dira");
            }
        } else { // berarti idar paling kecil
            if (dira <= radi) {
                System.out.println("Idar, Dira, Radi");
            } else {
                System.out.println("Idar, Radi, Dira");
            }
        } 

        input.close();
    }
}
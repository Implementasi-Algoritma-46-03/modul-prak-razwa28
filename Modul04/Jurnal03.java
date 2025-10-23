import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int Dira = input.nextInt();
        int Radi = input.nextInt();
        int Idar = input.nextInt();

        if (Dira < Radi && Dira < Idar && Radi < Idar) {
            System.out.println("Dira, Radi, Idar");
        } else if (Dira < Radi && Dira < Idar && Radi > Idar) {
            System.out.println( "Dira, Idar, Radi");
        } else if (Idar < Dira && Idar < Radi && Radi < Dira) {
            System.out.println("Idar, Radi, Dira");
        } else if (Idar < Dira && Idar < Radi && Radi > Dira) {
            System.out.println("Idar, Dira, Radi");
        } else if (Radi < Dira && Radi < Idar && Dira < Idar) {
            System.out.println("Radi, Dira, Idar");
        } else {
            System.out.println("Radi, Idar, Dira");
        }
    }
}

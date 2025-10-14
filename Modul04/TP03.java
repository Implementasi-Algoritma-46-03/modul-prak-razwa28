import java.util.Scanner;
<<<<<<< HEAD

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();

        if (dira > radi && dira > idar) {
            System.out.println("Dira");
        } else if (radi > dira && radi > idar) {
=======
public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilaiDira = scanner.nextInt();
        int nilaiRadi = scanner.nextInt();
        int nilaiIdar = scanner.nextInt();

        if (nilaiDira > nilaiRadi && nilaiDira > nilaiIdar) {
            System.out.println("Dira");
        } else if (nilaiRadi > nilaiDira && nilaiRadi > nilaiIdar) {
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

<<<<<<< HEAD
        input.close();
=======
        scanner.close();
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int r = s.nextInt();
        int i = s.nextInt();

        if (d > r && d > i)
            System.out.println("Dira");
        else if (r > d && r > i)
            System.out.println("Radi");
        else
            System.out.println("Idar");
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec
    }
}

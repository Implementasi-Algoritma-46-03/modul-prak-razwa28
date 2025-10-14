import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilaiDira = scanner.nextInt();
        int nilaiRadi = scanner.nextInt();
        int nilaiIdar = scanner.nextInt();

        if (nilaiDira > nilaiRadi && nilaiDira > nilaiIdar) {
            System.out.println("Dira");
        } else if (nilaiRadi > nilaiDira && nilaiRadi > nilaiIdar) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

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
    }
}

import java.util.Scanner;
<<<<<<< HEAD

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 6 == 0) {
            System.out.println("Kelipatan enam");
=======
//testinggg
public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        if (angka % 6 == 0) {
            System.out.println("Kelipatan Enam");
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec
        } else {
            System.out.println("Bukan kelipatan enam");
        }

<<<<<<< HEAD
        input.close();
=======
        scanner.close();
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec
    }

public class TP01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int bil = s.nextInt();
        int hasil = bil % 6;
        if (hasil == 0) 
            System.out.println("Kelipatan enam");
        else
            System.out.println("Bukan kelipatan enam");
        }
}


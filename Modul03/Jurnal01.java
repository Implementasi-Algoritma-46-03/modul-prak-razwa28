import java.util.Scanner;
<<<<<<< HEAD

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        int total = angka / 1000;
        int sisa = angka %1000 ;
        System.out.println( total);
        System.out.println( sisa);
    } 
}
=======

public class Jurnal01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahUang = sc.nextInt();

        int lembar = jumlahUang / 1000;
        int sisa = jumlahUang % 1000;

        System.out.println(lembar);
        System.out.println(sisa);

        sc.close();
    public static void main(final String[] args) {
       Scanner input = new Scanner(System.in);

       //input
       int N = input.nextInt();
       int lembar = N / 1000;
       int sisaUang = N % 1000;

      System.out.println(lembar);
        System.out.println(sisaUang);
input.close();

        // Kerjakan soalnya di sini
        Scanner tugas1 = new Scanner(System.in);

        int uang = tugas1.nextInt();
        
        int jumlah = uang / 1000;
        
        System.out.println(jumlah);

        int sisa = uang % 1000;

        System.out.println(sisa);

        tugas1.close();
    }
}
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec

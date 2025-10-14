<<<<<<< HEAD
import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modal = sc.nextInt();
        int biaya = sc.nextInt();
        int hari = sc.nextInt();

        int hasil =  (biaya * hari) + modal;
        System.out.println(hasil);
=======
//mengimpor scanner (supaya bisa membaca input dari keyboard)
import java.util.Scanner;

//membuat kelas namanya TP01, harus sesuai sama nama file
import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {

        //membuat objek scanner namanya input
        Scanner input = new Scanner(System.in);

        //menginput tiga bagian
        int tabunganAwal = input.nextInt();
        int tabunganHarian = input.nextInt();
        int jumlahHari = input.nextInt();

        //total tabungan itu dari tabungan awal ditambah tabungan harian yang dikali jumlah hari.
        int totalTabungan = tabunganAwal + (tabunganHarian * jumlahHari);
 
        //menampilkan hasil akhir tabungan
        System.out.println(totalTabungan);
        //nutup scanner
        input.close();
    }
}

/*PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16> cd Modul01
PS E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> javac TP01.java
E:\Pasyaaaaaaa\d3if-49-03-Pasya16\Modul01> java TP01
500000 10000 30
800000*/
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

        Scanner tugas1 = new Scanner(System.in);

        int x = tugas1.nextInt();
        int y = tugas1.nextInt();
        int n = tugas1.nextInt();
        
        int total = x + (y * n);

        System.out.println(total);
        
        tugas1.close();
>>>>>>> d1830aa6b90ff37261a032044a713f16c7a406ec
    }
}

import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        //Input
        Scanner s = new Scanner(System.in);
        String kalimat = s.nextLine();

        //Proses
        String[] arrKata = kalimat.split("\\s+");
        int jumlah = 0;

        if (arrKata.length == 1 && arrKata[0].equals("")) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < arrKata.length; i++) {
            jumlah++;
        }

        //Output
        System.out.println(jumlah);
    }
}
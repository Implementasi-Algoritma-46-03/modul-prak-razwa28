import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();

        String hasil = nama.replaceAll("[aiueoAIUEO]", "");
        System.out.println(hasil);
    }
}

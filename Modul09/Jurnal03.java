import java.util.*;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int masukan = in.nextInt();

        int hasil = 0;

        for(int i = 1; i <= masukan; i++){
            if (masukan % i ==0 ) {
                hasil++;
            }
        }
            if (hasil == 2) {
                System.out.println("YA");
            }else {
                System.out.println("BUKAN");
            }
    }
}

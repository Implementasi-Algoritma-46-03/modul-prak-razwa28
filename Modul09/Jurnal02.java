import java.util.*;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int hasil = 0;

        for(int i = 1;i <= a ; i+=2){
            hasil += i;
        }
        System.out.println(hasil);
    }
}

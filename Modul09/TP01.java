import java.util.*;

public class TP01 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i = 1; i <= a; i++){
            if (i %2 == 0) {
                System.out.println(i +" Genap");
            } else {
                System.out.println(i +" Ganjil");
            }
        }
    }
}

import java.util.*;

public class TP02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine();
        in.close();

        int jumlahvocal = 0;

        for(int i = 0; i < kalimat.length(); i++){
            char c = kalimat.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                jumlahvocal++;
            }
        }
        System.out.println(jumlahvocal);
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> hasilangka = new ArrayList<Integer>();
        int angka = 0;
        while(angka != -1) {
            angka = s.nextInt();
            hasilangka.add(angka);
        }

        int hasil = 0;
        int hasilPertama = 0;
        for (int i = 0; i < hasilangka.size(); i++){
            int banding = 0;
            for (int j = i; j < hasilangka.size(); j++){
                if (hasilangka.get(i) == hasilangka.get(j)){
                    banding++;
                }
            }
            if (banding >= hasilPertama){
                hasil = hasilangka.get(i);
                hasilPertama = banding;
            }
        }
        System.out.println(hasil);
    }
}
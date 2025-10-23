import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        String lagu = input.nextLine();
        String hasilkw = hapus(lagu);
        String hasilSemua = hapusA(hasilkw);
        

        System.out.println(hasilSemua);
    }

    private static String hapus(String pengganti) {
        int a = pengganti.length();
        int b = a % 5;

        String hasil = null;
        switch (b) {
        case 0:
            hasil = pengganti.replaceAll("[iueo]", "a");
            break;
        case 1:
            hasil = pengganti.replaceAll("[aiuo]", "e");
            break;
        case 2:
            hasil = pengganti.replaceAll("[aueo]", "i");
            break;
        case 3:
            hasil = pengganti.replaceAll("[aiue]", "o");
            break;
        case 4:
            hasil = pengganti.replaceAll("[aieo]", "u");
            break;
        default:
        }
         return hasil;
    }

        private static String hapusA(String pengganti) {
        int a = pengganti.length();
        int b = a % 5;
        
        String hasil = null;
        switch (b) {
        case 0:
            hasil = pengganti.replaceAll("[IUEO]", "A");
            break;
        case 1:
            hasil = pengganti.replaceAll("[AIUO]", "E");
            break;
        case 2:
            hasil = pengganti.replaceAll("[AUEO]", "I");
            break;
        case 3:
            hasil = pengganti.replaceAll("[AIUE]", "O");
            break;
        case 4:
            hasil = pengganti.replaceAll("[AIEO]", "U");
            break;
        default:
        }
        return hasil;
    }
}
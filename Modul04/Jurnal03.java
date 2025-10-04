import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();

        int[] nilai = {dira, radi, idar};
        String[] nama = {"Dira", "Radi", "Idar"};

        // Urutkan dari nilai terkecil ke terbesar (bubble sort)
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int tempNilai = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = tempNilai;

                    String tempNama = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = tempNama;
                }
            }
        }

        System.out.println(nama[0] + ", " + nama[1] + ", " + nama[2]);

        input.close();
    }
}

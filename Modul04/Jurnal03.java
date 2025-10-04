import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idar = input.nextInt();
        int dira = input.nextInt();
        int radi = input.nextInt();

        // Nilai + nama dalam array
        int[] nilai = {idar, dira, radi};
        String[] nama = {"Idar", "Dira", "Radi"};

        // Bubble sort berdasarkan nilai (menaik)
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

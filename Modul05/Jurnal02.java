import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        // Gunakan next() agar tidak terseret spasi
        String hari = input.next();
        int bilanganBulat = input.nextInt();

        int HariSekarang = 0;
        switch (hari) {
            case "Senin": HariSekarang = 1; break;
            case "Selasa": HariSekarang = 2; break;
            case "Rabu": HariSekarang = 3; break;
            case "Kamis": HariSekarang = 4; break;
            case "Jum'at": HariSekarang = 5; break;
            case "Sabtu": HariSekarang = 6; break;
            case "Minggu": HariSekarang = 7; break;
        }

        int HariSetelah = (HariSekarang + bilanganBulat) % 7;
        if (HariSetelah == 0) HariSetelah = 7;

        switch (HariSetelah) {
            case 1: System.out.println("Senin"); break;
            case 2: System.out.println("Selasa"); break;
            case 3: System.out.println("Rabu"); break;
            case 4: System.out.println("Kamis"); break;
            case 5: System.out.println("Jum'at"); break;
            case 6: System.out.println("Sabtu"); break;
            case 7: System.out.println("Minggu"); break;
        }
    }
}

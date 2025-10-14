import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hari = input.nextLine();

        switch (hari) {
            case "Senin": System.out.println("Selasa"); break;
            case "Selasa": System.out.println("Rabu"); break;
            case "Rabu": System.out.println("Kamis"); break;
            case "Kamis": System.out.println("Jum'at"); break;
            case "Jum'at": System.out.println("Sabtu"); break;
            case "Sabtu": System.out.println("Minggu"); break;
            case "Minggu": System.out.println("Senin"); break;
            default: System.out.println("Hari tidak valid");
        }
    }
}

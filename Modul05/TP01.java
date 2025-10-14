import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String bulan = in.nextLine();

        switch (bulan) {
            case "januari":
                System.out.println("janvier");
                break;
            case "februari":
                System.out.println("fevrier");
                break;
            case "maret":
                System.out.println("mars");
                break;
            case "april":
                System.out.println("avril");
                break;
            case "mei":
                System.out.println("mai");
                break;
            case "juni":
                System.out.println("juin");
                break;
            case "juli":
                System.out.println("juillet");
                break;
            case "agustus":
                System.out.println("aout");
                break;
            case "september":
                System.out.println("septembre");
                break;
            case "october":
                System.out.println("oktobre");
                break;
            case "november":
                System.out.println("novembre");
                break;
            case "desember":
                System.out.println("decembre");
                break;
        
            default:
            System.out.println("Kata tidak ada!");
                break;
        }
    }
}

import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int b =  N % 7;

        switch (b) {
            case 0: 
            System.out.println("vendredi"); // jum'at
            break;
            case 1:
            System.out.println("samedi"); //sabtu
            break;
            case 2:
            System.out.println("dimanche"); //minggu
            break;
            case 3:
            System.out.println("lundi"); //senin
            break;
            case 4:
            System.out.println("mardi"); //selasa
            break;
            case 5:
            System.out.println("mercredi"); //rabu
            break;
            case 6:
            System.out.println("jeudi"); //kamis
            break;
        
            default:
                break;
        }
    }
}

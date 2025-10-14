import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int bil = input.nextInt();
        int hasil = bil % 6;
        
        if (hasil == 0) 
            System.out.println("Kelipatan enam");
        else
            System.out.println("Bukan kelipatan enam");
        }

        // Menutup objek Scanner
        scanner.close();
    }

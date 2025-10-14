import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        String op = input.next();
        double b = input.nextDouble();

        double hasil = 0;

        switch (op) {
            case "+": hasil = a + b; break;
            case "-": hasil = a - b; break;
            case "*": hasil = a * b; break;
            case "/": hasil = a / b; break;
            default: System.out.println("Operator tidak dikenal"); return;
        }

        // Format agar sesuai (7 angka desimal)
        if (op.equals("/")) {
            System.out.printf("%.7f%n", hasil);
        } else {
            System.out.println(hasil);
        }
    }
}

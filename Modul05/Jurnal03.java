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

        System.out.println(hasil);
    }
}

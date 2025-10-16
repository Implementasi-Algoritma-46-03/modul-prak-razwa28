import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        char op = input.next().charAt(0); 
        int b = input.nextInt();


        switch (op) {
            case '+':
            System.out.println(a + b);
            break;
            case '-': 
            System.out.println(a-b);
            case '*': 
            System.out.println(a*b);
            break;
            case '/':
            System.out.printf("%.7f", (double)a/b);
            break;
            default: System.out.println("Operator tidak dikenal"); return;
        }
    }
}

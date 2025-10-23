import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double R1 = in.nextDouble();
        double R2 = in.nextDouble();
        double R3 = in.nextDouble();

        System.out.print("Celcius: ");
        System.out.printf("%.1f %.1f %.1f%n", 
            toCelcius(R1), toCelcius(R2), toCelcius(R3));
        System.out.print("\nReamur: ");    
        System.out.printf("%.2f %.2f %.2f%n", 
            toReamur(R1), toReamur(R2), toReamur(R3));
            
    }

    private static double toCelcius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    private static double toReamur(double f) {
        return (f - 32) * 4 / 9;
    }
}
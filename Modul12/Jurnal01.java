import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        int banyakArr = s.nextInt();
        int[][] arr1 = input(s, banyakArr);

        
        for (int i = arr1.length-1; i >= 0; i--) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);
                if (j < arr1.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private static int[][] input(Scanner s, int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
}
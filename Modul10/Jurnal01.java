public class Jurnal01 {

    public static void main(final String[] args) {
         for (int i = 1; i <= 6; i++) {

            if (i % 2 == 0) {
                System.out.print(" ");
            }

            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
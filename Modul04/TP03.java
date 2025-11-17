import java.util.Scanner;

public class TP03 {
   public static void main(String[] var0) {
      Scanner input = new Scanner(System.in);
      int nilaiDira = input.nextInt();
      int nilaiRadi = input.nextInt();
      int nilaiIdar = input.nextInt();
      
      if (nilaiDira > nilaiRadi && nilaiDira > nilaiIdar) {
         System.out.println("Dira");
      } else if (nilaiRadi > nilaiDira && nilaiRadi > nilaiIdar) {
         System.out.println("Radi");
      } else {
         System.out.println("Idar");
    }
}
}

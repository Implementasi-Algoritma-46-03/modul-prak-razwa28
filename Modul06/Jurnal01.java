    import java.util.Scanner;

    public class Jurnal01 {

        public static void main(final String[] args) {
            Scanner in = new Scanner(System.in);
            String nama1 = in.nextLine();
            String nama2 = in.nextLine();
            int waktu = in.nextInt();

            String WaktuHari = WH(waktu);
            System.out.println("Halo, " + nama1 + ". Selamat " + WaktuHari +".");
            System.out.println("Halo, " + nama2 + ". Selamat " + WaktuHari +".");
        }
        
        private static String WH (int waktu){
            if (waktu >= 6 && waktu <= 11) {
                return "pagi"; 
            } else if (waktu >= 12 && waktu <= 14) {
                return "siang";
            } else if (waktu >= 15 && waktu <= 17) {
                return "sore";
            } else if((waktu >= 18 && waktu <= 23) || (waktu >= 0 && waktu <= 5)) {
                return "malam";
            } 

            return "-";
        }
    }

public class TilangNestedIf {
    public static void main(String[] args) {
        boolean Pelanggaran = true;
        boolean SIM = false;
        boolean STNK = true;

        // cek apakah dia akan ditilang atau tidak
        if (SIM == true) {
            if (STNK == true) {
                if (Pelanggaran == true) {
                    System.out.println("Tidak ditilang");
                } else
                    System.out.println("Anda ditilang");
            } else
                System.out.println("Anda ditilang");
        } else
            System.out.println("Anda ditilang");
    }
}
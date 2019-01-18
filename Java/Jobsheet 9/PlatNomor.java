public class PlatNomor {
    public static void main(String[] args) {
        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        String[] kotaStr = { "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA",
                "MALANG", "TEGAL" };
        char[][] kota = new char[10][12];
        for (int a = 0; a < kota.length; a++) {
            kota[a] = kotaStr[a].toCharArray();
            System.out.print("\n" + kode[a]);
            System.out.print("\t");
            for (int b = 0; b < kota[a].length; b++) {
                System.out.print(kota[a][b]);
            }
        }
    }
}
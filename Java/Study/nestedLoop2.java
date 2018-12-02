public class nestedLoop2 {
    public static void main(String[] args) {
        int baris, kolom;

        for (baris = 5; baris >= 1; baris--) {
            for (kolom = 0; kolom < baris; kolom++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
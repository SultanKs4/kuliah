public class nestedLoop1 {
    public static void main(String[] args) {
        int baris, kolom;

        for (baris = 0; baris < 5; baris++) {
            for (kolom = 0; kolom <= baris; kolom++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
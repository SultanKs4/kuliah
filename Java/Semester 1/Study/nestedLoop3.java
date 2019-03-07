public class nestedLoop3 {
    public static void main(String[] args) {
        int baris, kolom;

        for (baris = 0; baris < 5; baris++) {
            if (baris % 2 == 0) {
                for (kolom = 0; kolom <= 5; kolom++) {
                    System.out.print("*");
                }
            } else {
                for (kolom = 0; kolom < 2; kolom++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
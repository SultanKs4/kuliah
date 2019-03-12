import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai;

        System.out.print("Masukkan nilai ujian [ 0 - 100 ] : ");
        nilai = scan.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 90 && nilai <= 100)
                System.out.println("Nilai ujian = A");
            else if (nilai >= 80 && nilai <= 89)
                System.out.println("Nilai ujian = B");
            else if (nilai >= 60 && nilai <= 79)
                System.out.println("Nilai ujian = C");
            else if (nilai >= 50 && nilai <= 59)
                System.out.println("Nilai ujian = D");
            else
                System.out.println("Nilai ujian = E");
        } else
            System.out.println("Input tidak valid");
    }
}
import java.util.Scanner;

public class JS5_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sudutA, sudutB, sudutC, totalSudut;

        System.out.print("Masukkan nilai Sudut 1 : ");
        sudutA = scan.nextInt();
        System.out.print("Masukkan nilai Sudut 2 : ");
        sudutB = scan.nextInt();
        System.out.print("Masukkan nilai Sudut 3 : ");
        sudutC = scan.nextInt();

        if (sudutA > 0 || sudutB > 0 || sudutC > 0 || sudutA > 180 || sudutB > 180 || sudutC > 180) {
            totalSudut = sudutA + sudutB + sudutC;
            if (totalSudut == 180) {
                if (sudutA == sudutB + sudutC || sudutB == sudutA + sudutC || sudutC == sudutA + sudutB) {
                    System.out.print("SIKU-SIKU");
                } else
                    System.out.print("BUKAN SIKU-SIKU");
            } else
                System.out.print("Nilai Total Sudut Kurang / Lebih 180");
        } else
            System.out.print("Nilai Sudut tidak boleh dibawah 0 / diatas 180");
    }
}
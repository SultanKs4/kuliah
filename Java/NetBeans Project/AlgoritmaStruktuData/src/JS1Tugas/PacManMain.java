package JS1Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class PacManMain {
    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanChar = new Scanner(System.in);
    public static PacMan pm1BEnd = new PacMan();

    public static void main(String[] args) {
        startPacMan();
        mainPacMan();
    }

    public static void startPacMan() {
        System.out.println("!AWAL PAC MAN!");
        System.out.print("Tinggi Peta (px) : ");
        pm1BEnd.height = scanInt.nextInt();
        System.out.print("Panjang Peta (px) : ");
        pm1BEnd.width = scanInt.nextInt();
        System.out.println("!SUMMARY!");
        System.out.println("Tinggi : " + pm1BEnd.height + " px, Panjang : " + pm1BEnd.width + " px");
        System.out.println("!RULES!");
        System.out.println(
                "Posisi X & Y Tidak boleh dibawah 0, X tidak boleh melebihi Panjang, dan Y tidak boleh melebihi Tinggi");
        System.out.println("!POSISI Sekarang!");
        pm1BEnd.printPosition();
    }

    public static void mainPacMan() {
        while (true) {
            if (pm1BEnd.x < 0 || pm1BEnd.x > pm1BEnd.width || pm1BEnd.y < 0 || pm1BEnd.y > pm1BEnd.height) {
                System.out.println("\nGAME OVER!");
                break;
            }
            System.out.print("\nArah Gerak W (Atas) / A (Kiri) / S (Bawah) / D (Kanan) : ");
            char arah = scanChar.next().toUpperCase().charAt(0);
            if (arah == 'W') {
                pm1BEnd.moveUp();
                System.out.println("Gerak ke-Atas 1px");
            } else if (arah == 'A') {
                pm1BEnd.moveLeft();
                System.out.println("Gerak ke-Kiri 1px");
            } else if (arah == 'S') {
                pm1BEnd.moveDown();
                System.out.println("Gerak ke-Bawah 1px");
            } else if (arah == 'D') {
                pm1BEnd.moveRight();
                System.out.println("Gerak ke-Kanan 1px");
            } else {
                System.out.println("\n!Hanya boleh W/A/S/D saja!");
            }
            System.out.println("\n!POSISI Sekarang!");
            pm1BEnd.printPosition();
        }
    }
}

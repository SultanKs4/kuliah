package JS1Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class SewaGameMain {
    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanLine = new Scanner(System.in);
    public static SewaGame bEnd = new SewaGame();

    public static void main(String[] args) {
        inputSewa();
        destroyScan();
    }

    public static void inputSewa() {
        System.out.println("~Persewaan Video Game~");
        System.out.print("1. ID Member : ");
        bEnd.idMem = scanInt.nextInt();
        System.out.print("2. Nama Member : ");
        bEnd.namMem = scanLine.nextLine();
        System.out.print("3. Judul Game : ");
        bEnd.namGame = scanLine.nextLine();
        System.out.print("4. Durasi Sewa (HARI) : ");
        bEnd.lamPin = scanInt.nextInt();
        System.out.print("5. Harga Sewa Per-Hari : ");
        bEnd.priSewa = scanInt.nextInt();

        bEnd.printReceipt();
    }

    public static void destroyScan() {
        if (scanInt != null && scanLine != null) {
            scanInt.close();
            scanLine.close();
        }
    }
}

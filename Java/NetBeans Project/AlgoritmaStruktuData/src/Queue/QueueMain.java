
//package Queue;

import java.util.Scanner;

/**
 * @author Sultan
 * @see QueueMain
 */
public class QueueMain {
    public static void main(String[] args) {
        int i = 13, j = 11;
        boolean coba;
        coba = i > 15 || ++j > 10;
        System.out.println(i);
        System.out.println(j);
        System.out.println(coba);
        // Scanner sc = new Scanner(System.in);
        // int pil = 0;
        // Final boolean BW = true;

        // System.out.print("Masukkan berapa maksimal data antrian = ");
        // int m = sc.nextInt();
        // Queue qobj = new Queue(m);
        // do {
        // menu();
        // pil = sc.nextInt();
        // switch (pil) {
        // case 1:
        // System.out.print("Masukkan Data Baru = ");
        // int dataIn = sc.nextInt();
        // qobj.enqueue(dataIn);
        // break;
        // case 2:
        // int dataOut = qobj.dequeue();
        // if (dataOut != 0)
        // System.out.println("Data yang terambi = " + dataOut);
        // break;
        // case 3:
        // qobj.print();
        // break;
        // case 4:
        // qobj.printFront();
        // break;
        // case 5:
        // qobj.printRear();
        // break;
        // case 6:
        // System.out.print("Masukkan Data : ");
        // int data = sc.nextInt();
        // qobj.printPosition(data);
        // break;
        // case 7:
        // System.out.print("Masukkan Posisi : ");
        // int position = sc.nextInt();
        // qobj.printDataByPos(position - 1);
        // break;
        // }
        // } while (pil != 8);
    }

    static void menu() {
        System.out.println("Pilih operasi yang ingin dilakukan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Print Front");
        System.out.println("5. Print Rear");
        System.out.println("6. Print Position");
        System.out.println("7. Print Data By Position");
        System.out.println("8. Keluar");
    }
}
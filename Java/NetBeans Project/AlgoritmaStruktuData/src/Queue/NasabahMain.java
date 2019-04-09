package Queue;

import java.util.Scanner;

/**
 * @author Sultan
 * @see NasabahMain
 */
public class NasabahMain {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static QueueNasabah qobj;;
    static Nasabah nObj;

    public static void main(String[] args) {
        System.out.print("Masukkan berapa maksimal data antrian = ");
        int max = sc.nextInt();
        qobj = new QueueNasabah(max);
        loop();
    }

    static void loop() {
        int pil = 0;
        do {
            menu();
            System.out.print("Masukkan Pilihan = ");
            pil = sc.nextInt();
            System.out.println();
            switch (pil) {
            case 1:
                System.out.println("Masukkan Data Baru : ");
                System.out.print("Masukkan No. Rekening = ");
                String noRek = sc1.nextLine();
                System.out.print("Nama = ");
                String nm = sc1.nextLine();
                nObj = new Nasabah(noRek, nm);
                qobj.enqueue(nObj);
                break;
            case 2:
                Nasabah dataOut = qobj.dequeue();
                if (dataOut != null) {
                    System.out.println("Data yang terambil : ");
                    dataOut.print();
                } else
                    System.out.println("Tidak ada data nasabah yang di Dequeue!");
                break;
            case 3:
                qobj.print();
                break;
            case 4:
                qobj.printFront();
                break;
            case 5:
                qobj.printRear();
                break;
            case 6:
                System.out.println("Masukkan Data : ");
                System.out.print("Masukkan No. Rekening = ");
                noRek = sc1.nextLine();
                System.out.print("Masukkan Nama = ");
                nm = sc1.nextLine();
                nObj = new Nasabah(noRek, nm);
                qobj.printPosition(nObj);
                break;
            case 7:
                System.out.print("Masukkan Posisi : ");
                int position = sc.nextInt();
                qobj.printDataByPos(position - 1);
                break;
            }
        } while (pil != 8);
    }

    static void menu() {
        System.out.println("\nPilih operasi yang ingin dilakukan :");
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
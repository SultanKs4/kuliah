import java.util.Scanner;

public class PaketKomplit {
    static Scanner scan = new Scanner(System.in);
    static int pilihan, baris, kolom, array[][], min;

    public static void main(String[] args) {
        array();
    }

    public static void array() {
        System.out.print("Masukkan ukuran Baris Array : ");
        baris = scan.nextInt();
        System.out.print("Masukkan ukuran Kolom Array : ");
        kolom = scan.nextInt();
        array = new int[baris][kolom];
        System.out.println("-------------------------");
        System.out.println("Input elemen array :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Matrik [" + i + "][" + j + "]" + ": ");
                array[i][j] = scan.nextInt();
            }
            System.out.println("------------------------");
        }
        menu();
    }

    public static void menu() {
        System.out.println("-------------------------");
        System.out.println("1. Nilai MIN");
        System.out.println("2. Nilai MIN & Jumlahnya");
        System.out.println("3. Kondisi Array");
        System.out.println("-------------------------");
        verifMenu();
    }

    public static void verifMenu() {
        System.out.print("Masukkan Pilihan : ");
        pilihan = scan.nextInt();
        if (pilihan == 1) {
            nilaiMin();
        } else if (pilihan == 2) {
            nilaiMiDanJumlahnya();
        } else if (pilihan == 3) {
            kondisiArray();
        } else
            verifMenu();
    }

    public static void nilaiMin() {
        min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Paling kecil semuanya adalah " + min);
    }

    public static void nilaiMiDanJumlahnya() {
        nilaiMin();
        int jumlah = 0;
        System.out.print("Berada di posisi : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min == array[i][j]) {
                    jumlah++;
                    System.out.print("[" + i + "][" + j + "]  ");
                }
            }
        }
        System.out.println();
        System.out.println("Jumlahnya : " + jumlah);
    }

    public static void kondisiArray() {
        String keterangan = "TIDAK ADA";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 50) {
                    keterangan = "ADA";
                }
            }
        }
        System.out.println(keterangan);
    }
}
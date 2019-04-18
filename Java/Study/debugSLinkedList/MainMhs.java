import java.util.Scanner;

public class MainMhs {

    public static void menu() {
        System.out.println("======== DATA MAHASISWA ========");
        System.out.println("pilih menu  :  ");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Mencari Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Tampilan Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.println("================================");
        System.out.println();
    }

    public static void menu0() {
        System.out.println("TAMBAH DATA MAHASISWA");
        System.out.println("1. Tambah (first)");
        System.out.println("2. tambah (menurut index)");
        System.out.println("3. Tambah (ke data paling terakhir)");
    }

    public static void menu1() {
        System.out.println("MENCARI DATA MAHASISWA");
        System.out.println("1. Mencari melalui Index");
        System.out.println("2. Mencari melalui Nim");
    }

    public static void menu2() {
        System.out.println("MENGHAPUS DATA MAHASISWA");
        System.out.println("1. Menghapus melalui Index");
        System.out.println("2. Menghapus melalui Nim");
        System.out.println("3. Menghapus data first");
        System.out.println("4. Menghapus semua data Mahasiswa");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner ae = new Scanner(System.in);
        LinkedListMhs oop = new LinkedListMhs();
        int pilih, nim1, pilih1, pilih2, n, m, pilih3;
        String nama, nim, nama1;
        int index, index1;
        try {
            oop.addFirst("Sultan", "12345");
            oop.addLast("Achmad", "67890");
            oop.print();
            oop.removeKey("67890");
            oop.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
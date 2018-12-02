import java.util.Scanner;

class JS5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alas, tinggi, panjang, luas, jari, lebar;
        float luasLingkaran, luasSegitiga;

        System.out.println("=============================");
        System.out.println("Pilih Bangun :");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Jajar Genjang");
        System.out.println("4. Lingkaran");
        System.out.println("=============================");

        System.out.print("Masukkan Pilihan \t: ");
        int pilihan = scan.nextInt();
        System.out.println("=============================");

        switch (pilihan) {
        case 1:
            System.out.print("Masukkan Alas \t\t: ");
            alas = scan.nextInt();
            System.out.print("Masukkan Tinggi \t: ");
            tinggi = scan.nextInt();
            luasSegitiga = 0.5f * alas * tinggi;
            System.out.println("Luas  Segitiga \t\t: " + luasSegitiga);
            break;
        case 2:
            System.out.print("Masukkan Panjang \t: ");
            panjang = scan.nextInt();
            System.out.print("Masukkna Lebar \t\t: ");
            lebar = scan.nextInt();
            luas = panjang * lebar;
            System.out.println("Luas Persegi Panjang \t: " + luas);
            break;
        case 3:
            System.out.print("Masukkan  alas \t\t: ");
            alas = scan.nextInt();
            System.out.print("Masukkan tinggi \t: ");
            tinggi = scan.nextInt();
            luas = alas * tinggi;
            System.out.println("Luas Jajar Genjang\t: " + luas);
            break;
        case 4:
            System.out.print("Masukkan jari-jari \t: ");
            jari = scan.nextInt();
            luasLingkaran = 3.14f * jari * jari;
            System.out.println("Luas Lingkaran \t\t: " + luasLingkaran);
            break;
        default:
            System.out.println("Inputan salah!");
            break;
        }
    }
}
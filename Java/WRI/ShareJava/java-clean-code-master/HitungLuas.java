import java.util.Scanner;

class HitungLuas {
  static Scanner scan = new Scanner(System.in);
  public static void TampilkanMenu() {
      System.out.println("=======================");
      System.out.println("Pilih Bangun :");
      System.out.println("1. Persegi");
      System.out.println("2. Persegi Panjang");
      System.out.println("3. Lingkaran");
      System.out.println("4. Segitiga");
      System.out.println("=======================");
  }
  public static void HitungLuasPersegi() {
      System.out.print("sisi \t: ");
      int sisi = scan.nextInt();
      int luas = sisi * sisi;
      System.out.println("luas \t: " + luas);
  }
  public static void HitungLuasPersegiPanjang() {
      System.out.print("panjang \t: ");
      int panjang = scan.nextInt();
      System.out.print("lebar \t\t: ");
      int lebar = scan.nextInt();
      int luas = panjang * lebar;
      System.out.println("luas \t\t: " + luas);
  }
  public static void HitungLuasLingkaran() {
      System.out.print("radius \t: ");
      int radius = scan.nextInt();
      double luas = 3.14 * radius * radius;
      System.out.println("luas \t: " + luas);
  }
  public static void HitungLuasSegitiga() {
      System.out.print("alas \t: ");
      int alas = scan.nextInt();
      System.out.print("tinggi \t: ");
      int tinggi = scan.nextInt();
      double luas = 0.5 * alas * tinggi;
      System.out.println("luas \t: " + luas);
  }
  public static int PilihMenu() {
    System.out.print("Masukkan Pilihan \t: ");
      return scan.nextInt();
  }
  public static boolean Ulangi() {
    System.out.print("Ulangi (Y/N) ? ");
    char ulangi = scan.next().charAt(0);
    return ulangi == 'Y';
  }

  public static void main(String[] args) {
    do {
      TampilkanMenu();
      int pilihan = PilihMenu();

      if (pilihan == 1) {
        HitungLuasPersegi();
      } else if (pilihan == 2) {
        HitungLuasPersegiPanjang();
      } else if (pilihan == 3) {
        HitungLuasLingkaran();
      } else if (pilihan == 4) {
        HitungLuasSegitiga();
      } else {
        System.out.println("Inputan salah!");
      }
    } while (Ulangi());
  }

}
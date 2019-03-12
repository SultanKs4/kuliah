import java.util.Scanner;
class CekPrimaRekursif{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	System.out.print("Masukkan angka = ");
        int angka = sc.nextInt();
        if (cetak(angka)) {
            System.out.print("Angka yang anda masukan adalah bilangan PRIMA");	
        }
        else{
            System.out.print("Angka yang anda masukan BUKAN bilangan PRIMA");
        }
    }
    static int prime(int n, int bagi){
        if (bagi==1) {
            return 1;
        }
        else if(n % bagi ==0){
            return 1 + prime (n, bagi-1);
        }
        else{
            return 0 + prime(n, bagi-1);
        }
    }
    static boolean cetak(int n){
        if (n>1) {
            return (prime(n, n)==2);
        }
        else{
            return false;
        }
    }
}
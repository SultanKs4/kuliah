import java.util.Scanner;
public class FPBEuclidRekursif{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hasil;
        System.out.print("Masukkan angka pertama = ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan angka kedua = ");
        int bil2 = sc.nextInt();	
        System.out.println("FPB dari "+bil1+" dan "+bil2+" adalah "+FPB(bil1,bil2));
    }
    
    static int FPB (int a, int b){
        if ((b<=a)&&(a%b==0))
            return b;
        else if (a<b)
            return FPB(b, a);
        else
            return FPB(b, a%b);
	}    
}

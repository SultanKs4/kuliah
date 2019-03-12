import java.util.Scanner;

public class Penjualan{

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int hargaBeli;
		int hargaJual;
		String status;

		System.out.print("Masukkan harga beli barang : ");
		hargaBeli=sc.nextInt();
		System.out.print("Masukkan harga jual barang : ");
		hargaJual=sc.nextInt();

		if(hargaJual > hargaBeli){
			status="Untung";
		}
		else{
			status="Rugi";
		}
		
		System.out.print("Anda : "+ status);
	}
}
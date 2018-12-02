import java.util.Scanner;
public class Tugas3{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int gajiPokok,uangMakan,uangTransportasi;
		float pajak =(float) 0.05,totalGaji;

		System.out.println("##Aplikasi Penghitung Gaji Karyawan##");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan gaji pokok \t:");
		gajiPokok=sc.nextInt();
		System.out.print("Masukkan uang makan \t:");
		uangMakan=sc.nextInt();
		System.out.print("Masukkan uang transportasi :");
		uangTransportasi=sc.nextInt();

		totalGaji=gajiPokok+uangMakan+uangTransportasi;

		if(totalGaji>=1500000){
			totalGaji=totalGaji-(totalGaji*pajak);
			System.out.println("Total Gaji : "+String.format("%.0f",totalGaji));
		}else{
			System.out.println("Total Gaji : "+String.format("%.0f",totalGaji));
		}
	}

}
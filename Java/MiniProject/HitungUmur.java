import java.util.Scanner;
import java.util.Calendar;

public class HitungUmur {
	static Scanner scanInt = new Scanner(System.in);
	static Calendar cal = Calendar.getInstance();
	static int tahunSekarang = cal.get(Calendar.YEAR), bulanSekarang = 1 + cal.get(Calendar.MONTH);
	static int tanggalSekarang = cal.get(Calendar.DATE), tanggalLahir, bulanLahir, tahunLahir;
	static int tanggalUmur, bulanUmur, tahunUmur, tanggalPlus, bulanPlus, tahunPlus;
	static String dataInvalid = "Maaf, Data tidak valid!",
			karakter = "==================================================== \n";

	public static void main(String[] args) {
		do {
			menuAtas();
			menuInput();
			penghitungUmur();
		} while (ulangi());
	}

	public static void menuAtas() {
		System.out.println("\n===================HITUNG UMUR====================== \n");
		System.out.println("Tanggal hari ini : " + tanggalSekarang + "-" + bulanSekarang + "-" + tahunSekarang + "\n");
		System.out.println(karakter);
	}

	public static void menuInput() {
		System.out.print("Masukkan Tanggal Lahir Anda (DD)\t: ");
		tanggalLahir = scanInt.nextInt();
		System.out.print("Masukkan Bulan Lahir Anda (MM)\t\t: ");
		bulanLahir = scanInt.nextInt();
		System.out.print("Masukkan Tahun Lahir Anda (YYYY)\t: ");
		tahunLahir = scanInt.nextInt();
		System.out.println("\n" + karakter);
	}

	public static void penghitungUmur() {
		tanggalUmur = tanggalSekarang - tanggalLahir;
		bulanUmur = bulanSekarang - bulanLahir;
		tahunUmur = tahunSekarang - tahunLahir;
		bulanPlus = 12 + bulanUmur;
		tahunPlus = tahunUmur - 1;

		switch (bulanLahir) {
		case 1:
			tanggalPlus = 31 + tanggalUmur;
			break;
		case 2:
			if (tahunLahir % 4 == 0) {
				tanggalPlus = 29 + tanggalUmur;
			} else {
				tanggalPlus = 28 + tanggalUmur;
			}
			break;
		case 3:
			tanggalPlus = 31 + tanggalUmur;
			break;
		case 4:
			tanggalPlus = 30 + tanggalUmur;
			break;
		case 5:
			tanggalPlus = 31 + tanggalUmur;
			break;
		case 6:
			tanggalPlus = 30 + tanggalUmur;
			break;
		case 7:
			tanggalPlus = 31 + tanggalUmur;
			break;
		case 8:
			tanggalPlus = 31 + tanggalUmur;
			break;
		case 9:
			tanggalPlus = 30 + tanggalUmur;
			break;
		case 10:
			tanggalPlus = 31 + tanggalUmur;
			break;
		case 11:
			tanggalPlus = 30 + tanggalUmur;
			break;
		case 12:
			tanggalPlus = 31 + tanggalUmur;
			break;
		}

		if (bulanLahir == 1 && tanggalLahir > 31 || tahunLahir % 4 != 0 && bulanLahir == 2 && tanggalLahir > 28
				|| bulanLahir == 3 && tanggalLahir > 31 || bulanLahir == 4 && tanggalLahir > 30
				|| bulanLahir == 5 && tanggalLahir > 31 || bulanLahir == 6 && tanggalLahir > 30
				|| bulanLahir == 7 && tanggalLahir > 31 || bulanLahir == 8 && tanggalLahir > 31
				|| bulanLahir == 9 && tanggalLahir > 30 || bulanLahir == 10 && tanggalLahir > 31
				|| bulanLahir == 11 && tanggalLahir > 30 || bulanLahir == 12 && tanggalLahir > 31 || bulanLahir > 12
				|| tanggalLahir > 31 || bulanLahir < 1 || tanggalLahir < 1 || tahunLahir > tahunSekarang
				|| tahunLahir % 4 == 0 && bulanLahir == 2 && tanggalLahir > 29) {
			System.out.println(dataInvalid);
		}

		else if (tanggalLahir > tanggalSekarang) {
			if (bulanLahir >= bulanSekarang && tahunLahir == tahunSekarang) {
				System.out.println(dataInvalid);
			} else if (bulanLahir >= bulanSekarang) {
				bulanPlus = bulanPlus - 1;
				System.out.println("Umur anda sekarang adalah " + tahunPlus + " tahun " + bulanPlus + " bulan "
						+ tanggalPlus + " hari ");
			} else if (bulanLahir < bulanSekarang) {
				bulanUmur = bulanUmur - 1;
				System.out.println("Umur anda sekarang adalah " + tahunUmur + " tahun " + bulanUmur + " bulan "
						+ tanggalPlus + " hari ");
			}
		} else if (bulanLahir > bulanSekarang) {
			if (tahunLahir == tahunSekarang) {
				System.out.println(dataInvalid);
			} else if (tanggalLahir >= tanggalSekarang) {
				bulanPlus = bulanPlus - 1;
				System.out.println("Umur anda sekarang adalah " + tahunPlus + " tahun " + bulanPlus + " bulan "
						+ tanggalPlus + " hari ");
			} else if (tanggalLahir < tanggalSekarang) {
				System.out.println("Umur anda sekarang adalah " + tahunPlus + " tahun " + bulanPlus + " bulan "
						+ tanggalUmur + " hari ");
			}
		} else {
			System.out.println("Umur anda sekarang adalah " + tahunUmur + " tahun " + bulanUmur + " bulan "
					+ tanggalUmur + " hari ");
		}
		System.out.println("\n" + karakter);
	}

	public static boolean ulangi() {
		System.out.println("*Note : HARUS CAPSLOCK!!");
		System.out.print("Ulangi (Y/N) ? ");
		char ulangi = scanInt.next().charAt(0);
		return ulangi == 'Y';
	}
}
import java.util.Scanner;

class NilaiTerbesarBarisKolom {
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		int[][] array = new int[3][5];
		int maxbaris = 0;
		int maxkolom = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Masukkan angka ke-[" + i + "][" + j + "] : ");
				array[i][j] = masukan.nextInt();
			}
			System.out.println("------------------------");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("" + array[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maxbaris) {
					maxbaris = array[i][j];
				}
				if (array[i][j] > maxkolom) {
					maxkolom = array[i][j];
				}
			}
		}
		System.out.print("Angka terbesar Baris dan Kolom adalah : " + maxbaris + " , " + maxkolom);
	}
}
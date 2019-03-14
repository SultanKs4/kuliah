package JS5Praktikum;

/**
 * @author Sultan Searching
 */
public class Searching {
    public static void main(String[] args) {
        int[] data = { 12, 5, 30, 25, 40, 7, 9 };
        int cari = 40;
        int hasil;

        bubbleSort(data);
        hasil = binarySearch(data, cari);

        if (hasil == -1)
            System.out.println("Pencarian tidak ketemu");
        else
            System.out.println("Pencarian ketemu di index ke : " + hasil);
    }

    public static int sequentialSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int awal = 0, akhir = arr.length - 1;
        while (awal <= akhir) {
            int tengah = awal + (akhir - awal) / 2;
            if (arr[tengah] == x)
                return tengah;
            if (arr[tengah] < x)
                awal = tengah + 1;
            else
                akhir = tengah - 1;
        }
        return -1;
    }
}
public class BubbleSort {
    static int i, j;
    static int[] arr = { 16, 4, 10, 90, 27, 3, 12, 28 };
    static int n = arr.length;
    static int temp = 0;

    public static void main(String[] args) {
        sorting();
    }

    public static void sorting() {
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                swap();
            }
        }
        tampil();
    }

    public static void swap() {
        if (arr[j - 1] > arr[j]) {
            temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
    }

    public static void tampil() {
        System.out.print("Hasil Pengurutan : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
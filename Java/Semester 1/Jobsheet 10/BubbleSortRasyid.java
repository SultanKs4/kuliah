public class BubbleSortRasyid {
    public static void main(String[] args) {
        sorting();
        tampilArray();
    }

    public static void sorting() {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                swap();
            }
        }
    }

    public static void swap() {
        if (arr[j - 1] > arr[j]) {
            temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
    }

    public static void tampilArray() {
        System.out.println("Hasil pengurutan:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
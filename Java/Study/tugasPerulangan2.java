public class tugasPerulangan2 {
    public static void main(String[] args) {
        int N = 10, M;

        System.out.println("Pakai perulangan while");

        while (N >= 1) {
            M = N - 1;
            System.out.println("Anak ayam turun " + N + " Mati satu tinggal " + M);
            N--;
        }
    }
}
public class DeretBilGenap {
    public static void main(String[] args) {
        deretGenap(0);
    }

    public static void deretGenap(int i) {
        if (i <= 20) {
            System.out.print(i + " ");
            deretGenap(i += 2);
        }
    }
}
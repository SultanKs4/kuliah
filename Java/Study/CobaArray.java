public class CobaArray {
    public static void main(String[] args) {
        int[] bilanganArray = { 2, 4, 5, 12, 7, 20 };
        String[] kalimatArray = { "Hilih", "asdada", "12345678", "Sultan" };

        System.out.println(bilanganArray[0]);

        for (int i = 0; i < 6; i++) {
            System.out.print(bilanganArray[i] + " ");
        }
        System.out.println("\n" + bilanganArray.length);
        System.out.println(kalimatArray[2]);

        for (int k = 0; k < 4; k++) {
            System.out.print(kalimatArray[k] + " ");
        }
        System.out.println("\n" + kalimatArray.length);
    }
}
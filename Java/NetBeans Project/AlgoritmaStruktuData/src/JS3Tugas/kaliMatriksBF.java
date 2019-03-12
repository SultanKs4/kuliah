package JS3Tugas;

/**
 *
 * @author Sultan
 */
public class kaliMatriksBF {
    public static int[][] hasilKali = new int[4][4];

    public static void proses() {
        int temp, a;
        for (int i = 0; i < matriks.matriksArr1.length; i++) {
            for (int j = 0; j < matriks.matriksArr1[i].length; j++) {
                a = 0;
                for (int k = 0; k < matriks.matriksArr1[i].length; k++) {
                    temp = matriks.matriksArr1[i][k] * matriks.matriksArr2[k][j];
                    a += temp;
                    hasilKali[i][j] = a;
                }
            }
        }
    }
}

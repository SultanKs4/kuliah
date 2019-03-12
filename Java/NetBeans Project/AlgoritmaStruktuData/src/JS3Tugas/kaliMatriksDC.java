package JS3Tugas;

/**
 *
 * @author Sultan
 */
public class kaliMatriksDC {
    public static int[][] hasilKaliDC = new int[4][4];
    public static int[][] tempArrDC = new int[4][4];
    public static int[][] tempArrDC2 = new int[4][4];

    public kaliMatriksDC(int[][] arr1, int[][] arr2, int length) {
        prosesDC(arr1, arr2, length);
    }

    public static void prosesDC(int[][] arr1, int[][] arr2, int length) {
        int lengthMid = length / 2;
        int temp, temp2, b, a, incre, z;

        if (length == 2) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    a = 0;
                    b = 0;
                    for (int k = 0; k < length; k++) {
                        temp = matriks.matriksArr1[i][k] * matriks.matriksArr2[k][j];
                        a += temp;
                        tempArrDC[i][j] = a;
                        temp2 = matriks.matriksArr1[i][k] * matriks.matriksArr2[k + 2][j];
                        b += temp2;
                        tempArrDC2[i][j] = b;
                    }
                }
                for (int m = 0; m < length; m++) {
                    if (m == 0) {
                        incre = 2;
                        z = 2;
                    } else {
                        incre = 3;
                        z = 3;
                    }
                    a = 0;
                    b = 0;
                    for (int l = 2; l < length + 2; l++) {
                        temp = matriks.matriksArr1[i][l] * matriks.matriksArr2[l][m];
                        a += temp;
                        tempArrDC[i][incre] = a;
                        temp2 = matriks.matriksArr1[i][l] * matriks.matriksArr2[l][z];
                        b += temp2;
                        tempArrDC2[i][incre] = b;
                    }
                }
            }
        } else {
            for (int i = 2; i < length; i++) {
                for (int j = 2; j < length; j++) {
                    a = 0;
                    b = 0;
                    for (int k = 2; k < length; k++) {
                        temp = matriks.matriksArr1[i][k] * matriks.matriksArr2[k][j];
                        a += temp;
                        tempArrDC2[i][j] = a;
                        temp2 = matriks.matriksArr1[i][k] * matriks.matriksArr2[k - 2][j];
                        b += temp2;
                        tempArrDC[i][j] = b;
                    }
                }
                for (int m = 2; m < length; m++) {
                    if (m == 2) {
                        incre = 0;
                    } else {
                        incre = 1;
                    }
                    a = 0;
                    b = 0;
                    for (int l = 0; l < lengthMid; l++) {
                        temp = matriks.matriksArr1[i][l] * matriks.matriksArr2[l][m];
                        a += temp;
                        tempArrDC2[i][incre] = a;
                        temp2 = matriks.matriksArr1[i][l] * matriks.matriksArr2[l][incre];
                        b += temp2;
                        tempArrDC[i][incre] = b;
                    }
                }
            }
            prosesDC(arr1, arr2, lengthMid);
        }
    }

    public void join() {
        for (int i = 0; i < matriks.matriksArr1.length; i++) {
            for (int j = 0; j < matriks.matriksArr1[i].length; j++) {
                if (j < 2) {
                    hasilKaliDC[i][j] = tempArrDC[i][j] + tempArrDC[i][j + 2];
                } else {
                    hasilKaliDC[i][j] = tempArrDC2[i][j] + tempArrDC2[i][j - 2];
                }
            }
        }
    }
}

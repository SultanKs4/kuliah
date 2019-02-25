import java.util.Scanner;

public class GaussJordanSta2ordo {
    public static Scanner scan = new Scanner(System.in);
    public static Scanner scanChar = new Scanner(System.in);
    public static double[][] matriks = new double[2][2];
    public static double[] value = new double[2];
    public static double a, b;
    public static char ulangi;

    public static void main(String[] args) {
        do {
            inputMatriks();
            prosesMatrikstoZeroStep1();
            prosesdapatBdanA();
        } while (ulangi());
    }

    public static void printMatriks() {
        int valuetemp;
        for (int i = 0; i < 2; i++) {
            valuetemp = 0;
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.print("| ");
            if (i == 1) {
                valuetemp = 1;
            }
            for (int k = valuetemp; k <= valuetemp; k++) {
                System.out.println(value[k]);
            }
        }
    }

    public static void inputMatriks() {
        int valuetemp;
        System.out.println("Gauss Jordan Ordo 2x2\n");

        System.out.println("*untuk pemisah nilai matriks dan hasil gunakan spasi*");
        System.out.println("*misal 1 2 7*");
        System.out.println("Masukkan nilai matriks : ");
        for (int i = 0; i < 2; i++) {
            valuetemp = 0;
            for (int j = 0; j < 2; j++) {
                matriks[i][j] = scan.nextDouble();
            }
            if (i == 1) {
                valuetemp = 1;
            }
            for (int k = valuetemp; k <= valuetemp; k++) {
                value[k] = scan.nextDouble();
            }
        }
        System.out.println("\nNilai Matriks yang sudah di input :");
        printMatriks();
    }

    public static void prosesMatrikstoZeroStep1() {
        double p = matriks[1][0] / matriks[0][0];
        for (int j = 0; j < 2; j++) {
            matriks[1][j] -= p * matriks[0][j];
        }
        value[1] -= p * value[0];
        System.out.println("\n*Menjadikan matriks baris 2 kolom 1 menjadi 0");
        printMatriks();

        if (matriks[1][1] != 1) {
            System.out.println("\n*Menjadikan matriks baris 2 kolom 2 menjadi 1");
            value[1] /= matriks[1][1];
            matriks[1][1] /= matriks[1][1];
            printMatriks();
        }

        prosesMatrikstoZeroStep2();
    }

    public static void prosesMatrikstoZeroStep2() {
        double p = matriks[0][1] / matriks[1][1];
        for (int j = 0; j < 2; j++) {
            matriks[0][j] -= p * matriks[1][j];
        }
        value[0] -= p * value[1];
        System.out.println("\n*Menjadikan matriks baris 1 kolom 2 menjadi 0");
        printMatriks();

        if (matriks[0][0] != 1) {
            System.out.println("\n*Menjadikan matriks baris 1 kolom 1 menjadi 1");
            value[0] /= matriks[0][0];
            matriks[0][0] /= matriks[0][0];
            printMatriks();
        }
    }

    public static void prosesdapatBdanA() {
        b = value[1];
        a = value[0];
        System.out.println("\nA adalah : " + a);
        System.out.println("B adalah : " + b);

    }

    public static boolean ulangi() {
        System.out.print("\nUlang lagi(Y/N) ? ");
        ulangi = scanChar.next().charAt(0);
        if (ulangi == 'N' || ulangi == 'n') {
            System.out.println("\nTerima Kasih");
        } else if (ulangi == 'Y' || ulangi == 'y') {
            return ulangi == 'Y' || ulangi == 'y';
        } else {
            System.out.println("\nInputan tidak Valid\nSilahkan Coba Lagi");
            ulangi();
        }
        return ulangi == 'Y' || ulangi == 'y';
    }
}
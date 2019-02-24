import java.util.Scanner;

public class GaussJordanSta2ordo {
    public static Scanner scan = new Scanner(System.in);
    public static double[][] matriks = new double[2][2];
    public static double[] value = new double[2];
    public static double a, b;

    public static void main(String[] args) {
        inputMatriks();
        prosesMatrikstoZeroStep1();
        prosesdapatBdanA();
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

    public static void prosesMatrikstoZeroStep1() {
        int valuetemp;
        double p = matriks[1][0] / matriks[0][0];
        for (int j = 0; j < 2; j++) {
            matriks[1][j] -= p * matriks[0][j];
        }
        value[1] -= p * value[0];
        System.out.println("\n*Menjadikan matriks baris 2 kolom 1 menjadi 0");
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

        value[1] /= matriks[1][1];
        matriks[1][1] /= matriks[1][1];
        System.out.println("\n*Menjadikan matriks baris 2 kolom 2 menjadi 1");
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
        prosesMatrikstoZeroStep2();
    }

    public static void prosesMatrikstoZeroStep2() {
        int valuetemp;
        double p = matriks[0][1] / matriks[1][1];
        for (int j = 0; j < 2; j++) {
            matriks[0][j] -= p * matriks[1][j];
        }
        value[0] -= p * value[1];
        System.out.println("\n*Menjadikan matriks baris 1 kolom 2 menjadi 0");
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
        value[0] /= matriks[0][0];
        matriks[0][0] /= matriks[0][0];
        System.out.println("\n*Menjadikan matriks baris 1 kolom 1 menjadi 1");
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

    public static void prosesdapatBdanA() {
        b = value[1];
        a = value[0];
        System.out.println("\nA adalah : " + a);
        System.out.println("B adalah : " + b);

    }
}
import java.util.Scanner;

class tugasLarikSultanSwitch {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);

        int inputAngka;
        char huruf = 'A';

        System.out.print("Masukan Angka: ");
        inputAngka = scInt.nextInt();

        switch (inputAngka) {
        case 1:
            huruf = 'D';
            break;
        case 2:
            huruf = 'F';
            break;
        case 3:
            huruf = 'E';
            break;
        case 4:
            huruf = 'G';
            break;
        case 5:
            huruf = 'F';
            break;
        case 6:
            huruf = 'H';
            break;
        case 7:
            huruf = 'G';
            break;
        case 8:
            huruf = 'I';
            break;
        case 9:
            huruf = 'H';
            break;
        case 10:
            huruf = 'J';
            break;
        case 11:
            huruf = 'I';
            break;
        case 12:
            huruf = 'K';
            break;
        case 13:
            huruf = 'J';
            break;
        case 14:
            huruf = 'L';
            break;
        case 15:
            huruf = 'K';
            break;
        case 16:
            huruf = 'M';
            break;
        case 17:
            huruf = 'L';
            break;
        case 18:
            huruf = 'N';
            break;
        case 19:
            huruf = 'M';
            break;
        case 20:
            huruf = 'O';
            break;
        case 21:
            huruf = 'N';
            break;
        case 22:
            huruf = 'P';
            break;
        case 23:
            huruf = 'O';
            break;
        case 24:
            huruf = 'Q';
            break;
        case 25:
            huruf = 'P';
            break;
        case 26:
            huruf = 'R';
            break;
        case 27:
            huruf = 'Q';
            break;
        case 28:
            huruf = 'S';
            break;
        case 29:
            huruf = 'R';
            break;
        case 30:
            huruf = 'T';
            break;
        case 31:
            huruf = 'S';
            break;
        case 32:
            huruf = 'V';
            break;
        case 33:
            huruf = 'T';
            break;
        case 34:
            huruf = 'V';
            break;
        case 35:
            huruf = 'U';
            break;
        case 36:
            huruf = 'W';
            break;
        case 37:
            huruf = 'V';
            break;
        case 38:
            huruf = 'X';
            break;
        case 39:
            huruf = 'W';
            break;
        case 40:
            huruf = 'Y';
            break;
        case 41:
            huruf = 'X';
            break;
        case 42:
            huruf = 'Z';
            break;
        default:
            System.out.print("Masukan Angka yang Valid.Maksimal Angka Yang Dimasukan 38.");
            break;
        }
        System.out.println("Angka yang anda masukkan adalah : " + masukanAngka);
        System.out.println("Huruf yang keluar adalah : " + huruf);
    }
}
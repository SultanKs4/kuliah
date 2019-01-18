import java.text.*;
import java.util.*;

public class MotoShop {
    static Locale localeID = new Locale("id", "ID");
    static DecimalFormat kursIDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    static DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);

    public static void main(String[] args) {
        // Date dNow = new Date();
        // SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd-MMMM-yyyy 'pada'
        // HH:mm:ss", localeID);
        // System.out.println("\t " + dateFormat.format(dNow) + "\t\t");
        Menu();
    }

    public static void CurrencyIDR() {
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIDR.setDecimalFormatSymbols(formatRp);
    }

    public static void Menu() {
        System.out.println("#################################");
        System.out.println("#\tSultan MotoShop\t\t#\n#\t    Menu\t\t#");
        System.out.println(
                "# 1. Helm\t\t\t#\n# 2. Sarung Tangan\t\t#\n# 3. Sepatu\t\t\t#\n# 4. Jaket\t\t\t#\n# 5. Setelan Balap\t\t#");
        System.out.println("#################################");
        cekMenu(inputpilihanMenu());
    }

    public static int inputpilihanMenu() {
        System.out.print("    Masukkan Pilihan (1-5) : ");
        int inputMenu = scanString.nextInt();
        return inputMenu;
    }

    public static void cekMenu(int inputMenu) {
        switch (inputMenu) {
        case 1:
            helmet();
            break;
        case 2:
            gloves();
            break;
        case 3:
            boots();
            break;
        case 4:
            jacket();
            break;
        case 5:
            raceSuit();
            break;
        default:
            System.out.println("\n\tInput tidak valid!\n\tsilahkan coba lagi\n");
            cekMenu(inputpilihanMenu());
            break;
        }
    }

    public static void helmet() {

    }

    public static void gloves() {

    }

    public static void boots() {

    }

    public static void jacket() {

    }

    public static void raceSuit() {

    }
}
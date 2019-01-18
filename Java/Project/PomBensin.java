import java.text.*;
import java.util.*;

public class PomBensin {
    static Locale localeID = new Locale("id", "ID");
    static DecimalFormat kursIDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    static DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    static int pilihan, checkVIP = -1;
    static String jenisKendaraan, penggunaanKendaraan, outputPenggunaanKendaraan, tipeKendaraan, outputTipeKendaraan,
            outputJenisKendaraan, pilihanHitung, outputPilihanHitung, jenisBahanBakar, outputJBB, jenisBensinInvoice,
            hargaBensinInvoice, jenisDieselInvoice, tipeDieselInvoice, hargaDieselInvoice, jenisAvturInvoice,
            hargaAvturInvoice, literString = "L      \t#";
    static char ulangi;
    static float liter, bill, bill2, bill3, pay, cashback, kembalian;
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);
    static Scanner scanChar = new Scanner(System.in);
    static Scanner scanFloat = new Scanner(System.in);
    static String[][] Bensin = { { "Premium", "Pertalite", "Pertamax", "Pertamax Turbo", "Pertamax Racing" },
            { "7000", "7800", "10400", "12500", "43500" }, { "Bio Solar", "Dex Lite", "Pertamina Dex" },
            { "9800", "10500", "11850" }, { "Avtur Pribadi", "Avtur Umum", "Avtur Militer" },
            { "12700", "11200", "10500" } };
    static ArrayList<Integer> VIP = new ArrayList<Integer>();

    public static void main(String[] args) {
        do {
            TampilanMenu();
        } while (ulangi());
    }

    public static void CurrencyIDR() {
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIDR.setDecimalFormatSymbols(formatRp);
    }

    public static void TampilanMenu() {
        VIP.add(1841720019);
        System.out.println("#########################################");
        System.out.println("#\t   POM BENSIN INDONESIAN\t#\n#\t\t51.420.69\t\t#\n#\t  REGIONAL JAWA TIMUR\t\t#");
        System.out.println("#########################################");
        System.out.println("#\t     Pilih Pembelian\t\t#");
        System.out.println("#########################################");
        System.out.println("# 1. Beli Bensin \t\t\t#\n# 2. Beli Diesel \t\t\t#\n# 3. Beli Avtur \t\t\t#");
        System.out.println("#########################################");
        PilihanMenu(inputPilihanMenu());
    }

    public static String inputPilihanMenu() {
        System.out.print("\nMasukkan Pilihan (Bensin/Diesel/Avtur) : ");
        jenisBahanBakar = scanString.nextLine();
        String firstCapitalJBB = jenisBahanBakar.substring(0, 1).toUpperCase();
        outputJBB = firstCapitalJBB + jenisBahanBakar.substring(1);
        return outputJBB;
    }

    public static void PilihanMenu(String outputJBB) {
        if ("Bensin".equals(outputJBB)) {
            Bensin();
        } else if ("Diesel".equals(outputJBB)) {
            Diesel();
        } else if ("Avtur".equals(outputJBB)) {
            Penerbangan();
        } else {
            System.out.println("\n\tMasukkan Tidak Valid!\n\tSilahkan Coba lagi");
            PilihanMenu(inputPilihanMenu());
        }
    }

    public static void Bensin() {
        CurrencyIDR();
        System.out.println("\n#########################################");
        System.out.println("#\tHarga Bahan Bakar Bensin\t#");
        System.out.println("#########################################");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < Bensin[i].length; j++) {
                int h = j + 1;
                if (j <= 2) {
                    System.out.println("# " + h + ". " + Bensin[i][j] + "\t\t: "
                            + kursIDR.format(Integer.parseInt(Bensin[1][j])) + "\t#");
                } else {
                    System.out.println("# " + h + ". " + Bensin[i][j] + "\t: "
                            + kursIDR.format(Integer.parseInt(Bensin[1][j])) + "\t#");
                }
            }
        }
        System.out.println("#########################################");
        jenisKendaraanBensin();
    }

    public static void jenisKendaraanBensin() {
        System.out.print("\nJenis Kendaraan Anda (R2/R3/R4)    : ");
        jenisKendaraan = scanString.nextLine().toUpperCase();
        if ("R2".equals(jenisKendaraan)) {
            penggunaanKendaraanBensin();
        } else if ("R3".equals(jenisKendaraan)) {
            penggunaanKendaraanBensin();
        } else if ("R4".equals(jenisKendaraan)) {
            penggunaanKendaraanBensin();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            jenisKendaraanBensin();
        }
    }

    public static void penggunaanKendaraanBensin() {
        if ("R2".equals(jenisKendaraan)) {
            System.out.println("\n\tAnda telah memilih R2");
            System.out.print("\nPenggunaan Kendaraan Anda (Pribadi, Dinas, Balap) : ");
        } else if ("R3".equals(jenisKendaraan)) {
            System.out.println("\n\tAnda telah memilih R3");
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Pribadi, Dinas) : ");
        } else if ("R4".equals(jenisKendaraan)) {
            System.out.println("\n\tAnda telah memilih R4");
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Pribadi, Dinas, Balap) : ");
        }
        rekomendasiBensin(inputPengguKenda());
    }

    public static String inputPengguKenda() {
        penggunaanKendaraan = scanString.nextLine();
        String firstCapital = penggunaanKendaraan.substring(0, 1).toUpperCase();
        outputPenggunaanKendaraan = firstCapital + penggunaanKendaraan.substring(1);
        return outputPenggunaanKendaraan;
    }

    public static void rekomendasiBensin(String outputPenggunaanKendaraan) {
        if ("Umum".equals(outputPenggunaanKendaraan) && "R4".equals(jenisKendaraan)
                || "Umum".equals(outputPenggunaanKendaraan) && "R3".equals(jenisKendaraan)) {
            System.out.println("\nAnda harus menggunakan Premium, Pertalite");
            MenuBensin();
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            System.out.println("\nAnda harus menggunakan Premium, Pertalite, Pertamax, Pertamax Turbo");
            MenuBensin();
        } else if ("Dinas".equals(outputPenggunaanKendaraan)) {
            System.out.println("\nAnda harus menggunakan Pertalite, Pertamax, Pertamax Turbo");
            MenuBensin();
        } else if ("Balap".equals(outputPenggunaanKendaraan) && "R4".equals(jenisKendaraan)
                || "Balap".equals(outputPenggunaanKendaraan) && "R2".equals(jenisKendaraan)) {
            System.out.println("\nAnda harus menggunakan Pertamax Turbo, Pertamax Racing");
            MenuBensin();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            penggunaanKendaraanBensin();
        }
    }

    public static void MenuBensin() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (1-2)\t   : ");
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (1-4)\t   : ");
        } else if ("Dinas".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (2-4)\t   : ");
        } else if ("Balap".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (4-5)\t   : ");
        }
        pilihan = scanInt.nextInt();
        VerifMenuBensin();
    }

    public static void VerifMenuBensin() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            if (pilihan == 1 || pilihan == 2) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 0 || pilihan >= 3) {
                System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
                rekomendasiBensin(outputPenggunaanKendaraan);
            }
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            if (pilihan >= 1 && pilihan <= 4) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 0 || pilihan >= 5) {
                System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
                rekomendasiBensin(outputPenggunaanKendaraan);
            }
        } else if ("Dinas".equals(outputPenggunaanKendaraan)) {
            if (pilihan >= 2 && pilihan <= 4) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 1 || pilihan >= 5) {
                System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
                rekomendasiBensin(outputPenggunaanKendaraan);
            }
        } else if ("Balap".equals(outputPenggunaanKendaraan)) {
            if (pilihan == 4 || pilihan == 5) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 3 || pilihan >= 5) {
                System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
                rekomendasiBensin(outputPenggunaanKendaraan);
            }
        }
    }

    public static void NotifPemilihanBensin() {
        if (pilihan == 1) {
            System.out.println("\n\tAnda Telah Memilih Premium");
        } else if (pilihan == 2) {
            System.out.println("\n\tAnda Telah Memilih Pertalite");
        } else if (pilihan == 3) {
            System.out.println("\n\tAnda Telah Memilih Pertamax");
        } else if (pilihan == 4) {
            System.out.println("\n\tAnda Telah Memilih Pertamax Turbo");
        } else if (pilihan == 5) {
            System.out.println("\n\tAnda Telah Memilih Pertamax Racing");
        }
    }

    public static void pilihanHitungBensin() {
        System.out.print("\nAnda ingin menghitung menurut (L/Rp) : ");
        pilihanHitung = scanString.nextLine();
        String firstCapital = pilihanHitung.substring(0, 1).toUpperCase();
        outputPilihanHitung = firstCapital + pilihanHitung.substring(1);
        if ("L".equals(outputPilihanHitung)) {
            literBensin();
        } else if ("Rp".equals(outputPilihanHitung)) {
            uangBensin();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            pilihanHitungBensin();
        }
    }

    public static void literBensin() {
        System.out.print("\nMasukkan pembelian bensin (liter)    : ");
        liter = scanFloat.nextFloat();
        if (liter <= 0) {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            literBensin();
        }
    }

    public static void uangBensin() {
        System.out.print("\nMasukkan pembelian bensin \t     : Rp. ");
        bill = scanFloat.nextFloat();
        if (bill <= 0) {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            uangBensin();
        }
    }

    public static void hitungBensin() {
        if ("L".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                bill = Integer.parseInt(Bensin[1][0]) * liter;
                break;
            case 2:
                bill = Integer.parseInt(Bensin[1][1]) * liter;
                break;
            case 3:
                bill = Integer.parseInt(Bensin[1][2]) * liter;
                break;
            case 4:
                bill = Integer.parseInt(Bensin[1][3]) * liter;
                break;
            case 5:
                bill = Integer.parseInt(Bensin[1][4]) * liter;
                break;
            }
        } else if ("Rp".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                liter = bill / Integer.parseInt(Bensin[1][0]);
                break;
            case 2:
                liter = bill / Integer.parseInt(Bensin[1][1]);
                break;
            case 3:
                liter = bill / Integer.parseInt(Bensin[1][2]);
                break;
            case 4:
                liter = bill / Integer.parseInt(Bensin[1][3]);
                break;
            case 5:
                liter = bill / Integer.parseInt(Bensin[1][4]);
                break;
            }
        }
    }

    public static void PembelianBensin() {
        pilihanHitungBensin();
        hitungBensin();
        CurrencyIDR();
        System.out.println("\n#########################################################");
        switch (pilihan) {
        case 1:
            System.out.printf("# Anda akan membeli Premium \t : %.3f %s %n", liter, literString);
            System.out
                    .println("# Harga Premium adalah \t\t : " + kursIDR.format(Integer.parseInt(Bensin[1][0])) + "\t#");
            System.out.println("# Total Harga adalah \t\t : " + kursIDR.format(bill) + "\t#");
            break;
        case 2:
            System.out.printf("# Anda akan membeli Pertalite \t : %.3f %s %n", liter, literString);
            System.out
                    .println("# Harga Pertalite adalah \t : " + kursIDR.format(Integer.parseInt(Bensin[1][1])) + "\t#");
            System.out.println("# Total Harga adalah \t\t : " + kursIDR.format(bill) + "\t#");
            break;
        case 3:
            System.out.printf("# Anda akan membeli Pertamax \t : %.3f %s %n", liter, literString);
            System.out
                    .println("# Harga Pertamax adalah \t : " + kursIDR.format(Integer.parseInt(Bensin[1][2])) + "\t#");
            System.out.println("# Total Harga adalah \t\t : " + kursIDR.format(bill) + "\t#");
            break;
        case 4:
            System.out.printf("# Anda akan membeli Pertamax Turbo : %.3f %s %n", liter, literString);
            System.out.println(
                    "# Harga Pertamax Turbo adalah \t    : " + kursIDR.format(Integer.parseInt(Bensin[1][3])) + "\t#");
            System.out.println("# Total Harga adalah \t\t    : " + kursIDR.format(bill) + "\t#");
            break;
        case 5:
            System.out.printf("# Anda akan membeli Pertamax Racing : %.3f %s %n", liter, literString);
            System.out.println(
                    "# Harga Pertamax Racing adalah \t    : " + kursIDR.format(Integer.parseInt(Bensin[1][4])) + "\t#");
            System.out.println("# Total Harga adalah \t\t    : " + kursIDR.format(bill) + "\t#");
            break;
        }
        System.out.println("#########################################################");
        System.out.print("\nUang yang dibayarkan \t\t : Rp.");
        pay = scanInt.nextInt();
        if (pay >= bill) {
            VIPMember();
        } else
            System.out.println("\n\tUang Anda Kurang!");
    }

    public static void Diesel() {
        CurrencyIDR();
        System.out.println("\n#########################################");
        System.out.println("#\tHarga Bahan Bakar Diesel\t#");
        System.out.println("#########################################");
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < Bensin[i].length; j++) {
                int h = j + 1;
                if (j <= 1) {
                    System.out.println("# " + h + ". " + Bensin[i][j] + "\t\t: "
                            + kursIDR.format(Integer.parseInt(Bensin[3][j])) + "\t#");
                } else {
                    System.out.println("# " + h + ". " + Bensin[i][j] + "\t: "
                            + kursIDR.format(Integer.parseInt(Bensin[3][j])) + "\t#");
                }
            }
        }
        System.out.println("#########################################");
        jenisKendaraanDiesel();
    }

    public static void jenisKendaraanDiesel() {
        System.out.print("\nJenis Kendaraan Anda (R4/Lebih)      : ");
        jenisKendaraan = scanString.nextLine();
        String firstCapitalJenis = jenisKendaraan.substring(0, 1).toUpperCase();
        outputJenisKendaraan = firstCapitalJenis + jenisKendaraan.substring(1);

        if ("R4".equals(outputJenisKendaraan)) {
            penggunaanKendaraanDiesel();
        } else if ("Lebih".equals(outputJenisKendaraan)) {
            penggunaanKendaraanDiesel();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            jenisKendaraanDiesel();
        }
    }

    public static void R4Diesel() {
        System.out.print("\nTipe Kendaraan (Mobil/Truk)\t     : ");
        tipeKendaraan = scanString.nextLine();
        String firstCapital = tipeKendaraan.substring(0, 1).toUpperCase();
        outputTipeKendaraan = firstCapital + tipeKendaraan.substring(1);

        if ("Mobil".equals(outputTipeKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Pribadi, Dinas) : ");
        } else if ("Truk".equals(outputTipeKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Dinas) : ");
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            R4Diesel();
        }
    }

    public static void penggunaanKendaraanDiesel() {
        if ("R4".equals(outputJenisKendaraan)) {
            R4Diesel();
        } else if ("Lebih".equals(outputJenisKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Dinas) : ");
        }
        penggunaanKendaraan = scanString.nextLine();
        String firstCapital = penggunaanKendaraan.substring(0, 1).toUpperCase();
        outputPenggunaanKendaraan = firstCapital + penggunaanKendaraan.substring(1);
        rekomendasiDiesel();
    }

    public static void rekomendasiDiesel() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            System.out.println("\nKami menyarankan Anda untuk menggunakan Diesel Bio Solar, Dex Lite");
            MenuDiesel();
        } else if ("Pribadi".equals(outputPenggunaanKendaraan) || "Dinas".equals(outputPenggunaanKendaraan)) {
            System.out.println("\nKami menyarankan Anda untuk menggunakan Diesel Dex Lite, Pertamina Dex");
            MenuDiesel();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            penggunaanKendaraanDiesel();
        }
    }

    public static void MenuDiesel() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Diesel (1-2)\t     : ");
        } else if ("Pribadi".equals(outputPenggunaanKendaraan) || "Dinas".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Diesel (2-3)\t     : ");
        }
        pilihan = scanInt.nextInt();
        VerifMenuDiesel();
    }

    public static void VerifMenuDiesel() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            if (pilihan == 1 || pilihan == 2) {
                NotifPemilihanDiesel();
                PembelianDiesel();
            } else if (pilihan <= 0 || pilihan >= 3) {
                System.out.println("\n\tMaaf, Input tidak Valid!\n\tAnda akan kembali ke Awal\n\tSilahkan Coba Lagi");
                rekomendasiDiesel();
            }
        } else if ("Pribadi".equals(outputPenggunaanKendaraan) || "Dinas".equals(outputPenggunaanKendaraan)) {
            if (pilihan == 2 || pilihan == 3) {
                NotifPemilihanDiesel();
                PembelianDiesel();
            } else if (pilihan <= 1 || pilihan >= 4) {
                System.out.println("\n\tMaaf, Input tidak Valid!\n\tAnda akan kembali ke Awal\n\tSilahkan Coba Lagi");
                rekomendasiDiesel();
            }
        }
    }

    public static void NotifPemilihanDiesel() {
        if (pilihan == 1) {
            System.out.println("\nAnda Telah Memilih Bio Solar");
        } else if (pilihan == 2) {
            System.out.println("\nAnda Telah Memilih Dex Lite");
        } else if (pilihan == 3) {
            System.out.println("\nAnda Telah Memilih Pertamina Dex");
        }
    }

    public static void pilihanHitungDiesel() {
        System.out.print("\nAnda ingin menghitung menurut (L/Rp) : ");
        pilihanHitung = scanString.nextLine();
        String firstCapital = pilihanHitung.substring(0, 1).toUpperCase();
        outputPilihanHitung = firstCapital + pilihanHitung.substring(1);
        if ("L".equals(outputPilihanHitung)) {
            literDiesel();
        } else if ("Rp".equals(outputPilihanHitung)) {
            uangDiesel();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            pilihanHitungDiesel();
        }
    }

    public static void literDiesel() {
        System.out.print("\nMasukkan pembelian diesel (liter)    : ");
        liter = scanFloat.nextFloat();
        if (liter <= 0) {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            literDiesel();
        }
    }

    public static void uangDiesel() {
        System.out.print("\nMasukkan pembelian Diesel \t     : Rp.");
        bill = scanFloat.nextFloat();
        if (bill <= 0) {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            uangDiesel();
        }
    }

    public static void HitungDiesel() {
        if ("L".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                bill = Integer.parseInt(Bensin[3][0]) * liter;
                break;
            case 2:
                bill = Integer.parseInt(Bensin[3][1]) * liter;
                break;
            case 3:
                bill = Integer.parseInt(Bensin[3][2]) * liter;
                break;
            }
        } else if ("Rp".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                liter = bill / Integer.parseInt(Bensin[3][0]);
                break;
            case 2:
                liter = bill / Integer.parseInt(Bensin[3][1]);
                break;
            case 3:
                liter = bill / Integer.parseInt(Bensin[3][2]);
                break;
            }
        }
    }

    public static void PembelianDiesel() {
        pilihanHitungDiesel();
        HitungDiesel();
        CurrencyIDR();
        System.out.println("\n#########################################################");
        switch (pilihan) {
        case 1:
            System.out.printf("# Anda akan membeli Bio Solar \t     : %.3f %s %n", liter, literString);
            System.out.println(
                    "# Harga Bio Solar adalah \t     : " + kursIDR.format(Integer.parseInt(Bensin[3][0])) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 2:
            System.out.printf("# Anda akan membeli Dex Lite \t     : %.3f %s %n", liter, literString);
            System.out.println(
                    "# Harga Dex Lite adalah \t     : " + kursIDR.format(Integer.parseInt(Bensin[3][1])) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 3:
            System.out.printf("# Anda akan membeli Pertamina Dex    : %.3f %s %n", liter, literString);
            System.out.println(
                    "# Harga Pertamina Dex adalah \t     : " + kursIDR.format(Integer.parseInt(Bensin[3][2])) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        default:
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            break;
        }
        System.out.println("#########################################################");
        System.out.print("\nUang yang dibayarkan \t\t     : Rp.");
        pay = scanInt.nextInt();
        if (pay >= bill) {
            VIPMember();
        } else
            System.out.println("\n\tUang Anda Kurang!");
    }

    public static void Penerbangan() {
        CurrencyIDR();
        System.out.println("\n#########################################");
        System.out.println("#\tHarga Bahan Bakar Avtur\t\t#");
        System.out.println("#########################################");
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < Bensin[i].length; j++) {
                int h = j + 1;
                if (j == 1) {
                    System.out.println("# " + h + ". " + Bensin[i][j] + "\t\t: "
                            + kursIDR.format(Integer.parseInt(Bensin[5][j])) + "\t#");
                } else {
                    System.out.println("# " + h + ". " + Bensin[i][j] + "\t: "
                            + kursIDR.format(Integer.parseInt(Bensin[5][j])) + "\t#");
                }
            }
        }
        System.out.println("#########################################");
        jenisKendaraanPenerbangan();
    }

    public static void jenisKendaraanPenerbangan() {
        System.out.print("\nJenis Kendaraan Anda (Pesawat/Helikopter) : ");
        jenisKendaraan = scanString.nextLine();
        String firstCapitalJenis = jenisKendaraan.substring(0, 1).toUpperCase();
        outputJenisKendaraan = firstCapitalJenis + jenisKendaraan.substring(1);

        if ("Pesawat".equals(outputJenisKendaraan)) {
            penggunaanKendaraanPenerbangan();
        } else if ("Helikopter".equals(outputJenisKendaraan)) {
            penggunaanKendaraanPenerbangan();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            jenisKendaraanPenerbangan();
        }
    }

    public static void penggunaanKendaraanPenerbangan() {
        if ("Pesawat".equals(outputJenisKendaraan) || "Helikopter".equals(outputJenisKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Militer, Pribadi) : ");
        }
        penggunaanKendaraan = scanString.nextLine();
        String firstCapital = penggunaanKendaraan.substring(0, 1).toUpperCase();
        outputPenggunaanKendaraan = firstCapital + penggunaanKendaraan.substring(1);
        verifPenerbangan();
    }

    public static void verifPenerbangan() {
        if ("Umum".equals(outputPenggunaanKendaraan) || "Pribadi".equals(outputPenggunaanKendaraan)
                || "Militer".equals(outputPenggunaanKendaraan)) {
            PembelianPenerbangan();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            penggunaanKendaraanPenerbangan();
        }
    }

    public static void pilihanHitungAvtur() {
        System.out.print("\nAnda ingin menghitung menurut (L/Rp) : ");
        pilihanHitung = scanString.nextLine();
        String firstCapital = pilihanHitung.substring(0, 1).toUpperCase();
        outputPilihanHitung = firstCapital + pilihanHitung.substring(1);
        if ("L".equals(outputPilihanHitung)) {
            literAvtur();
        } else if ("Rp".equals(outputPilihanHitung)) {
            uangAvtur();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            pilihanHitungAvtur();
        }
    }

    public static void literAvtur() {
        System.out.print("\nMasukkan pembelian Avtur (liter)     : ");
        liter = scanFloat.nextFloat();
        if (liter <= 0) {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            literAvtur();
        }
    }

    public static void uangAvtur() {
        System.out.print("\nMasukkan pembelian Avtur \t     : Rp.");
        bill = scanFloat.nextFloat();
        if (bill <= 0) {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            uangAvtur();
        }
    }

    public static void HitungAvtur() {
        if ("L".equals(outputPilihanHitung)) {
            if ("Umum".equals(outputPenggunaanKendaraan)) {
                bill = liter * Integer.parseInt(Bensin[5][1]);
            } else if ("Militer".equals(outputPenggunaanKendaraan)) {
                bill = liter * Integer.parseInt(Bensin[5][2]);
            } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
                bill = liter * Integer.parseInt(Bensin[5][0]);
            }
        } else if ("Rp".equals(outputPilihanHitung)) {
            if ("Umum".equals(outputPenggunaanKendaraan)) {
                liter = bill / Integer.parseInt(Bensin[5][1]);
            } else if ("Militer".equals(outputPenggunaanKendaraan)) {
                liter = bill / Integer.parseInt(Bensin[5][2]);
            } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
                liter = bill / Integer.parseInt(Bensin[5][0]);
            }
        }

    }

    public static void PembelianPenerbangan() {
        pilihanHitungAvtur();
        HitungAvtur();
        CurrencyIDR();
        System.out.println("\n#########################################################");
        System.out.printf("# Anda akan membeli Avtur sejumlah   : %.3f %s %n", liter, literString);
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            System.out.println(
                    "# Harga Avtur Umum adalah \t     : " + kursIDR.format(Integer.parseInt(Bensin[5][1])) + "\t#");
        } else if ("Militer".equals(outputPenggunaanKendaraan)) {
            System.out.println(
                    "# Harga Avtur Militer adalah \t     : " + kursIDR.format(Integer.parseInt(Bensin[5][2])) + "\t#");
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            System.out.println(
                    "# Harga Avtur Pribadi adalah \t     : " + kursIDR.format(Integer.parseInt(Bensin[5][0])) + "\t#");
        }
        System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
        System.out.println("#########################################################");
        System.out.print("\nUang yang dibayarkan \t\t     : Rp.");
        pay = scanInt.nextInt();
        if (pay >= bill) {
            VIPMember();
        } else
            System.out.println("\nUang Anda Kurang!");

    }

    public static void VIPMember() {
        System.out.print("\nApakah anda mempunyai VIP Member ? (Y/N) : ");
        char inputVIP = scanChar.next().charAt(0);
        if (inputVIP == 'Y' || inputVIP == 'y') {
            VIPMemberLogin();
        } else if (inputVIP == 'n' || inputVIP == 'N') {
            VIPMemberDaftarornonVIP();
        } else {
            System.out.println("\nInput tidak valid\nSilahkan coba lagi");
            VIPMember();
        }
    }

    public static void VIPMemberLogin() {
        System.out.print("\nMasukkan VIP ID anda : ");
        int vipId = scanInt.nextInt();
        for (int i = 0; i < VIP.size(); i++) {
            if (vipId == VIP.get(i)) {
                checkVIP = i;
                break;
            }
        }
        if (checkVIP >= 0) {
            System.out.println("\n\tVIP ID anda valid");
            invoice();
        } else {
            System.out.println("\n\tVIP ID anda tidak ditemukan\n\tAnda bukanlah VIP Member");
            invoice();
        }
    }

    public static void VIPMemberDaftarornonVIP() {
        System.out.print("Ingin menjadi VIP Member ? (Y/N) : ");
        char inputdaftarornon = scanChar.next().charAt(0);
        if (inputdaftarornon == 'Y' || inputdaftarornon == 'y') {
            VIPMemberSignUp();
        } else if (inputdaftarornon == 'n' || inputdaftarornon == 'N') {
            invoice();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            VIPMemberDaftarornonVIP();
        }
    }

    public static void VIPMemberSignUp() {
        System.out.print("Masukkan umur anda : ");
        int umur = scanInt.nextInt();
        if (umur > 19) {
            int vipRandom = (int) (Math.random() * 999999999 + 100000000);
            VIP.add(vipRandom);
            System.out.print("VIP ID anda adalah : ");
            System.out.print(vipRandom);
            System.out.println("\nHarap catat ID anda\nSilahkan gunakan VIP ID diatas");
            VIPMemberLogin();
        } else if (umur > 0 && umur <= 19) {
            System.out.println("\nUmur anda belum mencukupi untuk mendapatkan VIP Member\nSilahkan membayar");
            invoice();
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            VIPMemberSignUp();
        }
    }

    public static void invoice() {
        TampilanAtasInvoice();
        IntiInvoice();
        cashback();
    }

    public static void TampilanAtasInvoice() {
        Date dNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd-MMMM-yyyy 'pada' HH:mm:ss", localeID);
        System.out.println("\n#########################################################");
        System.out.println("#\t\t\tINVOICE\t\t\t\t#");
        System.out.println("#########################################################");
        System.out.println("#\t\t POM BENSIN INDONESIAN\t\t\t#");
        System.out.println("#\t\t       51.420.69\t\t\t#");
        System.out.println("#\t\t  REGIONAL JAWA TIMUR\t\t\t#");
        System.out.println("#########################################################");
        System.out.println("#\t   " + dateFormat.format(dNow) + "\t\t#");
        System.out.println("#########################################################");
    }

    public static void IntiInvoice() {
        CurrencyIDR();
        if (checkVIP >= 0) {
            bill2 = bill * 0.05f;
            bill3 = bill - bill2;
            kembalian = pay - bill3;
        } else if (checkVIP < 0) {
            kembalian = pay - bill;
        }
        if ("Bensin".equals(outputJBB)) {
            JenisBensinInvoice();
            System.out.println("# Jenis Kendaraan \t\t: " + jenisKendaraan + "\t\t\t#");
            System.out.println("# Penggunaan Kendaraan \t\t: " + outputPenggunaanKendaraan + "  \t\t#");
            System.out.println("# Jenis Bensin \t\t\t: " + jenisBensinInvoice + "\t#");
            System.out.printf("# Jumlah Liter \t\t\t: %.3f %s %n", liter, literString);
            System.out.println("# Harga Bensin \t\t\t: " + hargaBensinInvoice + "\t\t#");
            System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill) + "    \t#");
            if (checkVIP >= 0) {
                System.out.println("# Diskon VIP \t\t\t: " + kursIDR.format(bill2) + "    \t#");
                System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill3) + "    \t#");
            }
            System.out.println("# Uang Tunai \t\t\t: " + kursIDR.format(pay) + "    \t#");
            System.out.println("# Kembalian \t\t\t: " + kursIDR.format(kembalian) + "\t\t#");
        } else if ("Diesel".equals(outputJBB)) {
            JenisDieselInvoice();
            System.out.println("# Jenis Kendaraan \t\t: " + outputJenisKendaraan + "\t\t\t#");
            if ("R4".equals(outputJenisKendaraan)) {
                if ("Mobil".equals(outputTipeKendaraan)) {
                    tipeDieselInvoice = "Mobil";
                } else if ("Truk".equals(outputTipeKendaraan)) {
                    tipeDieselInvoice = "Truk";
                }
                System.out.println("# Tipe Kendaraan \t\t: " + tipeDieselInvoice + "\t\t\t#");
            }
            System.out.println("# Penggunaan Kendaraan \t\t: " + outputPenggunaanKendaraan + "  \t\t#");
            System.out.println("# Jenis Diesel \t\t\t: " + jenisDieselInvoice + "\t\t#");
            System.out.printf("# Jumlah Liter \t\t\t: %.3f %s %n", liter, literString);
            System.out.println("# Harga Diesel \t\t\t: " + hargaDieselInvoice + "\t\t#");
            System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill) + "    \t#");
            if (checkVIP >= 0) {
                System.out.println("# Diskon VIP \t\t\t: " + kursIDR.format(bill2) + "    \t#");
                System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill3) + "    \t#");
            }
            System.out.println("# Uang Tunai \t\t\t: " + kursIDR.format(pay) + "    \t#");
            System.out.println("# Kembalian \t\t\t: " + kursIDR.format(kembalian) + "\t\t#");
        } else if ("Avtur".equals(outputJBB)) {
            JenisAvturInvoice();
            System.out.println("# Jenis Kendaraan \t\t: " + outputJenisKendaraan + "\t\t#");
            System.out.println("# Penggunaan Kendaraan \t\t: " + outputPenggunaanKendaraan + "  \t\t#");
            System.out.println("# Jenis Avtur \t\t\t: " + jenisAvturInvoice + "\t\t#");
            System.out.printf("# Jumlah Liter \t\t\t: %.3f %s %n", liter, literString);
            System.out.println("# Harga Avtur \t\t\t: " + hargaAvturInvoice + "\t\t#");
            System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill) + "    \t#");
            if (checkVIP >= 0) {
                System.out.println("# Diskon VIP \t\t\t: " + kursIDR.format(bill2) + "    \t#");
                System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill3) + "    \t#");
            }
            System.out.println("# Uang Tunai \t\t\t: " + kursIDR.format(pay) + "    \t#");
            System.out.println("# Kembalian \t\t\t: " + kursIDR.format(kembalian) + "\t\t#");
        }
        System.out.println("#########################################################");
    }

    public static void cashback() {
        CurrencyIDR();
        if (bill >= 100000) {
            System.out.println("#\t\t\tSELAMAT!\t\t\t#");
            System.out.println("#########################################################");
            if (bill > 1000000) {
                cashback = kembalian + 50000;
                System.out.println("# Karena Anda telah membeli lebih dari Rp.1.000.000,00 \t#");
                System.out.println("# Anda mendapatkan Cashback sebesar  : Rp.50.000,00 \t#");
                System.out.println("# Total kembalian anda adalah \t     : " + kursIDR.format(cashback) + "\t#");
            } else if (bill > 500000) {
                cashback = kembalian + 25000;
                System.out.println("# Karena Anda telah membeli lebih dari Rp.500.000,00 \t#");
                System.out.println("# Anda mendapatkan Cashback sebesar  : Rp.25.000,00 \t#");
                System.out.println("# Total kembalian anda adalah \t     : " + kursIDR.format(cashback) + "\t#");
            } else if (bill > 100000) {
                cashback = kembalian + 10000;
                System.out.println("# Karena Anda telah membeli lebih dari Rp.100.000,00 \t#");
                System.out.println("# Anda mendapatkan Cashback sebesar  : Rp.10.000,00 \t#");
                System.out.println("# Total kembalian anda adalah \t     : " + kursIDR.format(cashback) + "\t#");
            }
            System.out.println("#########################################################");
        }
    }

    public static void JenisBensinInvoice() {
        if (pilihan == 1) {
            jenisBensinInvoice = "Premium \t";
            hargaBensinInvoice = kursIDR.format(Integer.parseInt(Bensin[1][0]));
        } else if (pilihan == 2) {
            jenisBensinInvoice = "Pertalite \t";
            hargaBensinInvoice = kursIDR.format(Integer.parseInt(Bensin[1][1]));
        } else if (pilihan == 3) {
            jenisBensinInvoice = "Pertamax \t";
            hargaBensinInvoice = kursIDR.format(Integer.parseInt(Bensin[1][2]));
        } else if (pilihan == 4) {
            jenisBensinInvoice = "Pertamax Turbo";
            hargaBensinInvoice = kursIDR.format(Integer.parseInt(Bensin[1][3]));
        } else if (pilihan == 5) {
            jenisBensinInvoice = "Pertamax Racing";
            hargaBensinInvoice = kursIDR.format(Integer.parseInt(Bensin[1][4]));
        }
    }

    public static void JenisDieselInvoice() {
        if (pilihan == 1) {
            jenisDieselInvoice = "Bio Solar";
            hargaDieselInvoice = kursIDR.format(Integer.parseInt(Bensin[3][0]));
        } else if (pilihan == 2) {
            jenisDieselInvoice = "Dex Lite";
            hargaDieselInvoice = kursIDR.format(Integer.parseInt(Bensin[3][1]));
        } else if (pilihan == 3) {
            jenisDieselInvoice = "Pertamina Dex";
            hargaDieselInvoice = kursIDR.format(Integer.parseInt(Bensin[3][2]));
        }
    }

    public static void JenisAvturInvoice() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            jenisAvturInvoice = "Avtur Umum";
            hargaAvturInvoice = kursIDR.format(Integer.parseInt(Bensin[5][1]));
        } else if ("Militer".equals(outputPenggunaanKendaraan)) {
            jenisAvturInvoice = "Avtur Militer";
            hargaAvturInvoice = kursIDR.format(Integer.parseInt(Bensin[5][2]));
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            jenisAvturInvoice = "Avtur Pribadi";
            hargaAvturInvoice = kursIDR.format(Integer.parseInt(Bensin[5][0]));
        }
    }

    public static boolean ulangi() {
        System.out.print("\n\tBeli lagi (Y/N) ? ");
        ulangi = scanChar.next().charAt(0);
        if (ulangi == 'N' || ulangi == 'n') {
            System.out.println("\n\tTerima Kasih");
        } else if (ulangi == 'Y' || ulangi == 'y') {
            return ulangi == 'Y' || ulangi == 'y';
        } else {
            System.out.println("\n\tInputan tidak Valid\n\tSilahkan Coba Lagi");
            ulangi();
        }
        return ulangi == 'Y' || ulangi == 'y';
    }
}
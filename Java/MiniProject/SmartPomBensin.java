import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SmartPomBensin {
    static Locale localeID = new Locale("id", "ID");
    static DecimalFormat kursIDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    static DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    static int premium = 6550, pertalite = 7800, pertamax = 9500, pertamaxTurbo = 10700, pertamaxRacing = 43500,
            bioSolar = 5150, dexLite = 9000, pertaminaDex = 10500, avturPribadi = 12700, avturUmum = 11200,
            avturMiliter = 10500, pilihan, uangBensin;
    static String jenisKendaraan, penggunaanKendaraan, firstCapital, firstCapitalJenis, outputPenggunaanKendaraan,
            tipeKendaraan, outputTipeKendaraan, outputJenisKendaraan, pilihanHitung, outputPilihanHitung,
            jenisBahanBakar, firstCapitalJBB, outputJBB, jenisBensinInvoice, hargaBensinInvoice, jenisDieselInvoice,
            tipeDieselInvoice, hargaDieselInvoice, jenisAvturInvoice, hargaAvturInvoice, literString = "L      \t#";
    static char ulangi;
    static float liter, bill, pay, cashback, kembalian;
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);
    static Scanner scanChar = new Scanner(System.in);
    static Scanner scanFloat = new Scanner(System.in);

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
        System.out.println("#########################################################");
        System.out.println("#\t    POM BENSIN CRAZY RICH INDONESIAN\t\t#");
        System.out.println("#\t\t       51.420.69\t\t\t#");
        System.out.println("#\t\t  REGIONAL JAWA TIMUR\t\t\t#");
        System.out.println("#########################################################");
        System.out.println("#\t\t    Pilih Pembelian\t\t\t#");
        System.out.println("#########################################################");
        System.out.println("# 1. Beli Bahan Bakar Bensin \t\t\t\t#");
        System.out.println("# 2. Beli Bahan Bakar Diesel \t\t\t\t#");
        System.out.println("# 3. Beli Bahan Bakar Penerbangan \t\t\t#");
        System.out.println("#########################################################");
        PilihanMenu();
    }

    public static void PilihanMenu() {
        System.out.print("\n   Masukkan Pilihan (Bensin/Diesel/Penerbangan) : ");
        jenisBahanBakar = scanString.nextLine();
        firstCapitalJBB = jenisBahanBakar.substring(0, 1).toUpperCase();
        outputJBB = firstCapitalJBB + jenisBahanBakar.substring(1);
        if ("Bensin".equals(outputJBB)) {
            Bensin();
        } else if ("Diesel".equals(outputJBB)) {
            Diesel();
        } else if ("Penerbangan".equals(outputJBB)) {
            Penerbangan();
        } else {
            System.out.println("\nMasukkan Tidak Valid!");
            System.out.println("Silahkan Coba Lagi");
            PilihanMenu();
        }
    }

    public static void Bensin() {
        CurrencyIDR();
        System.out.println("\n#########################################################");
        System.out.println("#\t\tHarga Bahan Bakar Bensin\t\t#");
        System.out.println("#########################################################");
        System.out.println("# 1. Premium  \t\t: " + kursIDR.format(premium) + "\t\t\t#");
        System.out.println("# 2. Pertalite \t\t: " + kursIDR.format(pertalite) + "\t\t\t#");
        System.out.println("# 3. Pertamax \t\t: " + kursIDR.format(pertamax) + "\t\t\t#");
        System.out.println("# 4. Pertamax Turbo \t: " + kursIDR.format(pertamaxTurbo) + "\t\t\t#");
        System.out.println("# 5. Pertamax Racing \t: " + kursIDR.format(pertamaxRacing) + "\t\t\t#");
        System.out.println("#########################################################");
        jenisKendaraanBensin();
    }

    public static void jenisKendaraanBensin() {
        System.out.print("\nJenis Kendaraan Anda (R2/R3/R4)      : ");
        jenisKendaraan = scanString.nextLine().toUpperCase();
        if ("R2".equals(jenisKendaraan)) {
            penggunaanKendaraanBensin();
        } else if ("R3".equals(jenisKendaraan)) {
            penggunaanKendaraanBensin();
        } else if ("R4".equals(jenisKendaraan)) {
            penggunaanKendaraanBensin();
        } else {
            System.out.println("\nInputan tidak Valid");
            System.out.println("Silahkan Coba Lagi");
            jenisKendaraanBensin();
        }
    }

    public static void penggunaanKendaraanBensin() {
        if ("R2".equals(jenisKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Pribadi, Dinas, Balap) : ");
        } else if ("R3".equals(jenisKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Pribadi, Dinas) : ");
        } else if ("R4".equals(jenisKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Pribadi, Dinas, Balap) : ");
        }
        penggunaanKendaraan = scanString.nextLine();
        firstCapital = penggunaanKendaraan.substring(0, 1).toUpperCase();
        outputPenggunaanKendaraan = firstCapital + penggunaanKendaraan.substring(1);
        rekomendasiBensin();
    }

    public static void rekomendasiBensin() {
        if ("Umum".equals(outputPenggunaanKendaraan) && "R4".equals(jenisKendaraan)
                || "Umum".equals(outputPenggunaanKendaraan) && "R3".equals(jenisKendaraan)) {
            System.out.println("\nKami menyarankan Anda untuk menggunakan bensin Premium, Pertalite");
            MenuBensin();
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            System.out.println(
                    "\nKami menyarankan Anda untuk menggunakan bensin Premium, Pertalite, Pertamax, Pertamax Turbo");
            MenuBensin();
        } else if ("Dinas".equals(outputPenggunaanKendaraan)) {
            System.out.println("\nKami menyarankan Anda untuk menggunakan bensin Pertalite, Pertamax, Pertamax Turbo");
            MenuBensin();
        } else if ("Balap".equals(outputPenggunaanKendaraan) && "R4".equals(jenisKendaraan)
                || "Balap".equals(outputPenggunaanKendaraan) && "R2".equals(jenisKendaraan)) {
            System.out.println("\nKami menyarankan Anda untuk menggunakan bensin Pertamax Turbo, Pertamax Racing");
            MenuBensin();
        } else {
            System.out.println("\nInputan tidak Valid");
            System.out.println("Silahkan Coba Lagi");
            penggunaanKendaraanBensin();
        }
    }

    public static void MenuBensin() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (1-2)\t     : ");
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (1-4)\t     : ");
        } else if ("Dinas".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (2-4)\t     : ");
        } else if ("Balap".equals(outputPenggunaanKendaraan)) {
            System.out.print("\nMasukkan Pilihan Bensin (4-5)\t     : ");
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
                System.out.println("\nMaaf, Input tidak Valid!");
                System.out.println("Anda akan kembali ke Awal");
                System.out.println("Silahkan Coba Lagi");
                rekomendasiBensin();
            }
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            if (pilihan >= 1 && pilihan <= 4) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 0 || pilihan >= 5) {
                System.out.println("\nMaaf, Input tidak Valid!");
                System.out.println("Anda akan kembali ke Awal");
                System.out.println("Silahkan Coba Lagi");
                rekomendasiBensin();
            }
        } else if ("Dinas".equals(outputPenggunaanKendaraan)) {
            if (pilihan >= 2 && pilihan <= 4) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 1 || pilihan >= 5) {
                System.out.println("\nMaaf, Input tidak Valid!");
                System.out.println("Anda akan kembali ke Awal");
                System.out.println("Silahkan Coba Lagi");
                rekomendasiBensin();
            }
        } else if ("Balap".equals(outputPenggunaanKendaraan)) {
            if (pilihan == 4 || pilihan == 5) {
                NotifPemilihanBensin();
                PembelianBensin();
            } else if (pilihan <= 3 || pilihan >= 5) {
                System.out.println("\nMaaf, Input tidak Valid!");
                System.out.println("Anda akan kembali ke Awal");
                System.out.println("Silahkan Coba Lagi");
                rekomendasiBensin();
            }
        }
    }

    public static void NotifPemilihanBensin() {
        if (pilihan == 1) {
            System.out.println("\nAnda Telah Memilih Premium");
        } else if (pilihan == 2) {
            System.out.println("\nAnda Telah Memilih Pertalite");
        } else if (pilihan == 3) {
            System.out.println("\nAnda Telah Memilih Pertamax");
        } else if (pilihan == 4) {
            System.out.println("\nAnda Telah Memilih Pertamax Turbo");
        } else if (pilihan == 5) {
            System.out.println("\nAnda Telah Memilih Pertamax Racing");
        }
    }

    public static void pilihanHitungBensin() {
        System.out.print("\nAnda ingin menghitung menurut (L/Rp) : ");
        pilihanHitung = scanString.nextLine();
        firstCapital = pilihanHitung.substring(0, 1).toUpperCase();
        outputPilihanHitung = firstCapital + pilihanHitung.substring(1);
        if ("L".equals(outputPilihanHitung)) {
            literBensin();
        } else if ("Rp".equals(outputPilihanHitung)) {
            uangBensin();
        } else {
            System.out.println("Input tidak Valid");
            System.out.println("Silahkan Coba lagi");
            pilihanHitungBensin();
        }
    }

    public static void literBensin() {
        System.out.print("\nMasukkan pembelian bensin (liter)    : ");
        liter = scanFloat.nextFloat();
        if (liter <= 0) {
            System.out.println("\t\tPembelian tidak valid!");
            System.out.println("\t\tSilahkan ulangi");
            literBensin();
        }
    }

    public static void uangBensin() {
        System.out.print("\nMasukkan pembelian bensin \t     : Rp. ");
        bill = scanFloat.nextFloat();
        if (bill <= 0) {
            System.out.println("\t\tPembelian tidak valid!");
            System.out.println("\t\tSilahkan ulangi");
            uangBensin();
        }
    }

    public static void hitungBensin() {
        if ("L".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                bill = premium * liter;
                break;
            case 2:
                bill = pertalite * liter;
                break;
            case 3:
                bill = pertamax * liter;
                break;
            case 4:
                bill = pertamaxTurbo * liter;
                break;
            case 5:
                bill = pertamaxRacing * liter;
                break;
            }
        } else if ("Rp".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                liter = bill / premium;
                break;
            case 2:
                liter = bill / pertalite;
                break;
            case 3:
                liter = bill / pertamax;
                break;
            case 4:
                liter = bill / pertamaxTurbo;
                break;
            case 5:
                liter = bill / pertamaxRacing;
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
            System.out.printf("# Anda akan membeli Premium \t     : %.3f %s %n", liter, literString);
            System.out.println("# Harga Premium adalah \t\t     : " + kursIDR.format(premium) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 2:
            System.out.printf("# Anda akan membeli Pertalite \t     : %.3f %s %n", liter, literString);
            System.out.println("# Harga Pertalite adalah \t     : " + kursIDR.format(pertalite) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 3:
            System.out.printf("# Anda akan membeli Pertamax \t     : %.3f %s %n", liter, literString);
            System.out.println("# Harga Pertamax adalah \t     : " + kursIDR.format(pertamax) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 4:
            System.out.printf("# Anda akan membeli Pertamax Turbo   : %.3f %s %n", liter, literString);
            System.out.println("# Harga Pertamax Turbo adalah \t     : " + kursIDR.format(pertamaxTurbo) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 5:
            System.out.printf("# Anda akan membeli Pertamax Racing  : %.3f %s %n", liter, literString);
            System.out.println("# Harga Pertamax Racing adalah \t     : " + kursIDR.format(pertamaxRacing) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        }
        System.out.println("#########################################################");
        System.out.print("\nUang yang dibayarkan \t\t     : Rp.");
        pay = scanInt.nextInt();
        if (pay >= bill) {
            invoice();
        } else
            System.out.println("\nUang Anda Kurang!");
    }

    public static void Diesel() {
        CurrencyIDR();
        System.out.println("\n#########################################################");
        System.out.println("#\t\tHarga Bahan Bakar Diesel\t\t#");
        System.out.println("#########################################################");
        System.out.println("# 1. Bio Solar \t\t: " + kursIDR.format(bioSolar) + "\t\t\t#");
        System.out.println("# 2. Dex Lite \t\t: " + kursIDR.format(dexLite) + "\t\t\t#");
        System.out.println("# 3. Pertamina Dex \t: " + kursIDR.format(pertaminaDex) + "\t\t\t#");
        System.out.println("#########################################################");
        jenisKendaraanDiesel();
    }

    public static void jenisKendaraanDiesel() {
        System.out.print("\nJenis Kendaraan Anda (R4/Lebih)      : ");
        jenisKendaraan = scanString.nextLine();
        firstCapitalJenis = jenisKendaraan.substring(0, 1).toUpperCase();
        outputJenisKendaraan = firstCapitalJenis + jenisKendaraan.substring(1);

        if ("R4".equals(outputJenisKendaraan)) {
            penggunaanKendaraanDiesel();
        } else if ("Lebih".equals(outputJenisKendaraan)) {
            penggunaanKendaraanDiesel();
        } else {
            System.out.println("\nInputan tidak Valid");
            System.out.println("Silahkan Coba Lagi");
            jenisKendaraanDiesel();
        }
    }

    public static void R4Diesel() {
        System.out.print("\nTipe Kendaraan (Mobil/Truk)\t     : ");
        tipeKendaraan = scanString.nextLine();
        firstCapital = tipeKendaraan.substring(0, 1).toUpperCase();
        outputTipeKendaraan = firstCapital + tipeKendaraan.substring(1);

        if ("Mobil".equals(outputTipeKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Pribadi, Dinas) : ");
        } else if ("Truk".equals(outputTipeKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Dinas) : ");
        } else {
            System.out.println("\nInput tidak Valid!");
            System.out.println("Silahkan Coba Lagi");
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
        firstCapital = penggunaanKendaraan.substring(0, 1).toUpperCase();
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
            System.out.println("\nInputan tidak Valid");
            System.out.println("Silahkan Coba Lagi");
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
                System.out.println("\nMaaf, Input tidak Valid!");
                System.out.println("Anda akan kembali ke Awal");
                System.out.println("Silahkan Coba Lagi");
                rekomendasiDiesel();
            }
        } else if ("Pribadi".equals(outputPenggunaanKendaraan) || "Dinas".equals(outputPenggunaanKendaraan)) {
            if (pilihan == 2 || pilihan == 3) {
                NotifPemilihanDiesel();
                PembelianDiesel();
            } else if (pilihan <= 1 || pilihan >= 4) {
                System.out.println("\nMaaf, Input tidak Valid!");
                System.out.println("Anda akan kembali ke Awal");
                System.out.println("Silahkan Coba Lagi");
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
        firstCapital = pilihanHitung.substring(0, 1).toUpperCase();
        outputPilihanHitung = firstCapital + pilihanHitung.substring(1);
        if ("L".equals(outputPilihanHitung)) {
            literDiesel();
        } else if ("Rp".equals(outputPilihanHitung)) {
            uangDiesel();
        } else {
            System.out.println("Input tidak Valid");
            System.out.println("Silahkan Coba lagi");
            pilihanHitungDiesel();
        }
    }

    public static void literDiesel() {
        System.out.print("\nMasukkan pembelian diesel (liter)    : ");
        liter = scanFloat.nextFloat();
        if (liter <= 0) {
            System.out.println("\t\tAnda tidak beli");
            System.out.println("\t\tSilahakn ulangi");
            literDiesel();
        }
    }

    public static void uangDiesel() {
        System.out.print("\nMasukkan pembelian Diesel \t     : Rp.");
        bill = scanFloat.nextFloat();
        if (bill <= 0) {
            System.out.println("\t\tPembelian tidak valid!");
            System.out.println("\t\tSilahkan ulangi");
            uangDiesel();
        }
    }

    public static void HitungDiesel() {
        if ("L".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                bill = bioSolar * liter;
                break;
            case 2:
                bill = dexLite * liter;
                break;
            case 3:
                bill = pertaminaDex * liter;
                break;
            }
        } else if ("Rp".equals(outputPilihanHitung)) {
            switch (pilihan) {
            case 1:
                liter = bill / bioSolar;
                break;
            case 2:
                liter = bill / dexLite;
                break;
            case 3:
                liter = bill / pertaminaDex;
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
            System.out.println("# Harga Bio Solar adalah \t     : " + kursIDR.format(bioSolar) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 2:
            System.out.printf("# Anda akan membeli Dex Lite \t     : %.3f %s %n", liter, literString);
            System.out.println("# Harga Dex Lite adalah \t     : " + kursIDR.format(dexLite) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        case 3:
            System.out.printf("# Anda akan membeli Pertamina Dex    : %.3f %s %n", liter, literString);
            System.out.println("# Harga Pertamina Dex adalah \t     : " + kursIDR.format(pertaminaDex) + "\t#");
            System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
            break;
        default:
            System.out.println("Masukkan Tidak Valid!");
            break;
        }
        System.out.println("#########################################################");
        System.out.print("\nUang yang dibayarkan \t\t     : Rp.");
        pay = scanInt.nextInt();
        if (pay >= bill) {
            invoice();
        } else
            System.out.println("\nUang Anda Kurang!");
    }

    public static void Penerbangan() {
        CurrencyIDR();
        System.out.println("\n#########################################################");
        System.out.println("#\t\tHarga Bahan Bakar Penerbangan\t\t#");
        System.out.println("#########################################################");
        System.out.println("# 1. Avtur Umum \t: " + kursIDR.format(avturUmum) + "\t\t\t#");
        System.out.println("# 1. Avtur Militer \t: " + kursIDR.format(avturMiliter) + "\t\t\t#");
        System.out.println("# 1. Avtur Pribadi \t: " + kursIDR.format(avturPribadi) + "\t\t\t#");
        System.out.println("#########################################################");
        jenisKendaraanPenerbangan();
    }

    public static void jenisKendaraanPenerbangan() {
        System.out.print("\nJenis Kendaraan Anda (Pesawat/Helikopter) : ");
        jenisKendaraan = scanString.nextLine();
        firstCapitalJenis = jenisKendaraan.substring(0, 1).toUpperCase();
        outputJenisKendaraan = firstCapitalJenis + jenisKendaraan.substring(1);

        if ("Pesawat".equals(outputJenisKendaraan)) {
            penggunaanKendaraanPenerbangan();
        } else if ("Helikopter".equals(outputJenisKendaraan)) {
            penggunaanKendaraanPenerbangan();
        } else {
            System.out.println("\nInputan tidak Valid");
            System.out.println("Silahkan Coba Lagi");
            jenisKendaraanPenerbangan();
        }
    }

    public static void penggunaanKendaraanPenerbangan() {
        if ("Pesawat".equals(outputJenisKendaraan) || "Helikopter".equals(outputJenisKendaraan)) {
            System.out.print("\nPenggunaan Kendaraan Anda (Umum, Militer, Pribadi) : ");
        }
        penggunaanKendaraan = scanString.nextLine();
        firstCapital = penggunaanKendaraan.substring(0, 1).toUpperCase();
        outputPenggunaanKendaraan = firstCapital + penggunaanKendaraan.substring(1);
        verifPenerbangan();
    }

    public static void verifPenerbangan() {
        if ("Umum".equals(outputPenggunaanKendaraan) || "Pribadi".equals(outputPenggunaanKendaraan)
                || "Militer".equals(outputPenggunaanKendaraan)) {
            PembelianPenerbangan();
        } else {
            System.out.println("\nInputan tidak Valid");
            System.out.println("Silahkan Coba Lagi");
            penggunaanKendaraanPenerbangan();
        }
    }

    public static void pilihanHitungAvtur() {
        System.out.print("\nAnda ingin menghitung menurut (L/Rp) : ");
        pilihanHitung = scanString.nextLine();
        firstCapital = pilihanHitung.substring(0, 1).toUpperCase();
        outputPilihanHitung = firstCapital + pilihanHitung.substring(1);
        if ("L".equals(outputPilihanHitung)) {
            literAvtur();
        } else if ("Rp".equals(outputPilihanHitung)) {
            uangAvtur();
        } else {
            System.out.println("Input tidak Valid");
            System.out.println("Silahkan Coba lagi");
            pilihanHitungAvtur();
        }
    }

    public static void literAvtur() {
        System.out.print("\nMasukkan pembelian Avtur (liter)     : ");
        liter = scanFloat.nextFloat();
        if (liter <= 0) {
            System.out.println("\t\tAnda tidak beli");
            System.out.println("\t\tSilahakn ulangi");
            literAvtur();
        }
    }

    public static void uangAvtur() {
        System.out.print("\nMasukkan pembelian Avtur \t     : Rp.");
        bill = scanFloat.nextFloat();
        if (bill <= 0) {
            System.out.println("\t\tPembelian tidak valid!");
            System.out.println("\t\tSilahkan ulangi");
            uangAvtur();
        }
    }

    public static void HitungAvtur() {
        if ("L".equals(outputPilihanHitung)) {
            if ("Umum".equals(outputPenggunaanKendaraan)) {
                bill = liter * avturUmum;
            } else if ("Militer".equals(outputPenggunaanKendaraan)) {
                bill = liter * avturMiliter;
            } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
                bill = liter * avturPribadi;
            }
        } else if ("Rp".equals(outputPilihanHitung)) {
            if ("Umum".equals(outputPenggunaanKendaraan)) {
                liter = bill / bioSolar;
            } else if ("Militer".equals(outputPenggunaanKendaraan)) {
                liter = bill / dexLite;
            } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
                liter = bill / pertaminaDex;
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
            System.out.println("# Harga Avtur Umum adalah \t     : " + kursIDR.format(avturUmum) + "\t#");
        } else if ("Militer".equals(outputPenggunaanKendaraan)) {
            System.out.println("# Harga Avtur Militer adalah \t     : " + kursIDR.format(avturMiliter) + "\t#");
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            System.out.println("# Harga Avtur Pribadi adalah \t     : " + kursIDR.format(avturPribadi) + "\t#");
        }
        System.out.println("# Total Harga adalah \t\t     : " + kursIDR.format(bill) + "\t#");
        System.out.println("#########################################################");
        System.out.print("\nUang yang dibayarkan \t\t     : Rp.");
        pay = scanInt.nextInt();
        if (pay >= bill) {
            invoice();
        } else
            System.out.println("\nUang Anda Kurang!");

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
        System.out.println("#\t    POM BENSIN CRAZY RICH INDONESIAN\t\t#");
        System.out.println("#\t\t       51.420.69\t\t\t#");
        System.out.println("#\t\t  REGIONAL JAWA TIMUR\t\t\t#");
        System.out.println("#########################################################");
        System.out.println("#\t   " + dateFormat.format(dNow) + "\t\t#");
        System.out.println("#########################################################");
    }

    public static void IntiInvoice() {
        CurrencyIDR();
        kembalian = pay - bill;
        if ("Bensin".equals(outputJBB)) {
            JenisBensinInvoice();
            System.out.println("# Jenis Kendaraan \t\t: " + jenisKendaraan + "\t\t\t#");
            System.out.println("# Penggunaan Kendaraan \t\t: " + outputPenggunaanKendaraan + "  \t\t#");
            System.out.println("# Jenis Bensin \t\t\t: " + jenisBensinInvoice + "\t#");
            System.out.printf("# Jumlah Liter \t\t\t: %.3f %s %n", liter, literString);
            System.out.println("# Harga Bensin \t\t\t: " + hargaBensinInvoice + "\t\t#");
            System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill) + "    \t#");
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
            System.out.println("# Uang Tunai \t\t\t: " + kursIDR.format(pay) + "    \t#");
            System.out.println("# Kembalian \t\t\t: " + kursIDR.format(kembalian) + "\t\t#");
        } else if ("Penerbangan".equals(outputJBB)) {
            JenisAvturInvoice();
            System.out.println("# Jenis Kendaraan \t\t: " + outputJenisKendaraan + "\t\t#");
            System.out.println("# Penggunaan Kendaraan \t\t: " + outputPenggunaanKendaraan + "  \t\t#");
            System.out.println("# Jenis Avtur \t\t\t: " + jenisAvturInvoice + "\t\t#");
            System.out.printf("# Jumlah Liter \t\t\t: %.3f %s %n", liter, literString);
            System.out.println("# Harga Avtur \t\t\t: " + hargaAvturInvoice + "\t\t#");
            System.out.println("# Jumlah Harga \t\t\t: " + kursIDR.format(bill) + "    \t#");
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
            if (bill >= 1000000) {
                cashback = kembalian + 50000;
                System.out.println("# Karena Anda telah membeli lebih dari Rp.1.000.000,00 \t#");
                System.out.println("# Anda mendapatkan Cashback sebesar  : Rp.50.000,00 \t#");
                System.out.println("# Total kembalian anda adalah \t     : " + kursIDR.format(cashback) + "\t#");
            } else if (bill >= 500000) {
                cashback = kembalian + 25000;
                System.out.println("# Karena Anda telah membeli lebih dari Rp.500.000,00 \t#");
                System.out.println("# Anda mendapatkan Cashback sebesar  : Rp.25.000,00 \t#");
                System.out.println("# Total kembalian anda adalah \t     : " + kursIDR.format(cashback) + "\t#");
            } else if (bill >= 100000) {
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
            hargaBensinInvoice = kursIDR.format(premium);
        } else if (pilihan == 2) {
            jenisBensinInvoice = "Pertalite \t";
            hargaBensinInvoice = kursIDR.format(pertalite);
        } else if (pilihan == 3) {
            jenisBensinInvoice = "Pertamax \t";
            hargaBensinInvoice = kursIDR.format(pertamax);
        } else if (pilihan == 4) {
            jenisBensinInvoice = "Pertamax Turbo";
            hargaBensinInvoice = kursIDR.format(pertamaxTurbo);
        } else if (pilihan == 5) {
            jenisBensinInvoice = "Pertamax Racing";
            hargaBensinInvoice = kursIDR.format(pertamaxRacing);
        }
        kembalian = pay - bill;
    }

    public static void JenisDieselInvoice() {
        if (pilihan == 1) {
            jenisDieselInvoice = "Bio Solar";
            hargaDieselInvoice = kursIDR.format(bioSolar);
        } else if (pilihan == 2) {
            jenisDieselInvoice = "Dex Lite";
            hargaDieselInvoice = kursIDR.format(dexLite);
        } else if (pilihan == 3) {
            jenisDieselInvoice = "Pertamina Dex";
            hargaDieselInvoice = kursIDR.format(pertaminaDex);
        }
        kembalian = pay - bill;
    }

    public static void JenisAvturInvoice() {
        if ("Umum".equals(outputPenggunaanKendaraan)) {
            jenisAvturInvoice = "Avtur Umum";
            hargaAvturInvoice = kursIDR.format(avturUmum);
        } else if ("Militer".equals(outputPenggunaanKendaraan)) {
            jenisAvturInvoice = "Avtur Militer";
            hargaAvturInvoice = kursIDR.format(avturMiliter);
        } else if ("Pribadi".equals(outputPenggunaanKendaraan)) {
            jenisAvturInvoice = "Avtur Pribadi";
            hargaAvturInvoice = kursIDR.format(avturPribadi);
        }
    }

    public static boolean ulangi() {
        System.out.print("\nBeli lagi (Y/N) ? ");
        ulangi = scanChar.next().charAt(0);
        if (ulangi == 'N' || ulangi == 'n') {
            System.out.println("\nTerima Kasih");
        } else if (ulangi == 'Y' || ulangi == 'y') {
            return ulangi == 'Y' || ulangi == 'y';
        } else {
            System.out.println("Inputan tidak valid!");
            System.out.println("Coba lagi");
            ulangi();
        }
        return ulangi == 'Y' || ulangi == 'y';
    }
}
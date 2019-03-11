import java.util.Scanner;

public class MesinATM {

    static Scanner scInt = new Scanner(System.in);
    static Scanner scString = new Scanner(System.in);
    static int pilihanMasuk, pilihanMenu, pilihanMenu1, pilihanLogin, ambil, saldoAkhir, pilihTransfer, tujuan,
            jumlahTransfer, pinBaru, password;
    static String okza = "Okza", farhan = "Farhan", syarief = "Syarief", titus = "Titus", darell = "Darell", username,
            kembali, user;
    static int saldoOkza = 500000;
    static int saldoFarhan = 2000000;
    static int saldoSyarief = 1500000;
    static int saldoTitus = 700000;
    static int saldoDarell = 100000000;
    static int rekeningOkza = 00000000;
    static int rekeningFarhan = 00000001;
    static int rekeningSyarief = 11111110;
    static int rekeningTitus = 22222202;
    static int rekeningDarell = 33333033;
    static int pinOkza = 123456;
    static int pinFarhan = 234567;
    static int pinSyarief = 345678;
    static int pinTitus = 456789;
    static int pinDarell = 567890;

    public static void main(String[] args) {
        login();
    }

    public static void login() {

        System.out.println("==========================");
        System.out.print("USERNAME\t: ");
        username = scString.nextLine();
        System.out.print("PASSWORD\t: ");
        password = scString.nextInt();
        System.out.println("==========================");

        switch (username) {
        case "Farhan":
            checkLogin(farhan, pinFarhan, password);
            break;
        case "Okza":
            checkLogin(okza, pinOkza, password);
            break;
        case "Syarief":
            checkLogin(syarief, pinSyarief, password);
            break;
        case "Titus":
            checkLogin(titus, pinTitus, password);
            break;
        case "Darell":
            checkLogin(darell, pinDarell, password);
            break;
        default:
            System.out.println("Maaf, username anda tidak terdaftar");
            break;
        }

    }

    public static void checkLogin(String username, int pin, int input) {
        if (pin == input) {
            menu();
            user = username;
        } else {
            System.out.println("Maaf, password anda salah");
        }
    }

    public static void menu() {

        System.out.println("==========================");
        System.out.println("1. Daftar Rekening");
        System.out.println("2. Masuk");
        System.out.println("==========================");
        System.out.println(" ");
        System.out.print("Silahkan pilih menu: ");
        pilihanMenu = scInt.nextInt();

        if (pilihanMenu == 1) {
            daftarRekening();
        } else if (pilihanMenu == 2) {
            masuk();
        } else {
            System.out.println("Input salah! Silahkan ulangi");
            menu();
        }
    }

    public static void daftarRekening() {
        System.out.println("==========================");
        System.out.println("\t DAFTAR REKENING\t");
        System.out.println("1. ABC");
        System.out.println("2. Diriman");
        System.out.println("3. IBN");
        System.out.println("4. IRB");
        System.out.println("==========================");
        System.out.println("Kembali?(Ya/Tidak)");
        scString.nextLine();
        kembali = scString.nextLine();
        if (kembali.equalsIgnoreCase("Ya")) {
            menu();
        } else if (kembali.equalsIgnoreCase("Tidak")) {
            keluar();
        }

    }

    public static void masuk() {

        System.out.println("==========================");
        System.out.println("1. Informasi Saldo");
        System.out.println("2. Penarikan Tunai");
        System.out.println("3. Tranfer");
        System.out.println("4. Ganti PIN");
        System.out.println("5. Keluar");
        System.out.println("==========================");
        System.out.print("Silahkan Pilih: ");
        pilihanMenu1 = scInt.nextInt();

        if (pilihanMenu1 == 1) {
            informasiSaldo();
        } else if (pilihanMenu1 == 2) {
            penarikanTunai();
        } else if (pilihanMenu1 == 3) {
            transfer();
        } else if (pilihanMenu1 == 4) {
            gantiPin();
        } else if (pilihanMenu1 == 5) {
            keluar();
        } else {
            System.out.println("Input salah! Silahkan input kembali");
            masuk();
        }

    }

    public static void informasiSaldo() {

        System.out.println("==========================");
        switch (username) {
        case "Okza":
            System.out.println("Saldo Anda\t: " + saldoOkza);
            System.out.println("==========================");
            System.out.println("Kembali?(Ya/Tidak)");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Farhan":
            System.out.println("Saldo Anda\t: " + saldoFarhan);
            System.out.println("==========================");
            System.out.println("Kembali?(Ya/Tidak)");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Syarief":
            System.out.println("Saldo Anda\t: " + saldoSyarief);
            System.out.println("==========================");
            System.out.println("Kembali?(Ya/Tidak)");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Titus":
            System.out.println("Saldo Anda\t: " + saldoTitus);
            System.out.println("==========================");
            System.out.println("Kembali?(Ya/Tidak)");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Darell":
            System.out.println("Saldo Anda\t: " + saldoDarell);
            System.out.println("==========================");
            System.out.println("Kembali?(Ya/Tidak)");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("ya")) {
                masuk();
            } else {
                keluar();
            }

            break;
        default:
            break;

        }
    }

    public static void penarikanTunai() {
        System.out.println("==========================");
        System.out.print("Jumlah yang mau diambil\t: ");
        ambil = scInt.nextInt();
        System.out.println("==========================");

        switch (username) {
        case "Okza":
            saldoAkhir = saldoOkza - ambil;
            if (saldoAkhir < 50000) {
                System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                System.out.println("Silahkan ulangi");
                penarikanTunai();
            } else if (saldoAkhir >= 50000) {
                System.out.println("Silahkan ambil uang anda");
                System.out.println("==========================");
                System.out.println("Sisa saldo anda: " + saldoAkhir);
                System.out.println("Ingin melakukan transaksi lain?(Ya/Tidak)");
                kembali = scString.nextLine();
                if (kembali.equalsIgnoreCase("Ya")) {
                    masuk();
                } else {
                    keluar();
                }
                break;
            }
        case "Farhan":
            saldoAkhir = saldoFarhan - ambil;
            if (saldoAkhir < 50000) {
                System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                System.out.println("Silahkan ulangi");
                penarikanTunai();
            } else if (saldoAkhir >= 50000) {
                System.out.println("Silahkan ambil uang anda");
                System.out.println("==========================");
                System.out.println("Sisa saldo anda: " + saldoAkhir);
                System.out.println("Ingin melakukan transaksi lain?(Ya/Tidak)");
                kembali = scString.nextLine();
                if (kembali.equalsIgnoreCase("Ya")) {
                    masuk();
                } else {
                    keluar();
                }
                break;
            }
        case "Syarief":
            saldoAkhir = saldoSyarief - ambil;
            if (saldoAkhir < 50000) {
                System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                System.out.println("Silahkan ulangi");
                penarikanTunai();
            } else if (saldoAkhir >= 50000) {
                System.out.println("Silahkan ambil uang anda");
                System.out.println("==========================");
                System.out.println("Sisa saldo anda: " + saldoAkhir);
                System.out.println("Ingin melakukan transaksi lain?(Ya/Tidak)");
                kembali = scString.nextLine();
                if (kembali.equalsIgnoreCase("Ya")) {
                    masuk();
                } else {
                    keluar();
                }
                break;
            }
        case "Titus":
            saldoAkhir = saldoTitus - ambil;
            if (saldoAkhir < 50000) {
                System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                System.out.println("Silahkan ulangi");
                penarikanTunai();
            } else if (saldoAkhir >= 50000) {
                System.out.println("Silahkan ambil uang anda");
                System.out.println("==========================");
                System.out.println("Sisa saldo anda: " + saldoAkhir);
                System.out.println("Ingin melakukan transaksi lain?(Ya/Tidak)");
                kembali = scString.nextLine();
                if (kembali.equalsIgnoreCase("Ya")) {
                    masuk();
                } else {
                    keluar();
                }
                break;
            }
        case "Darell":
            saldoAkhir = saldoTitus - ambil;
            if (saldoAkhir < 50000) {
                System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                System.out.println("Silahkan ulangi");
                penarikanTunai();
            } else if (saldoAkhir >= 50000) {
                System.out.println("Silahkan ambil uang anda");
                System.out.println("==========================");
                System.out.println("Sisa saldo anda: " + saldoAkhir);
                System.out.println("Ingin melakukan transaksi lain?(Ya/Tidak)");
                kembali = scString.nextLine();
                if (kembali.equalsIgnoreCase("Ya")) {
                    masuk();
                } else {
                    keluar();
                }
                break;
            }
        default:
            break;
        }
    }

    public static void transfer() {
        System.out.println("==========================");
        System.out.println("\t TRANSFER\t ");

        switch (username) {
        case "Okza":
            System.out.println("==========================");
            System.out.print("Input Nomor Rekening Tujuan: ");
            tujuan = scInt.nextInt();
            System.out.println("==========================");
            System.out.print("Input jumlah: ");
            jumlahTransfer = scInt.nextInt();
            if (tujuan == rekeningFarhan) {
                saldoAkhir = saldoOkza - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }

            } else if (tujuan == rekeningSyarief) {
                saldoAkhir = saldoOkza - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningTitus) {
                saldoAkhir = saldoOkza - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningDarell) {
                saldoAkhir = saldoOkza - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            }
            break;
        case "Farhan":
            System.out.println("==========================");
            System.out.print("Input Nomor Rekening Tujuan: ");
            tujuan = scInt.nextInt();
            System.out.println("==========================");
            System.out.print("Input jumlah: ");
            jumlahTransfer = scInt.nextInt();
            if (tujuan == rekeningOkza) {
                saldoAkhir = saldoFarhan - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningSyarief) {
                saldoAkhir = saldoFarhan - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningTitus) {
                saldoAkhir = saldoFarhan - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningDarell) {
                saldoAkhir = saldoFarhan - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            }
            break;
        case "Syarief":
            System.out.println("==========================");
            System.out.print("Input Nomor Rekening Tujuan: ");
            tujuan = scInt.nextInt();
            System.out.println("==========================");
            System.out.print("Input jumlah: ");
            jumlahTransfer = scInt.nextInt();
            if (tujuan == rekeningOkza) {
                saldoAkhir = saldoSyarief - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningFarhan) {
                saldoAkhir = saldoSyarief - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningTitus) {
                saldoAkhir = saldoSyarief - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningDarell) {
                saldoAkhir = saldoSyarief - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            }
            break;
        case "Titus":
            System.out.println("==========================");
            System.out.print("Input Nomor Rekening Tujuan: ");
            tujuan = scInt.nextInt();
            System.out.println("==========================");
            System.out.print("Input jumlah: ");
            jumlahTransfer = scInt.nextInt();
            if (tujuan == rekeningOkza) {
                saldoAkhir = saldoTitus - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningFarhan) {
                saldoAkhir = saldoTitus - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningSyarief) {
                saldoAkhir = saldoTitus - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningDarell) {
                saldoAkhir = saldoTitus - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            }
            break;
        case "Darell":
            System.out.println("==========================");
            System.out.print("Input Nomor Rekening Tujuan: ");
            tujuan = scInt.nextInt();
            System.out.println("==========================");
            System.out.print("Input jumlah: ");
            jumlahTransfer = scInt.nextInt();
            if (tujuan == rekeningOkza) {
                saldoAkhir = saldoDarell - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningFarhan) {
                saldoAkhir = saldoTitus - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningSyarief) {
                saldoAkhir = saldoTitus - jumlahTransfer - 6500;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            } else if (tujuan == rekeningTitus) {
                saldoAkhir = saldoTitus - jumlahTransfer;
                if (saldoAkhir < 50000) {
                    System.out.println("Mohon maaf transaksi gagal, karena" + " saldo tidak mencapai batas minimum");
                    System.out.println("Silahkan ulangi");
                    transfer();
                } else {
                    System.out.println("==========================");
                    System.out.println("\t\t PROSES\t\t ");
                    System.out.println("==========================");
                    System.out.println("\t TRANSAKSI BERHASIL\t");
                    System.out.println("==========================");
                    System.out.println("Sisa saldo anda: " + saldoAkhir);
                    System.out.println("==========================");
                    System.out.println("Ingin melanjutkan transaksi?(Ya/Tidak");
                    kembali = scString.nextLine();
                    if (kembali.equalsIgnoreCase("ya")) {
                        masuk();
                    } else {

                    }
                }
            }
            break;
        default:
            break;
        }
    }

    public static void gantiPin() {
        System.out.println("==========================");
        System.out.println("\t Ganti PIN\t");
        System.out.println("==========================");
        System.out.println(" ");
        System.out.println(" ");
        switch (username) {
        case "Okza":
            System.out.println("PIN lama anda adalah: " + pinOkza);
            System.out.print("Silahkan masukkan pin baru: ");
            pinBaru = scInt.nextInt();
            System.out.println("==========================");
            System.out.println("\tPIN TELAH DIGANTI\t");
            System.out.println("==========================");
            pinOkza = pinBaru;
            System.out.println("Kembali?(Ya/Tidak");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("Ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Farhan":
            System.out.println("PIN lama anda adalah: " + pinFarhan);
            System.out.print("Silahkan masukkan pin baru: ");
            pinBaru = scInt.nextInt();
            System.out.println("==========================");
            System.out.println("PIN TELAH DIGANTI\t");
            System.out.println("==========================");
            System.out.println("Kembali?(Ya/Tidak");
            pinFarhan = pinBaru;
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("Ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Syarief":
            System.out.println("PIN lama anda adalah: " + pinSyarief);
            System.out.print("Silahkan masukkan pin baru: ");
            pinBaru = scInt.nextInt();
            System.out.println("==========================");
            System.out.println("\tPIN TELAH DIGANTI\t");
            System.out.println("==========================");
            pinSyarief = pinBaru;
            System.out.println("Kembali?(Ya/Tidak");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("Ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Titus":
            System.out.println("PIN lama anda adalah: " + pinTitus);
            System.out.print("Silahkan masukkan pin baru: ");
            pinBaru = scInt.nextInt();
            System.out.println("==========================");
            System.out.println("\tPIN TELAH DIGANTI\t");
            System.out.println("==========================");
            pinTitus = pinBaru;
            System.out.println("Kembali?(Ya/Tidak");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("Ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        case "Darell":
            System.out.println("PIN lama anda adalah: " + pinDarell);
            System.out.print("Silahkan masukkan pin baru: ");
            pinBaru = scInt.nextInt();
            System.out.println("==========================");
            System.out.println("\tPIN TELAH DIGANTI\t");
            System.out.println("==========================");
            pinDarell = pinBaru;
            System.out.println("Kembali?(Ya/Tidak)");
            kembali = scString.nextLine();
            if (kembali.equalsIgnoreCase("Ya")) {
                masuk();
            } else {
                keluar();
            }
            break;
        default:
            break;
        }
    }

    public static void keluar() {
        System.out.println("==========================");
        System.out.println("\t TERIMAKASIH\t");
        System.out.println("==========================");

    }
}

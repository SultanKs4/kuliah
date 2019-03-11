import java.util.Scanner;

public class GameOnline {

    static Scanner scInt = new Scanner(System.in);
    static Scanner scString = new Scanner(System.in);
    static int menuAwal, type, gender, hair, skin, eyes, world, count = 1, pilihan;
    static String username, username1, password1, password, password2, back;

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("=\t\t\t\t\t  =");
        System.out.println("=\t\tDHARMA'S GAME\t\t  =");
        System.out.println("=\t\t\t\t\t  =");
        System.out.println("===========================================");
        preAwal();

    }

    public static void preAwal() {
        System.out.println("===========================================");
        System.out.println("=\t1.Login\t\t2.Register\t  =");
        System.out.println("===========================================");
        System.out.print("Select\t: ");
        menuAwal = scInt.nextInt();
        if (menuAwal == 1) {
            login();
        } else if (menuAwal == 2) {
            register();
        } else {
            System.out.println("Wrong input! Please try again");
            preAwal();
        }

    }

    public static void login() {
        System.out.println("===========================================");
        System.out.print("=\tUSERNAME\t: ");
        username1 = scString.nextLine();
        System.out.print("=\tPASSWORD\t: ");
        password1 = scString.nextLine();
        System.out.println("===========================================");

        if (username1.equalsIgnoreCase(username)) {
            if (password1.equals(password)) {
                awal();
            } else if (count >= 3) {
                end();
            } else {
                System.out.println("The password is incorrect! please try again");
                count++;
                login();

            }
        } else {
            System.out.println("Sorry, your username doesn't exist");
            System.out.println("Please register first");
            register();
        }
    }

    public static void awal() {
        System.out.println("===========================================");
        System.out.println("=\t 1. Check Status\t\t  =");
        System.out.println("=\t 2. Select World\t\t  =");
        System.out.println("=\t 3. Exit\t\t\t  =");
        System.out.println("===========================================");
        System.out.print("Select: ");
        pilihan = scInt.nextInt();
        if (pilihan == 1) {
            checkStatus();
        } else if (pilihan == 2) {
            selectTheWorld();
        } else if (pilihan == 3) {
            end();
        } else {
            System.out.println("Wrong input! please try again");
            awal();
        }

    }

    public static void register() {
        System.out.println("===========================================");
        System.out.print("=\t Username\t\t: ");
        username = scString.nextLine();
        password();
    }

    public static void password() {
        System.out.print("=\t Password\t\t: ");
        password = scString.nextLine();
        rePassword();
    }

    public static void rePassword() {
        System.out.print("=\t re-enter the password\t: ");
        password2 = scString.nextLine();
        if (password2.equals(password)) {
            character();
        } else {
            System.out.println("=\tSorry, the password doesn't match\t=");
            password();
        }
    }

    public static void character() {
        System.out.println("===========================================");
        System.out.println("=\tSelect Class:\t\t\t  =");
        System.out.println("=\t1. Warrior 2. Mage 3. Archer\t  =");
        System.out.print("=\tSelect: ");
        type = scString.nextInt();
        System.out.println("===========================================");
        System.out.println("=\t Select Your Gender:\t\t  =");
        System.out.println("=\t 1. Male\t 2. Female\t  =");
        System.out.print("=\tSelect: ");
        gender = scString.nextInt();
        System.out.println("===========================================");
        System.out.println("=\tSelect Your Hair Colour:\t  =");
        System.out.println("=\t 1. Red\t\t\t\t  =");
        System.out.println("=\t 2. Blue\t\t\t  =");
        System.out.println("=\t 3. Black\t\t\t  =");
        System.out.println("=\t 4. Green\t\t\t  =");
        System.out.println("=\t 5. White\t\t\t  =");
        System.out.print("=\tSelect: ");
        hair = scString.nextInt();
        System.out.println("===========================================");
        System.out.println("=\tSelect Your Skin Colour:\t  =");
        System.out.println("=\t 1. Red\t\t\t\t  =");
        System.out.println("=\t 2. Blue\t\t\t  =");
        System.out.println("=\t 3. Black\t\t\t  =");
        System.out.println("=\t 4. Green\t\t\t  =");
        System.out.println("=\t 5. White\t\t\t  =");
        System.out.print("=\t Select: ");
        skin = scString.nextInt();
        System.out.println("===========================================");
        System.out.println("=\t Select Your Eyes Colour:\t  =");
        System.out.println("=\t 1. Red\t\t\t\t  =");
        System.out.println("=\t 2. Blue\t\t\t  =");
        System.out.println("=\t 3. Black\t\t\t  =");
        System.out.println("=\t 4. Green\t\t\t  =");
        System.out.println("=\t 5. White\t\t\t  =");
        System.out.print("=\t Select: ");
        eyes = scString.nextInt();
        scString.nextLine();
        preAwal();
    }

    public static void selectTheWorld() {
        System.out.println("===========================================");
        System.out.println("=\t\tWorld\t\t\t  =");
        System.out.println("=\t 1. Desert\t\t\t  =");
        System.out.println("=\t 2. Death Valley\t\t  =");
        System.out.println("=\t 3. Dark World\t\t\t  =");
        System.out.println("=\t 4. Heaven\t\t\t  =");
        System.out.println("=\t 5. Krypton\t\t\t  =");
        System.out.print("=\t Select the world: ");
        world = scInt.nextInt();
        switch (world) {
        case 1:
            desert();
            break;
        case 2:
            deathValley();
            break;
        case 3:
            darkWorld();
            break;
        case 4:
            heaven();
            break;
        case 5:
            krypton();
            break;
        default:
            System.out.println("You want to go back? ( Yes / No )");
            back = scString.nextLine();
            if (back.equalsIgnoreCase("yes")) {
                selectTheWorld();
            } else {
                end();
            }
        }
    }

    public static void checkStatus() {
        System.out.println("==============================================");
        System.out.println("=\t CHARACTER STATUS\t\t    =");
        System.out.println("==============================================");
        System.out.println("=\t USERNAME\t\t: " + username + "  =");
        if (type == 1) {
            System.out.println("=\t CLASS\t\t\t: WARRIOR    =");
        } else if (type == 2) {
            System.out.println("=\t CLASS\t\t\t: MAGE       =");
        } else if (type == 3) {
            System.out.println("=\t CLASS\t\t\t: ARCHER     =");
        }
        if (gender == 1) {
            System.out.println("=\t GENDER\t\t\t: MALE       =");
        } else if (gender == 2) {
            System.out.println("=\t GENDER\t\t\t: FEMALE     =");
        }
        if (hair == 1) {
            System.out.println("=\t HAIR COLOUR\t\t: RED\t     =");
        } else if (hair == 2) {
            System.out.println("=\t HAIR COLOUR\t\t: BLUE\t     =");
        } else if (hair == 3) {
            System.out.println("=\t HAIR COLOUR\t\t: BLACK\t     =");
        } else if (hair == 4) {
            System.out.println("=\t HAIR COLOUR\t\t: GREEN\t     =");
        } else if (hair == 5) {
            System.out.println("=\t HAIR COLOUR\t\t: WHITE\t     =");
        }
        if (skin == 1) {
            System.out.println("=\t SKIN COLOUR\t\t: RED\t     =");
        } else if (skin == 2) {
            System.out.println("=\t SKIIN COLOUR\t\t: BLUE\t     =");
        } else if (skin == 3) {
            System.out.println("=\t SKIN COLOUR\t\t: BLACK\t     =");
        } else if (skin == 4) {
            System.out.println("=\t SKIN COLOUR\t\t: GREEN\t     =");
        } else if (skin == 5) {
            System.out.println("=\t SKIN COLOUR\t\t: WHITE\t     =");
        }
        if (eyes == 1) {
            System.out.println("=\t EYES COLOUR\t\t: RED\t     =");
        } else if (eyes == 2) {
            System.out.println("=\t EYES COLOUR\t\t: BLUE\t     =");
        } else if (eyes == 3) {
            System.out.println("=\t EYES COLOUR\t\t: BLACK\t     =");
        } else if (eyes == 4) {
            System.out.println("=\t EYES COLOUR\t\t: GREEN\t     =");
        } else if (eyes == 5) {
            System.out.println("=\t EYES COLOUR\t\t: WHITE\t     =");
        }
        int hp = (int) (Math.random() * 1000) + 500;
        System.out.println("=\t HP\t\t\t: " + hp + "\t     =");
        int atk = (int) (Math.random() * 100) + 50;
        System.out.println("=\t ATTACK\t\t\t: " + atk + "\t     =");
        int def = (int) (Math.random() * 100) + 50;
        System.out.println("=\t DEFEND\t\t\t: " + def + "\t     =");
        int intel = (int) (Math.random() * 100) + 50;
        System.out.println("=\t INTELLIGENT\t\t: " + intel + "\t     =");
        int str = (int) (Math.random() * 100) + 50;
        System.out.println("=\t STRENGTH\t\t: " + str + "\t     =");
        int agi = (int) (Math.random() * 100) + 50;
        System.out.println("=\t AGILITY\t\t: " + agi + "\t     =");
        int luk = (int) (Math.random() * 100) + 50;
        System.out.println("=\t LUCKY\t\t\t: " + luk + "\t     =");
        System.out.println("==============================================");
        System.out.println("=\t You want to go back? (Yes / No)");
        back = scString.nextLine();
        if (back.equalsIgnoreCase("yes")) {
            awal();
        } else if (back.equalsIgnoreCase("no")) {
            end();
        } else {
            System.out.println("=\t Wrong input! please try again\t=");
            checkStatus();
        }

    }

    public static void desert() {
        System.out.println("===========================================");
        System.out.println("=\t WELCOME TO THE DESERT WORLD\t  =");
        System.out.println("=\t PLEASE ENJOY THE GAME\t\t  =");
        System.out.println("===========================================");
    }

    public static void deathValley() {
        System.out.println("===========================================");
        System.out.println("=\t WELCOME TO THE DEATH VALLEY\t  =");
        System.out.println("=\t PLEASE ENJOY THE GAME\t\t  = ");
        System.out.println("===========================================");
    }

    public static void darkWorld() {
        System.out.println("===========================================");
        System.out.println("=\t WELCOME TO THE DARK WORLD\t  =");
        System.out.println("=\t PLEASE ENJOY THE GAME\t\t  =");
        System.out.println("===========================================");
    }

    public static void heaven() {
        System.out.println("===========================================");
        System.out.println("=\t WELCOME TO THE HEAVEN\t\t  =");
        System.out.println("=\t PLEASE ENJOY THE GAME\t\t  =");
        System.out.println("===========================================");
    }

    public static void krypton() {
        System.out.println("===========================================");
        System.out.println("=\t WELCOME TO THE KRYPTON\t\t  =");
        System.out.println("=\t PLEASE ENJOY THE GAME\t\t  =");
        System.out.println("===========================================");
    }

    public static void end() {
        System.out.println("===========================================");
        System.out.println("=\t THANKYOU FOR PLAYING\t\t  =");
        System.out.println("===========================================");
    }

    public static void wrongPassword() {
        System.out.println("===========================================");
        System.out.println("=\t YOUR PASSWORD IS INCORRECT 3 TIMES\t  =");
        System.out.println("=\t PLEASE RESTART THE GAME\t  =");
        System.out.println("===========================================");
    }
}

import java.util.Scanner;

import interfaces.Phone;

public class App {
    public static void main(String[] args) throws Exception {
        Phone redmiNote10 = new Xiaomi();
        PhoneUser rizki = new PhoneUser(redmiNote10);

        rizki.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String action;
        boolean isLooping = true;

        while (isLooping) {
            System.out.println("===Aplikasi Interface===");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Perkecil Volume");
            System.out.println("0. Keluar");
            System.out.println("========================");
            action = input.next();

            switch (action) {
                case "1":
                    rizki.turnOnThePhone();
                    break;
                case "2":
                    rizki.turnOffThePhone();
                    break;
                case "3":
                    rizki.makePhoneLouder();
                    break;
                case "4":
                    rizki.makePhoneSilent();
                    break;
                case "0":
                    isLooping = false;
                    break;
                default:
                    System.out.println("Input tidak sesuai");
                    break;
            }
        }
    }
}

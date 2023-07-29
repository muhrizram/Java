import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        int guess, randNumber;
        boolean pass = false;

        Scanner input = new Scanner(System.in);

        randNumber = 1 + (int) (Math.random() * 10);

        System.out.println("Saya berpikir nomor dari 1 sampai 10");
        System.out.println("Kamu harus menebak selama 3 kali");
        System.out.println("Masukkan tebakan:");

        for (int i = 0; i < 3; i++) {
            guess = input.nextInt();
            if (guess == randNumber) {
                System.out.println("Ya, tebakan kamu benar\nNomor yang dimaksud adalah " + randNumber);
                pass = true;
                break;
            } else if (Math.abs(guess - randNumber) == 1) {
                System.out.println("Panas");
            } else if (Math.abs(guess - randNumber) == 2) {
                System.out.println("Hangat");
            } else {
                System.out.println("Dingin");
            }
        }

        if(pass == false){
            System.out.println("Tebakanmu salah\nNomor yang dimaksud adalah " + randNumber);
        }
    }
}
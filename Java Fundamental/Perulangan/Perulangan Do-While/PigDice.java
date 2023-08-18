import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        int totalHuman = 0;
        int totalComp = 0;
        int temporary = 0;
        int randNumber = 0;
        String choice = "lagi";
        boolean winner = false;

        Scanner input = new Scanner(System.in);

        while (winner != true) {
            System.out.println("Poin untuk komputer: " + totalComp);
            for (int i = 0; i < 3; i++) {
                randNumber = 1 + (int) (Math.random() * 6);
                System.out.println("    Computer mendapatkan dadu " + randNumber);
                totalComp += randNumber;
            }
            System.out.println("    Computer mengakhiri dengan poin: " + totalComp + "\n");
            System.out.println("Poin untuk pemain: " + totalHuman);
            do {
                randNumber = 1 + (int) (Math.random() * 6);
                System.out.println("    Kamu dapat " + randNumber);
                if (randNumber != 1) {
                    temporary += randNumber;
                    System.out.println("    Kamu mengumpulkan " + temporary + " poin");
                    System.out.print("  Ketik 'Lagi' untuk melanjutkan? ");
                    choice = input.nextLine();
                } else {
                    temporary = 0;
                }
            } while (choice.equalsIgnoreCase("lagi") && randNumber != 1);
            totalHuman += temporary;
            temporary = totalHuman;
            System.out.println("    Pemain mengakhiri dengan poin " + totalHuman + "\n");
            winner = (totalHuman >= 50 || totalComp >= 50);
        }

        if (totalComp >= 50) {
            System.out.println("Selamat komputer menang");
        } else {
            System.out.println("Selamat pemain menang");
        }
    }
}

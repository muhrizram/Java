import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {
        String name;
        int moneySpe    nt;
        double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Hitung uangmu!\n");

        System.out.println("Hei, siapa namamu?");
        name = input.nextLine();

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Senin?");
        moneySpent = input.nextInt();

        total = moneySpent;

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Selasa?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Rabu?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Kamis?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Jum'at?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Sabtu?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("Berapa banyak uang yang kamu habiskan di klub pada hari Minggu?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        average = (double) total / totalDay;

        System.out.println("Hai, " + name);
        System.out.println("Total pengeluaran di klub minggu ini: Rp." + total);
        System.out.println("Dengan rata-rata pengeluaran setiap harinya: Rp." + average);

    }
}
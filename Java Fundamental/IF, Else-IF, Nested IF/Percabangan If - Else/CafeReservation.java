import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {
        String name, gender, day;
        int age, money;
        double attract;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Reservasi Cafe");
        System.out.println("Masukkan nama Anda: ");
        name = input.next();
        System.out.println("Masukkan umur Anda: ");
        age = input.nextInt();
        System.out.println("Jenis Kelamin Anda (Pria/Wanita): ");
        gender = input.next();
        System.out.println("Seberapa menarik Anda (1/10): ");
        attract = input.nextDouble();
        System.out.println("Masukkan jumlah uang yang Anda punya: ");
        money = input.nextInt();
        System.out.println("Hari apa Anda ingin reservasi: ");
        day = input.next();

        System.out
                .println("Hai " + name + ", Terima kasih sudah menggunakan aplikasi kami. Untuk hasil reservasi Anda:");

        if (day.equalsIgnoreCase("Senin") && (age >= 20 && age <= 30) && money >= 500) {
            System.out.println("Anda bisa Reservasi Hari senin (Young Night)");
        } else if (day.equalsIgnoreCase("Selasa") && (age >= 31 && age <= 50) && money >= 250) {
            System.out.println("Anda bisa Reservasi Hari selasa (Oldest  Night)");
        } else if (day.equalsIgnoreCase("Rabu") && (age >= 20 && age <= 35) && gender.equalsIgnoreCase("Wanita")
                && attract >= 8 && money >= 300) {
            System.out.println("Anda bisa Reservasi Hari rabu (Ladies  Night)");
        } else if (day.equalsIgnoreCase("Kamis") && (age >= 20 && age <= 35)) {
            if ((gender.equalsIgnoreCase("Wanita") && attract >= 8 && money >= 300)
                    || gender.equalsIgnoreCase("Pria") && money >= 1000) {
                System.out.println("Anda bisa Reservasi Hari kamis (Party Night for Single)");
            } else {
                System.out.println("Anda tidak bisa reservasi di Hari kamis");
            }
        } else if (day.equalsIgnoreCase("Jumat")) {
            if ((gender.equalsIgnoreCase("Wanita") && (age >= 31 && age <= 45) && money >= 1000)
                    || (gender.equalsIgnoreCase("Pria    ") && (age >= 21 && age <= 25) && attract >= 8)) {
                System.out.println("Anda bisa Reservasi Hari jumat (Women Night)");
            } else {
                System.out.println("Anda tidak bisa Reservasi Hari jumat");
            }
        } else if ((day.equalsIgnoreCase("Sabtu") || day.equalsIgnoreCase("Minggu"))
                && ((age >= 18 && age <= 60) && money >= 100)) {
            System.out.println("Anda bisa Reservasi Hari weekend (Weekend Freedom)");
        } else {
            System.out.println("Anda tidak bisa melakukan Reservasi");
        }
    }
}
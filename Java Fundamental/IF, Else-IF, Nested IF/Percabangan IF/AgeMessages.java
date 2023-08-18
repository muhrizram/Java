import java.util.Scanner;

public class AgeMessages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Berapa umur kamu?");
        age = input.nextInt();

        System.out.println("Kamu dapat:");
        if (age >= 18) {
            System.out.println("Kamu dapat membuat Surat Izin Mengemudi (SIM)");
        }

        if (age >= 17) {
            System.out.println("Mendapatkan Kartu Tanda Penduduk (KTP)");

        }
        if (age > 25) {
            System.out.println("Masuk usia ideal menikah");
        }
    }
}
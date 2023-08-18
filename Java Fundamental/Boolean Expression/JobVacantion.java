import java.util.Scanner;

public class JobVacantion {
    public static void main(String[] args) {
        String name, graduate, gender;
        int age, exp;
        double appearance;
        boolean passingGradeKoordinator1, passingGradeKoordinator2, passingGradeAdmin1, passingGradeAdmin2;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        name = input.next();
        System.out.print("Umur: ");
        age = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita): ");
        gender = input.next();
        System.out.print("Lulusan (SMK/D3/S1): ");
        graduate = input.next();
        System.out.print("Pengalaman (Tahun): ");
        exp = input.nextInt();
        System.out.print("Penampilan (1/10): ");
        appearance = input.nextDouble();

        passingGradeKoordinator1 = (gender.equalsIgnoreCase("Pria") && (age >= 21 && age <= 30)
                && (graduate.equalsIgnoreCase("smk") || graduate.equals("d3")) && (exp >= 2));
        passingGradeKoordinator2 = (gender.equalsIgnoreCase("Pria") && (age > 30)
                && (graduate.equalsIgnoreCase("s1")) && (exp >= 5));

        passingGradeAdmin1 = (gender.equalsIgnoreCase("Wanita") && (age >= 20 && age <= 25)
                && (graduate.equalsIgnoreCase("d3")) && (appearance > 8.5) && (exp >= 1));
        passingGradeAdmin2 = (gender.equalsIgnoreCase("Wanita") && (age > 25)
                && (graduate.equalsIgnoreCase("s1")) && (appearance > 8.5) && (exp >= 5));

        System.out.println("");

        System.out.println(name + ", terima kasih sudah mengikuti lowongan pekerjaan di PT. Secret Semut.");
        System.out.println("Berikut Hasil Rekrutmen:");
        System.out.println(
                "Hasil Kelulusan untuk Koordinator: " + (passingGradeKoordinator1 || passingGradeKoordinator2));
        System.out.println("Hasil Kelulusan untuk Admin: " + (passingGradeAdmin1 || passingGradeAdmin2));

    }
}
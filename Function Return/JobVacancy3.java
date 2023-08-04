import java.util.Scanner;

public class JobVacancy3 {
    public static void main(String[] args) {
        String name, gender, graduate, position;
        int age, experience;
        double appearance;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di PT. Rizki Ramadhan Bercahaya");
        System.out.println("==============================================");
        System.out.println("Silahkan masukkan data diri Anda\n");
        System.out.print("Nama: ");
        name = input.nextLine();
        System.out.print("Umur: ");
        age = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita): ");
        gender = input.next();
        System.out.print("Lulusan (SMA/SMK/D3/S1): ");
        graduate = input.next();
        System.out.print("Pengalaman (Tahun): ");
        experience = input.nextInt();
        System.out.print("Penampilan (1/10): ");
        appearance = input.nextDouble();
        System.out.print("Posisi yang Dilamar (SPV/Admin/Koordinator): ");
        position = input.next();

        System.out.println("==============================================");
        System.out.println(name + ", Terima kasih sudah mengikuti lowongan kerja di PT. Rizki Ramadhan Bercahaya");
        if (position.equalsIgnoreCase("spv")) {
            spv(name, age, graduate, experience);
        } else if (position.equalsIgnoreCase("admin")) {
            admin(name, gender, age, graduate, experience, appearance);
        } else if (position.equalsIgnoreCase("koordinator")) {
            koordinator(name, gender, age, graduate, experience, appearance);
        } else {
            System.out.println("Masukkan salah satu input yang tersedia.");
        }

    }

    public static void spv(String name, int age, String graduate, int experience) {
        boolean spv1, spv2;
        spv1 = ((age >= 23 && age <= 30) && graduate.equalsIgnoreCase("s1") && experience > 1);
        spv2 = ((age >= 25 && age <= 35) && graduate.equalsIgnoreCase("d3") && experience > 4);

        if (spv1 == true || spv2 == true) {
            System.out.println("Selamat " + name + ", Anda memenuhi syarat sebagai SPV");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak memenuhi syarat sebagai SPV");
        }

    }

    public static void admin(String name, String gender, int age, String graduate, int experience, double appearance) {
        boolean admin1, admin2, admin3;
        admin1 = (gender.equalsIgnoreCase("wanita") && (age >= 20 && age <= 25)
                && graduate.equalsIgnoreCase("d3") && (appearance >= 8.5 || experience >= 1));
        admin2 = (gender.equalsIgnoreCase("wanita") && age > 25
                && graduate.equalsIgnoreCase("s1") && appearance >= 8.5 && experience >= 3);
        admin3 = (gender.equalsIgnoreCase("pria") && (age >= 20 && age <= 30)
                && (graduate.equalsIgnoreCase("d3") || graduate.equalsIgnoreCase("s1")) && appearance >= 8.5
                && experience >= 2);

        if (admin1 == true || admin2 == true || admin3 == true) {
            System.out.println("Selamat " + name + ", Anda memenuhi syarat sebagai Admin");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak memenuhi syarat sebagai Admin");
        }

    }

    public static void koordinator(String name, String gender, int age, String graduate, int experience,
            double appearance) {
        boolean koordinator1, koordinator2;
        koordinator1 = (gender.equalsIgnoreCase("pria") && (age >= 21 && age <= 30)
                && (graduate.equalsIgnoreCase("smk") || graduate.equalsIgnoreCase("d3"))
                && experience >= 2);
        koordinator2 = (gender.equalsIgnoreCase("pria") && age > 30
                && graduate.equalsIgnoreCase("s1") && experience >= 5);

        if (koordinator1 == true || koordinator2 == true) {
            System.out.println("Selamat " + name + ", Anda memenuhi syarat sebagai Koordinator");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak memenuhi syarat sebagai Koordinator");
        }

    }
}

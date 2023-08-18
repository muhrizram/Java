import java.util.Scanner;

public class PassingGrade79 {
    public static void main(String[] args) {
        double mtk, indo, inggris, ipa;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai matematika:");
        mtk = input.nextDouble();

        System.out.println("Masukkan nilai bahasa Indonesia:");
        indo = input.nextDouble();

        System.out.println("Masukkan nilai bahasa Inggris:");
        inggris = input.nextDouble();

        System.out.println("Masukkan nilai IPA:");
        ipa = input.nextDouble();

        System.out
                .println("Hasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di 79 adalah sebagai berikut:");
        System.out
                .println("Apakah anda memenuhi syarat untuk masuk ke 79: " + ((mtk + indo + inggris + ipa) / 4 >= 73));
        System.out
                .println("Apakah anda memenuhi syarat untuk masuk ke jurusan sastra: " + ((indo + inggris) / 2 >= 75));
        System.out
                .println("Apakah anda memenuhi syarat untuk masuk ke jurusan teknik komputer jaringan: " + (mtk > 80));
    }
}
import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        String name, gender, graduate, position, result;
        int age, experience;
        double appearance;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        name = input.nextLine();
        System.out.print("Umur: ");
        age = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita): ");
        gender = input.next();
        System.out.print("Lulusan (SMK/D3/S1): ");
        graduate = input.next();
        System.out.print("Pengalaman (Tahun): ");
        experience = input.nextInt();
        System.out.print("Penampilan (1/10): ");
        appearance = input.nextDouble();
        System.out.print("Posisi yang Dilamar (SPV/Admin/Koordinator): ");
        position = input.next();

        result = "";
        if (position.equalsIgnoreCase("koordinator")) {
            if (gender.equalsIgnoreCase("Pria")) {
                if (age >= 21 && age <= 30) {
                    if (graduate.equalsIgnoreCase("smk") || graduate.equalsIgnoreCase("d3")) {
                        if (experience >= 2) {
                            result = "Selamat, " + name
                                    + "\nAnda memenuhi syarat untuk sebagai Koordinator\nDan akan masuk ke Tahap Selanjutnya.";
                        } else {
                            result = "Tidak masuk kriteria pengalaman.";
                        }
                    } else {
                        result = "Tidak masuk kriteria lulusan.";
                    }
                } else if (age > 30) {
                    if (graduate.equalsIgnoreCase("s1")) {
                        if (experience >= 5) {
                            result = "Selamat, " + name
                                    + "\nAnda memenuhi syarat untuk sebagai Koordinator\nDan akan masuk ke Tahap Selanjutnya.";
                        }
                    } else {
                        result = "Tidak termasuk kriteria kelulusan.";
                    }
                } else {
                    result = "Tidak masuk kriteria umur.";
                }
            } else {
                result = "Wanita tidak bisa menjadi koordinator.";
            }
        } else if (position.equalsIgnoreCase("admin")) {
            if (gender.equalsIgnoreCase("wanita")) {
                if (age >= 20 && age <= 25) {
                    if (graduate.equalsIgnoreCase("d3")) {
                        if (appearance > 8 || experience >= 1) {
                            result = "Selamat, " + name
                                    + "\nAnda memenuhi syarat untuk sebagai Admin\nDan akan masuk ke Tahap Selanjutnya.";
                        }
                    } else {
                        result = "Tidak termasuk kategori lulusan.";
                    }
                } else if (age > 25) {
                    if (graduate.equalsIgnoreCase("s1")) {
                        if (appearance >= 8) {
                            if (experience >= 3) {
                                result = "Selamat, " + name
                                        + "\nAnda memenuhi syarat untuk sebagai Admin\nDan akan masuk ke Tahap Selanjutnya.";
                            } else {
                                result = "Tidak termasuk kategori pengalaman.";
                            }
                        } else {
                            result = "Tidak termasuk kategori penampilan menarik.";
                        }
                    } else {
                        result = "Tidak termasuk kategori lulusan.";
                    }
                } else {
                    result = "Tidak masuk kategori umur.";
                }
            } else {
                if (age >= 20 && age <= 30) {
                    if (appearance >= 8) {
                        if (graduate.equalsIgnoreCase("d3") || graduate.equalsIgnoreCase("s1")) {
                            if (experience >= 2) {
                                result = "Selamat, " + name
                                        + "\nAnda memenuhi syarat untuk sebagai Admin\nDan akan masuk ke Tahap Selanjutnya.";
                            } else {
                                result = "Tidak termasuk kategori pengalaman.";
                            }
                        }
                    } else {
                        result = "Tidak termasuk kategori menarik.";
                    }
                } else {
                    result = "Tidak masuk kriteria umur.";
                }
            }
        } else if (position.equalsIgnoreCase("spv")) {
            if (age >= 23 && age <= 30) {
                if (graduate.equalsIgnoreCase("s1")) {
                    if (experience > 1) {
                        result = "Selamat, " + name
                                + "\nAnda memenuhi syarat untuk sebagai SPV\nDan akan masuk ke Tahap Selanjutnya.";
                    } else {
                        result = "Tidak termasuk kategori pengalaman.";
                    }
                } else {
                    result = "Tidak termasuk kategori lulusan.";
                }
            } else if (age >= 25 && age <= 35) {
                if (graduate.equalsIgnoreCase("d3")) {
                    if (experience > 4) {
                        result = "Selamat, " + name
                                + "\nAnda memenuhi syarat untuk sebagai SPV\nDan akan masuk ke Tahap Selanjutnya.";
                    } else {
                        result = "Tidak termasuk kategori pengalaman.";
                    }
                } else {
                    result = "Tidak termasuk kategori lulusan.";
                }
            } else {
                result = "Tidak termasuk kategori umur.";
            }
        } else {
            result = "Input tidak sesuai";
        }

        System.out.println(name + " terima kasih sudah mengikuti lowongan kerja di PT. Secret Semut");
        System.out.println("Berikut Hasil dari Rekrutmen:");
        System.out.println(result);

    }
}
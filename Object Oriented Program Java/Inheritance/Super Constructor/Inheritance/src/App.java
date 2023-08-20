public class App {
    public static void main(String[] args) throws Exception {
        // Objek 1 tanpa parameter
        Doctor doctor1 = new Doctor();
        doctor1.name = "Alex";
        doctor1.address = "Medan";
        doctor1.specialist = "Gigi";

        // Objek dengan parameter
        Doctor doctor2 = new Doctor("Rizki", "Bandung", "Jantung");

        doctor1.greeting();
        System.out.println();
        doctor2.greeting();
    }
}

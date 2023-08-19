public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Rizki", "Bandung");

        Teacher teacher = new Teacher();
        teacher.name = "Onno";
        teacher.address = "Jakarta";
        teacher.subject = "Hacking";

        Doctor doctor = new Doctor();
        doctor.name = "Yislam";
        doctor.address = "Bekasi";
        doctor.specialist = "Cardiology";

        Programmer programmer = new Programmer();
        programmer.name = "Sandhika";
        programmer.address = "UNPAS";
        programmer.technology = "Laravel";

        person.greeting();
        teacher.greeting();
        doctor.greeting();
        programmer.greeting();
    }
}

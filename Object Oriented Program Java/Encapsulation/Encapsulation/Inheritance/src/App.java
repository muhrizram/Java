import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("Rizki");
        person.setAddress("Bandung");
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }

    static void sayHello(Person person) {
        String message;
        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
        } else {
            message = "Hello, " + person.getName() + ".";
        }
        System.out.println(message);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Programmer("Rizki", "Padang", "Golang");
        Person person2 = new Doctor("Jilan", "Mekarsari", "Jantung");
        Person person3 = new Teacher("Dhafa", "Sukapura", "Bahasa Indonesia");
        Person person4 = new Person("Kautsar", "Ujungberung");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
        sayHello(person4);

    }

    static void sayHello(Person person) {
        String message;
        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hello, " + programmer.name + ". Seorang Programmer " + programmer.technology + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, " + doctor.name + ". Seorang Dokter " + doctor.specialist + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
        } else {
            message = "Hello, " + person.name + ".";
        }
        System.out.println(message);
    }
}

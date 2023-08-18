public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.name = "Rizki";
        person.address = "Bandung";

        person.sayHello("Rizki");
        System.out.println(person.sayAddress());

    }
}

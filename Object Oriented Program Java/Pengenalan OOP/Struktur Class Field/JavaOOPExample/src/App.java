public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.name = "Rizki";
        person.address = "Bandung";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}

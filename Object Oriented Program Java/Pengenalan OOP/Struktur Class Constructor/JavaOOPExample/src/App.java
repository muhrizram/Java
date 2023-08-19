public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.name = "Rizki";
        person.address = "Bandung";
        person.sayHello("Rizki");
        System.out.println(person.sayAddress());

        // Membuat object dari class Person menggunakan Constructor berparameter
        Person person2 = new Person("Iis", "Jakarta");
        person2.sayHello("Karwati");
        System.out.println(person2.sayAddress());

        // Membuat object dari class Person menggunakan Constructor 1 parameter
        // (Constructor Overloading)
        Person person3 = new Person("Andy");
        person3.address = "Surabaya";
        person3.sayHello("Marwandy");
        System.out.println(person3.sayAddress());
    }
}

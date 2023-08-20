public class Programmer extends Person {
    String technology;

    void hacking() {
        System.out.println("I can hack any website");
    }

    void coding() {
        System.out.println("I can create an application using: " + technology + ".");
    }

    void greeting() {
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
        System.out.println("My job is a " + technology + " programmer.");
    }
}

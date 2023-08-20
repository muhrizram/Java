public class Doctor extends Person {
    String specialist;

    void surgery() {
        System.out.println("I can do a surgery on a Patients.");
    }

    void greeting() {
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}

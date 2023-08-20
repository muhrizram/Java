public class Teacher extends Person {
    String subject;

    void teaching() {
        System.out.println("I can teach " + subject + ". So anyone want to be taught?");
    }

    void greeting() {
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
        System.out.println("My job is a " + subject + " teacher.");
    }
}

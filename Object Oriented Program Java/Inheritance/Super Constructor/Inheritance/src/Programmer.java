public class Programmer extends Person {
    String technology;

    public Programmer() {
        super();
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    void hacking() {
        System.out.println("I can hack any website");
    }

    void coding() {
        System.out.println("I can create an application using: " + technology + ".");
    }

    void greeting() {
        super.greeting(); // Memanggil Method greeting() dari Parent atau Person Class
        System.out.println("My job is a " + technology + " programmer.");
    }
}

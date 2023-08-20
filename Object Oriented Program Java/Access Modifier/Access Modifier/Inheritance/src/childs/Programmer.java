package childs;

import parents.Person;

public class Programmer extends Person {
    public String technology;

    public Programmer() {
        super();
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public void hacking() {
        System.out.println("I can hack any website");
    }

    public void coding() {
        System.out.println("I can create an application using: " + technology + ".");
    }

    public void greeting() {
        super.greeting(); // Memanggil Method greeting() dari Parent atau Person Class
        System.out.println("My job is a " + technology + " programmer.");
    }
}

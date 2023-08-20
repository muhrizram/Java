package childs;

import parents.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
        super();
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    void teaching() {
        System.out.println("I can teach " + subject + ". So anyone want to be taught?");
    }

    public void greeting() {
        System.out.println("Hello my name is " + getName() + ".");
        System.out.println("I come from " + getAddress() + ".");
        System.out.println("My job is a " + subject + " teacher.");
    }

    // getterStringSubject
    public String getSubject() {
        return this.subject;
    }

    // setterStringSubject
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

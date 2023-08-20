package parents;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Person() {
        super();
    }

    public void greeting() {
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }

    // getterStringName
    public String getName() {
        return this.name;
    }

    // setterStringName
    public void setName(String name) {
        this.name = name;
    }

    // getterStringAddress
    public String getAddress() {
        return this.address;
    }

    // setterStringAddress
    public void setAddress(String address) {
        this.address = address;
    }
}

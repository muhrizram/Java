public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor Default
    Person() {

    }

    // Constructor dengan 1 Parameter (Constructor Overloading)
    Person(String paramName) {
        name = paramName;
    }

    // Constructor dengan Parameter
    Person(String paramName, String paramAddress) {
        this(paramName);
        address = paramAddress;
    }

    // Method Void
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name + ".");
    }

    // Method return value (Mengembalikan Nilai)
    String sayAddress() {
        return "I come from " + address + ".";
    }
}

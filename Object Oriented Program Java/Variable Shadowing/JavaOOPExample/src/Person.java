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
    Person(String name, String address) {
        // Gunakan keyword this untuk solving variable shadowing.

        this.name = name; // this.name ini menunjukkan field name dari class Person itu sendiri
        this.address = address; // this.address ini menunjukkan field address dari class Person itu sendiri
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

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name + ".");
    }

    String sayAddress() {
        return "I come from " + address + ".";
    }
}

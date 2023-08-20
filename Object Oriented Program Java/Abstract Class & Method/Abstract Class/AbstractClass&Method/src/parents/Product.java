package parents;

public abstract class Product {
    private String name;

    public Product() {
        super();
    }

    public Product(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Abstract Method
    public abstract void printInformation();
}
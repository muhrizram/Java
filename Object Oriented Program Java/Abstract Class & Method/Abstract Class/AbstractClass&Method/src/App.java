import childs.Item;
import parents.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Item("Susu", 100);
        product.printInformation();
    }
}

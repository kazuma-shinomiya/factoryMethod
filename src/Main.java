import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Kazu");
        Product card2 = factory.create("Ryo");
        card1.use();
        card2.use();
    }
}

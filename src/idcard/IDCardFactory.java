package idcard;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
    private int id = 0;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, id++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("register" + product);
    }
}

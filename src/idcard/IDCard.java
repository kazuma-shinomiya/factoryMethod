package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;

    //修飾子をつけないとパッケージ外から呼び出せなくなるため、インスタンス化する際に必ずFactoryが使われるようになる
    IDCard(String owner) {
        System.out.println(owner + "'s card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use" + this);
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}

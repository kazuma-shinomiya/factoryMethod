package idcard;

import framework.Product;

public class IDCard extends Product {
    private int id;
    private String owner;

    //修飾子をつけないとパッケージ外から呼び出せなくなるため、インスタンス化する際に必ずFactoryが使われるようになる
    IDCard(String owner, int id) {
        System.out.println(owner + "'s card is" + id);
        this.owner = owner;
        this.id = id;
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

    public int getId() {
        return id;
    }
}

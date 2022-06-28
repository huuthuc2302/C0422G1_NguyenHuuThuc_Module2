package ss17.bai_tap_1.model;

import java.io.Serializable;

public class Products {
    private String code;
    private String name;
    private String produce;
    private int price;

    public Products(String code, String name, String produce, int price) {
        this.code = code;
        this.name = name;
        this.produce = produce;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + produce + "\t" + price;
    }
}

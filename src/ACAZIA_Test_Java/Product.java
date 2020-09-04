/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACAZIA_Test_Java;

/**
 *
 * @author Asus
 */
public class Product extends Category {

    private String name;
    private String categoryTag;
    private double price;

    public Product() {
        super();
    }

    public Product(String name, String categoryTag, double price) {
        super();
        this.name = name;
        this.categoryTag = categoryTag;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm" + this.name + "Thể loại" + this.categoryTag + ", giá: " + this.price;
    }
}

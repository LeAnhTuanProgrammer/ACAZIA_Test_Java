/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACAZIA_Test_Java;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        // dữ liệu cứng
        Category category1 = new Category("may tinh", "mt");
        Category category2 = new Category("dien lanh", "dl");

        Product product1 = new Product("may tinh xach tay A", "mt", 12.0);
        Product product2 = new Product("laptop X", "mt", 13.0);
        Product product3 = new Product("pc 2", "mt", 13.0);
        Product product4 = new Product("ultrabook EZ", "mt", 16.0);
        Product product5 = new Product("tu lanh e", "dl", 11.5);
        Product product6 = new Product("dieu hoa nhiet do b", "dl", 12.5);
        //list để lưu dữ liệu
        ArrayList<Category> arrCategory = new ArrayList<>();
        ArrayList<Product> arrProduct = new ArrayList<>();
        // add dữ liệu vào list
        arrCategory.add(category1);
        arrCategory.add(category2);

        arrProduct.add(product1);
        arrProduct.add(product2);
        arrProduct.add(product3);
        arrProduct.add(product4);
        arrProduct.add(product5);
        arrProduct.add(product6);

        System.out.println("-----Thông tin thể loại-----");
        for (int i = 0; i < arrCategory.size(); i++) {
            System.out.println(arrCategory.get(i).toString());
        }

        System.out.println("-----Thông tin sản phẩm-----");
        for (int i = 0; i < arrProduct.size(); i++) {
            System.out.println(arrProduct.get(i).toString());
        }

        System.out.println("---Các sách sản phẩm của thể loại mt---");
        for (int i = 0; i < arrProduct.size(); i++) {
            if (arrProduct.get(i).getCategoryTag().equalsIgnoreCase("mt")) {
                System.out.println(arrProduct.get(i).toString());
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACAZIA_Test_Java;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Category {

    private String name;
    private String tag;

    public Category() {
        super();
    }

    public Category(String name, String tag) {
        super();
        this.name = name;
        this.tag = tag;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Tên loại: " + this.name + ", thể loại: " + this.tag;
    }

}

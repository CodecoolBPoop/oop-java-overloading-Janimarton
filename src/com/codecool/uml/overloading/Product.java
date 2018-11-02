package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.List;

public class Product {

    private static int idCounter = 0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private List<Product> productList;

    private int idIncreaseBy1(int id){
        idCounter++;
        id = idCounter;
        return id;
    }


    public Product() {
        this.id = idIncreaseBy1(id);

    }

    public int getId(){
        return this.id;
    }

}

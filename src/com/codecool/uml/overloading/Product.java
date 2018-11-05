package com.codecool.uml.overloading;

import java.util.*;

public class Product {

    private static int idCounter = 0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    private int idIncreaseBy1(int id) {
        idCounter++;
        id = idCounter;
        return id;
    }


    public Product() {
        this.id = idIncreaseBy1(id);
        productList.add(this);

    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = idIncreaseBy1(id);
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return this.defaultPrice;
    }


    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> toReturn = new ArrayList<>();
        for (Product product :
                productList) {
            if (product.productCategory.equals(productCategory)) {
                toReturn.add(product);
            }

        }
        return toReturn;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> toReturn = new ArrayList<>();
        for (Product product: productList){
            if (product.supplier.equals(supplier)){
                toReturn.add(product);
            }
        }
        return toReturn;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultPrice=" + defaultPrice +
                ", defaultCurrency=" + defaultCurrency +
                ", productCategory=" + productCategory +
                ", supplier=" + supplier +
                ", productList=" + productList +
                '}';
    }
}

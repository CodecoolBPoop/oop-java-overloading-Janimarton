package com.codecool.uml.overloading;

public class Webshop {

    public static void main(String[] args) {
	// write your code here
        System.out.println("It's working");
        Product testProduct = new Product();
        System.out.println("The testProducts id: "+testProduct.getId());
        Product testProduct2 = new Product();
        System.out.println("The testProducts id: "+testProduct2.getId());
        Product testProduct3 = new Product();
        System.out.println("The testProducts id: "+testProduct3.getId());
        Product testProduct4 = new Product();
        System.out.println("The testProducts id: "+testProduct4.getId());

    }
}

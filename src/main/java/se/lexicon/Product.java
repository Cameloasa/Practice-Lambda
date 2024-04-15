package se.lexicon;


import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double price;
    private int stock;


    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        List<Product> vegetable = new ArrayList<>();
    }
}



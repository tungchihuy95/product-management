package model;

public class Products implements Comparable<Products>{
    private int id;
    private String name;
    private int price;

    public Products() {
    }

    public Products (int id, String name, int  price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int  price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Products o) {
        if (o.getPrice() > this.getPrice()){
            return -1;
        } else if (o.getPrice() == this.getPrice()){
            return 0;
        }
        else
            return 1;
    }
}

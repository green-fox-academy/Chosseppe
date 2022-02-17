package com.greenfoxaccademy.simpleweb.models;

public class ShopItem {

    private String name;
    private String description;
    private float price;
    private int quantityOfStock;

    public ShopItem(String inputName, Integer inputPrice, Integer inputQuantity, String inputDescription){
        this.name = inputName;
        this.description = inputDescription;
        this.price = inputPrice;
        this.quantityOfStock = inputQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(Integer quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }
}


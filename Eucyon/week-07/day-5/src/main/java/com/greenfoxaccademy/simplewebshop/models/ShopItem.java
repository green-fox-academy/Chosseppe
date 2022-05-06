package com.greenfoxaccademy.simplewebshop.models;

import lombok.Data;

@Data
public class ShopItem {

    private String name;
    private String description;
    private float price;
    private int quantityOfStock;

    public ShopItem(String inputName, Integer inputPrice, Integer inputQuantity, String inputDescription) {
        this.name = inputName;
        this.description = inputDescription;
        this.price = inputPrice;
        this.quantityOfStock = inputQuantity;
    }

}
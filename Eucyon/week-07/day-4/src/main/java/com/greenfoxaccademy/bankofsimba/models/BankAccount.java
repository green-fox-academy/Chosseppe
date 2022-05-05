package com.greenfoxaccademy.bankofsimba.models;

public class BankAccount {

    String name;
    Double balance;
    String animalType;

    public BankAccount(String animalType, String name, Double balance){
        this.animalType = animalType;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}

package com.vitalmix.model.weapons;

public abstract class Weapon {

    private int id;
    private String model;
    public int damage;
    private int fireRate;
    private String description;

    public Weapon(String model, int damage, int fireRate, String description) {
        this.model = model;
        this.damage = damage;
        this.fireRate = fireRate;
        this.description = description;
    }

    public Weapon(int id, String model, int damage, int fireRate, String description) {
        this.id = id;
        this.model = model;
        this.damage = damage;
        this.fireRate = fireRate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

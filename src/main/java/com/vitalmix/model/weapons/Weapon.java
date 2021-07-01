package com.vitalmix.model.weapons;

import com.vitalmix.model.Starship;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "model")
    private String model;

    @Column(name = "damage")
    public int damage;

    @Column(name = "fire_rate")
    private int fireRate;

    @Column(name = "descr")
    private String description; 

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "starship_id")
   /* @JoinTable(
            name = "starship",
            joinColumns = @JoinColumn(name = "starshipId", referencedColumnName = "starship_id")
    )*/
    private Starship starship;

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

package com.vitalmix.model.weapons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rocket_launcher")
public class RocketsLauncher extends Weapon{

    @Column(name = "homing")
    private boolean homing;

    private static final String type = "Rockets Launcher";

    public RocketsLauncher() {

    }

    public RocketsLauncher(String model, int damage, int ammoPerShot, int fireRate, String description, boolean homing) {
        super(model, damage, ammoPerShot, fireRate, description);
        this.homing = homing;
    }

    public RocketsLauncher(int id, String model, int damage, int ammoPerShot, int fireRate, String description, boolean homing) {
        super(id, model, damage, ammoPerShot, fireRate, description);
        this.homing = homing;
    }

    public boolean isHoming() {
        return homing;
    }

    public void setHoming(boolean homing) {
        this.homing = homing;
    }

    public static String getType() {
        return type;
    }
}

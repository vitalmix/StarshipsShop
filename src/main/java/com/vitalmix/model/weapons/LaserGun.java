package com.vitalmix.model.weapons;

public class LaserGun extends Weapon {

    private int energyPerShot;
    private static final String type = "Laser Gun";

    public LaserGun(String model, int damage, int fireRate, String description, int energyPerShot) {
        super(model, damage, fireRate, description);
        this.energyPerShot = energyPerShot;
    }

    public LaserGun(int id, String model, int damage, int fireRate, String description, int energyPerShot) {
        super(id, model, damage, fireRate, description);
        this.energyPerShot = energyPerShot;
    }

    public int getEnergyPerShot() {
        return energyPerShot;
    }

    public void setEnergyPerShot(int energyPerShot) {
        this.energyPerShot = energyPerShot;
    }

    public static String getType() {
        return type;
    }
}

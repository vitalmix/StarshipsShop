package com.vitalmix.model.weapons;

public class MachineGun extends Weapon {

    private int ammoPerShot;
    private static final String type = "Machine Gun";

    public MachineGun(String model, int damage, int fireRate, String description, int ammoPerShot) {
        super(model, damage, fireRate, description);
        this.ammoPerShot = ammoPerShot;
    }

    public MachineGun(int id, String model, int damage, int fireRate, String description, int ammoPerShot) {
        super(id, model, damage, fireRate, description);
        this.ammoPerShot = ammoPerShot;
    }

    public int getAmmoPerShot() {
        return ammoPerShot;
    }

    public void setAmmoPerShot(int ammoPerShot) {
        this.ammoPerShot = ammoPerShot;
    }

    public static String getType() {
        return type;
    }
}

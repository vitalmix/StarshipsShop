package com.vitalmix.model.weapons;

public class RocketsLauncher extends Weapon{

    private boolean homing;
    private static final String type = "Rockets Launcher";

    public RocketsLauncher(String model, int damage, int fireRate, String description, boolean homing) {
        super(model, damage, fireRate, description);
        this.homing = homing;
    }

    public RocketsLauncher(int id, String model, int damage, int fireRate, String description, boolean homing) {
        super(id, model, damage, fireRate, description);
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

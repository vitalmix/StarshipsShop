package com.vitalmix.model.weapons;

public class RocketsLauncher extends Weapon{

    private int rocketPerShot;
    private static final String type = "Rockets Launcher";

    public RocketsLauncher(String model, int damage, int fireRate, String description, int rocketPerShot) {
        super(model, damage, fireRate, description);
        this.rocketPerShot = rocketPerShot;
    }

    public RocketsLauncher(int id, String model, int damage, int fireRate, String description, int rocketPerShot) {
        super(id, model, damage, fireRate, description);
        this.rocketPerShot = rocketPerShot;
    }

    public int getRocketPerShot() {
        return rocketPerShot;
    }

    public void setRocketPerShot(int rocketPerShot) {
        this.rocketPerShot = rocketPerShot;
    }

    public static String getType() {
        return type;
    }
}

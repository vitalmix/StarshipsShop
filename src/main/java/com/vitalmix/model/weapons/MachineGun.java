package com.vitalmix.model.weapons;

public class MachineGun extends Weapon {

    private int numOfTrunks;
    private String caliber;
    private static final String type = "Machine Gun";

    public MachineGun(String model, int damage, int fireRate, String description, int numOfTrunks, String caliber) {
        super(model, damage, fireRate, description);
        this.numOfTrunks = numOfTrunks;
        this.caliber = caliber;
    }

    public MachineGun(int id, String model, int damage, int fireRate, String description, int numOfTrunks, String caliber) {
        super(id, model, damage, fireRate, description);
        this.numOfTrunks = numOfTrunks;
        this.caliber = caliber;
    }

    public int getNumOfTrunks() {
        return numOfTrunks;
    }

    public void setNumOfTrunks(int numOfTrunks) {
        this.numOfTrunks = numOfTrunks;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public static String getType() {
        return type;
    }
}

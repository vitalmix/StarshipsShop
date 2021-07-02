package com.vitalmix.model.weapons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "machine_gun")
public class MachineGun extends Weapon {

    @Column(name = "num_of_trunks")
    private int numOfTrunks;

    @Column(name = "caliber")
    private String caliber;

    private static final String type = "Machine Gun";

    public MachineGun() {
    }

    public MachineGun(String model, int damage, int ammoPerShot, int fireRate, String description, int numOfTrunks, String caliber) {
        super(model, damage, ammoPerShot, fireRate, description);
        this.numOfTrunks = numOfTrunks;
        this.caliber = caliber;
    }

    public MachineGun(int id, String model, int damage, int ammoPerShot, int fireRate, String description, int numOfTrunks, String caliber) {
        super(id, model, damage, ammoPerShot, fireRate, description);
        this.numOfTrunks = numOfTrunks;
        this.caliber = caliber;
    }

    public int getNumOfTrunks() {
        return numOfTrunks;
    }

    public void setNumOfTrunks(int numOfTrunks) {
        this.numOfTrunks = numOfTrunks;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public static String getType() {
        return type;
    }
}

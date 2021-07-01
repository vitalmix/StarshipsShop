package com.vitalmix.model.weapons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "laser_gun")
public class LaserGun extends Weapon {

    @Column(name = "emp_modification")
    private boolean empModification;
    private static final String type = "Laser Gun";

    public LaserGun(String model, int damage, int fireRate, String description, boolean empModification) {
        super(model, damage, fireRate, description);
        this.empModification = empModification;
    }

    public LaserGun(int id, String model, int damage, int fireRate, String description, boolean empModification) {
        super(id, model, damage, fireRate, description);
        this.empModification = empModification;
    }

    public boolean isEmpModification() {
        return empModification;
    }

    public void setEmpModification(boolean empModification) {
        this.empModification = empModification;
    }

    public static String getType() {
        return type;
    }
}

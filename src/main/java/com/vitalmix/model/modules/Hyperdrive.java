package com.vitalmix.model.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hyperdrive")
public class Hyperdrive extends Module {

    @Column(name = "energy_per_hyperdrive_jump")
    private int energyPerHyperdriveJump;

    private static final String type = "Hyperdrive";

    public Hyperdrive() {

    }

    public Hyperdrive(String type, String description, int energyPerHyperdriveJump) {
        super(description);
        this.energyPerHyperdriveJump = energyPerHyperdriveJump;
    }

    public Hyperdrive(int id, String type, String description, int energyPerHyperdriveJump) {
        super(id, description);
        this.energyPerHyperdriveJump = energyPerHyperdriveJump;
    }

    public int getEnergyPerHyperdriveJump() {
        return energyPerHyperdriveJump;
    }

    public void setEnergyPerHyperdriveJump(int energyPerHyperdriveJump) {
        this.energyPerHyperdriveJump = energyPerHyperdriveJump;
    }

    public static String getType() {
        return type;
    }
}

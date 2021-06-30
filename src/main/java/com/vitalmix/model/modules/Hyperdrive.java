package com.vitalmix.model.modules;

public class Hyperdrive extends Module {

    private int energyPerHyperdriveJump;

    public Hyperdrive(String type, String description, int energyPerHyperdriveJump) {
        super(type, description);
        this.energyPerHyperdriveJump = energyPerHyperdriveJump;
    }

    public Hyperdrive(int id, String type, String description, int energyPerHyperdriveJump) {
        super(id, type, description);
        this.energyPerHyperdriveJump = energyPerHyperdriveJump;
    }

    public int getEnergyPerHyperdriveJump() {
        return energyPerHyperdriveJump;
    }

    public void setEnergyPerHyperdriveJump(int energyPerHyperdriveJump) {
        this.energyPerHyperdriveJump = energyPerHyperdriveJump;
    }
}

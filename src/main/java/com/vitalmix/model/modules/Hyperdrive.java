package com.vitalmix.model.modules;

public class Hyperdrive extends Module {

    private int energyPerHyperdriveJump;
    private static final String type = "Hyperdrive";

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

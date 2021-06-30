package com.vitalmix.model.modules;

public class EnergyShield extends Module{

    private int energyPerDamage;
    private int regenerationPerSecond;

    public EnergyShield(String type, String description, int energyPerDamage, int regenerationPerSecond) {
        super(type, description);
        this.energyPerDamage = energyPerDamage;
        this.regenerationPerSecond = regenerationPerSecond;
    }

    public EnergyShield(int id, String type, String description, int energyPerDamage, int regenerationPerSecond) {
        super(id, type, description);
        this.energyPerDamage = energyPerDamage;
        this.regenerationPerSecond = regenerationPerSecond;
    }

    public int getEnergyPerDamage() {
        return energyPerDamage;
    }

    public void setEnergyPerDamage(int energyPerDamage) {
        this.energyPerDamage = energyPerDamage;
    }

    public int getRegenerationPerSecond() {
        return regenerationPerSecond;
    }

    public void setRegenerationPerSecond(int regenerationPerSecond) {
        this.regenerationPerSecond = regenerationPerSecond;
    }
}

package com.vitalmix.model.modules;

public class EnergyShield extends Module{

    private int damageReduction;
    private int regenerationPerSecond;
    private int durability;

    public EnergyShield(String type, String description, int damageReduction, int regenerationPerSecond, int durability) {
        super(type, description);
        this.damageReduction = damageReduction;
        this.regenerationPerSecond = regenerationPerSecond;
        this.durability = durability;
    }

    public EnergyShield(int id, String type, String description, int damageReduction, int regenerationPerSecond, int durability) {
        super(id, type, description);
        this.damageReduction = damageReduction;
        this.regenerationPerSecond = regenerationPerSecond;
        this.durability = durability;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getRegenerationPerSecond() {
        return regenerationPerSecond;
    }

    public void setRegenerationPerSecond(int regenerationPerSecond) {
        this.regenerationPerSecond = regenerationPerSecond;
    }
}

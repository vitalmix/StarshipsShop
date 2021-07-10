package com.vitalmix.model.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "energy_shield")
public class EnergyShield extends Module{

    @Column(name = "damage_reduction")
    private int damageReduction;

    @Column(name = "regeneration_per_second")
    private int regenerationPerSecond;

    @Column(name = "durability")
    private int durability;

    private static final String type = "Energy Shield";

    public EnergyShield() {

    }

    public EnergyShield(String type, String description, int damageReduction, int regenerationPerSecond, int durability) {
        super(description);
        this.damageReduction = damageReduction;
        this.regenerationPerSecond = regenerationPerSecond;
        this.durability = durability;
    }

    public EnergyShield(int id, String type, String description, int damageReduction, int regenerationPerSecond, int durability) {
        super(id, description);
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

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public static String getType() {
        return type;
    }
}

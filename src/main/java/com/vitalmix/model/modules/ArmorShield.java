package com.vitalmix.model.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "armor_shield")
public class ArmorShield extends Module {

    @Column(name = "damage_reduction")
    private int damageReduction;

    @Column(name = "durability")
    private int durability;

    private static final String type = "Armor Shield";

    public ArmorShield() {

    }

    public ArmorShield(String model, String description, int damageReduction, int durability) {
        super(model, description);
        this.damageReduction = damageReduction;
        this.durability = durability;
    }

    public ArmorShield(int id, String model, String description, int damageReduction, int durability) {
        super(id, model, description);
        this.damageReduction = damageReduction;
        this.durability = durability;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
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

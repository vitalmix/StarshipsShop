package com.vitalmix.model.modules;

public class ArmorShield extends Module {

    private int damageReduction;
    private int durability;

    public ArmorShield(String type, String description, int damageReduction, int durability) {
        super(description);
        this.damageReduction = damageReduction;
        this.durability = durability;
    }

    public ArmorShield(int id, String type, String description, int damageReduction, int durability) {
        super(id, description);
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
}

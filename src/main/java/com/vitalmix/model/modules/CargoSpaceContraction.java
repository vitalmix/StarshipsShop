package com.vitalmix.model.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cargo_space_contraction")
public class CargoSpaceContraction extends Module{

    @Column(name = "contraction_efficiency")
    int contractionEfficiency;

    private static final String type = "Cargo compression";

    public CargoSpaceContraction() {

    }

    public CargoSpaceContraction(String model, String description, int contractionEfficiency) {
        super(model, description);
        this.contractionEfficiency = contractionEfficiency;
    }

    public CargoSpaceContraction(int id, String model, String description, int contractionEfficiency) {
        super(id, model, description);
        this.contractionEfficiency = contractionEfficiency;
    }

    public int getContractionEfficiency() {
        return contractionEfficiency;
    }

    public void setContractionEfficiency(int contractionEfficiency) {
        this.contractionEfficiency = contractionEfficiency;
    }

    public static String getType() {
        return type;
    }

}

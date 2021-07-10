package com.vitalmix.model.modules;

public class CargoSpaceContraction extends Module{

    int contractionEfficiency;
    private static final String type = "Cargo compression";

    public CargoSpaceContraction(String type, String description, int contractionEfficiency) {
        super(description);
        this.contractionEfficiency = contractionEfficiency;
    }

    public CargoSpaceContraction(int id, String type, String description, int contractionEfficiency) {
        super(id, description);
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

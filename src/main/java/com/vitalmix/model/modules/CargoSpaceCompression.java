package com.vitalmix.model.modules;

public class CargoSpaceCompression extends Module{

    int compressionEfficiency;

    public CargoSpaceCompression(String type, String description, int compressionEfficiency) {
        super(description);
        this.compressionEfficiency = compressionEfficiency;
    }

    public CargoSpaceCompression(int id, String type, String description, int compressionEfficiency) {
        super(id, description);
        this.compressionEfficiency = compressionEfficiency;
    }

    public int getCompressionEfficiency() {
        return compressionEfficiency;
    }

    public void setCompressionEfficiency(int compressionEfficiency) {
        this.compressionEfficiency = compressionEfficiency;
    }
}

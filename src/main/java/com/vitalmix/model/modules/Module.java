package com.vitalmix.model.modules;

public abstract class Module {

    int id;
    String type;
    private String description;

    public Module(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public Module(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

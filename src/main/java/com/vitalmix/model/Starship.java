package com.vitalmix.model;

import com.vitalmix.model.weapon.Weapon;

public class Starship {

    private int id;
    private String model;
    private Weapon[] weapons;
    private Module[] modules;
    private int numOfPassengers;
    private boolean passengerEmergencyRescueSystem;
    private int numOfcCargo;
    private boolean cargoEmergencyRescueSystem;

    public Starship() {

    }

    public Starship(String model, Weapon[] weapons, Module[] modules, int numOfPassengers, boolean passengerEmergencyRescueSystem, int numOfcCargo, boolean cargoEmergencyRescueSystem) {
        this.model = model;
        this.weapons = weapons;
        this.modules = modules;
        this.numOfPassengers = numOfPassengers;
        this.passengerEmergencyRescueSystem = passengerEmergencyRescueSystem;
        this.numOfcCargo = numOfcCargo;
        this.cargoEmergencyRescueSystem = cargoEmergencyRescueSystem;
    }

    public Starship(int id, String model, Weapon[] weapons, Module[] modules, int numOfPassengers, boolean passengerEmergencyRescueSystem, int numOfcCargo, boolean cargoEmergencyRescueSystem) {
        this.id = id;
        this.model = model;
        this.weapons = weapons;
        this.modules = modules;
        this.numOfPassengers = numOfPassengers;
        this.passengerEmergencyRescueSystem = passengerEmergencyRescueSystem;
        this.numOfcCargo = numOfcCargo;
        this.cargoEmergencyRescueSystem = cargoEmergencyRescueSystem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public boolean isPassengerEmergencyRescueSystem() {
        return passengerEmergencyRescueSystem;
    }

    public void setPassengerEmergencyRescueSystem(boolean passengerEmergencyRescueSystem) {
        this.passengerEmergencyRescueSystem = passengerEmergencyRescueSystem;
    }

    public int getNumOfcCargo() {
        return numOfcCargo;
    }

    public void setNumOfcCargo(int numOfcCargo) {
        this.numOfcCargo = numOfcCargo;
    }

    public boolean isCargoEmergencyRescueSystem() {
        return cargoEmergencyRescueSystem;
    }

    public void setCargoEmergencyRescueSystem(boolean cargoEmergencyRescueSystem) {
        this.cargoEmergencyRescueSystem = cargoEmergencyRescueSystem;
    }
}

package com.vitalmix.model;

import com.vitalmix.model.weapons.Weapon;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "starship")
public class Starship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "model")
    private String model;

    @Column(name = "num_of_passengers")
    private int numOfPassengers;

    @Column(name = "passengers_emergency_rescue_system")
    private boolean passengerEmergencyRescueSystem;

    @Column(name = "num_of_cargo")
    private int numOfcCargo;

    @Column(name = "cargo_emergency_rescue_system")
    private boolean cargoEmergencyRescueSystem;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "starship_id")
    private List<Weapon> weapons;
    //private Module[] modules;

    public Starship() {

    }

    public Starship(String model, int numOfPassengers, boolean passengerEmergencyRescueSystem, int numOfcCargo, boolean cargoEmergencyRescueSystem) {
        this.model = model;
        this.numOfPassengers = numOfPassengers;
        this.passengerEmergencyRescueSystem = passengerEmergencyRescueSystem;
        this.numOfcCargo = numOfcCargo;
        this.cargoEmergencyRescueSystem = cargoEmergencyRescueSystem;

        weapons = new ArrayList<>();
    }

    public Starship(int id, String model, int numOfPassengers, boolean passengerEmergencyRescueSystem, int numOfcCargo, boolean cargoEmergencyRescueSystem) {
        this.id = id;
        this.model = model;
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

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

/*    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }*/

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

    public void addWeapon(Weapon weapon) {

        if(weapons == null) {
            weapons = new ArrayList<>();
        }

        weapons.add(weapon);
    }
}

package com.vitalmix.model.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "speed_booster")
public class SpeedBooster extends Module {

    @Column(name = "speed_boost")
    private int speedBoost;

    @Column(name = "time_of_boost")
    private int timeOfBoost;

    private static final String type = "Speed booster";

    public SpeedBooster() {
    }

    public SpeedBooster(String type, String description, int speedBoost, int timeOfBoost) {
        super(description);
        this.speedBoost = speedBoost;
        this.timeOfBoost = timeOfBoost;
    }

    public SpeedBooster(int id, String type, String description, int speedBoost, int timeOfBoost) {
        super(id, description);
        this.speedBoost = speedBoost;
        this.timeOfBoost = timeOfBoost;
    }

    public int getSpeedBoost() {
        return speedBoost;
    }

    public void setSpeedBoost(int speedBoost) {
        this.speedBoost = speedBoost;
    }

    public int getTimeOfBoost() {
        return timeOfBoost;
    }

    public void setTimeOfBoost(int timeOfBoost) {
        this.timeOfBoost = timeOfBoost;
    }

    public static String getType() {
        return type;
    }
}

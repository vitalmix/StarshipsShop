package com.vitalmix.model.modules;

public class SpeedBooster extends Module {

    private int speedBoost;
    private int timeOfBoost;

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
}

package com.rest.jpademo.viewmodels;

public class CarCreateViewModel {

    private String make;
    private String model;
    private  int bhp;
    private int torque;
    private String colour;
    private String fuel;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBhp() {
        return bhp;
    }

    public void setBhp(int bhp) {
        this.bhp = bhp;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}

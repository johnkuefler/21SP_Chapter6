/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Car {
    private int year;
    private String make;
    private String model;
    private double currentSpeed;
    private double accelerationPerSecond;
    
    public Car() {
        year = 0;
        make = "";
        model = "";
        currentSpeed = 0;
        accelerationPerSecond = 0;
    }

    public Car(int year, String make, String model, double currentSpeed, double accelerationPerSecond) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.accelerationPerSecond = accelerationPerSecond;
    }
        
    public void accelerate() {
        currentSpeed += accelerationPerSecond;
    }
    
    public void brake() {
        currentSpeed -= 5;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getAccelerationPerSecond() {
        return accelerationPerSecond;
    }

    public void setAccelerationPerSecond(double accelerationPerSecond) {
        this.accelerationPerSecond = accelerationPerSecond;
    }
    
    
}

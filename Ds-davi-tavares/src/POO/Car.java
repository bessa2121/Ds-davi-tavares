/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

/**
 *
 * @author DAVI
 */

// Base class Car
public class Car {
    protected String brand;
    protected String model;
    protected int year;
    protected boolean isOn;
    protected int speed;
    protected int fuelLevel;
    protected int mileage;
    protected boolean maintenanceNeeded;
    protected String color;

    // Constructor
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isOn = false;
        this.speed = 0;
        this.fuelLevel = 100; // Full fuel tank
        this.mileage = 0;
        this.maintenanceNeeded = false;
    }

    // Method to turn on the car
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("The car is now on.");
        } else {
            System.out.println("The car is already on.");
        }
    }

    // Method to turn off the car
    public void turnOff() {
        if (isOn) {
            isOn = false;
            speed = 0;
            System.out.println("The car is now off.");
        } else {
            System.out.println("The car is already off.");
        }
    }

    // Method to accelerate
    public void accelerate(int increment) {
        if (isOn) {
            if (fuelLevel > 0) {
                speed += increment;
                fuelLevel -= increment / 2;
                mileage += increment / 5;
                System.out.println("Current speed: " + speed + " km/h");
                checkMaintenance();
            } else {
                System.out.println("Out of fuel! Please refuel.");
            }
        } else {
            System.out.println("The car is off! Turn it on first.");
        }
    }

    // Method to brake
    public void brake() {
        if (speed > 0) {
            speed -= 10;
            if (speed < 0) speed = 0;
            System.out.println("Braking... Current speed: " + speed + " km/h");
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    // Method to refuel
    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) fuelLevel = 100;
        System.out.println("Fuel refilled. Current level: " + fuelLevel + "%");
    }

    // Method to check maintenance status
    private void checkMaintenance() {
        if (mileage >= 5000) {
            maintenanceNeeded = true;
            System.out.println("Warning: The car needs maintenance!");
        }
    }

    // Method to perform maintenance
    public void performMaintenance() {
        maintenanceNeeded = false;
        mileage = 0;
        System.out.println("Maintenance completed. The car is ready to drive!");
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("\n--- Car Information ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Status: " + (isOn ? "On" : "Off"));
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + fuelLevel + "%");
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Maintenance Needed: " + (maintenanceNeeded ? "Yes" : "No"));
    }
}

// Derived class SportsCar
class SportsCar extends Car {
    private boolean sportsMode;

    // Constructor
    public SportsCar(String brand, String model, int year, String color) {
        super(brand, model, year, color);
        this.sportsMode = false;
    }

    // Method to activate sports mode
    public void activateSportsMode() {
        if (isOn) {
            sportsMode = true;
            System.out.println("Sports mode activated! Increased acceleration.");
        } else {
            System.out.println("Cannot activate sports mode while the car is off.");
        }
    }

    // Method to deactivate sports mode
    public void deactivateSportsMode() {
        if (sportsMode) {
            sportsMode = false;
            System.out.println("Sports mode deactivated.");
        } else {
            System.out.println("Sports mode is already off.");
        }
    }

    // Overriding the displayInfo method to include sports mode
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sports Mode: " + (sportsMode ? "Activated" : "Deactivated"));
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

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

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isOn = false;
        this.speed = 0;
        this.fuelLevel = 100;
        this.mileage = 0;
        this.maintenanceNeeded = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            JOptionPane.showMessageDialog(null, "The car is now on.");
        } else {
            JOptionPane.showMessageDialog(null, "The car is already on.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            speed = 0;
            JOptionPane.showMessageDialog(null, "The car is now off.");
        } else {
            JOptionPane.showMessageDialog(null, "The car is already off.");
        }
    }

    public void accelerate(int increment) {
        if (isOn) {
            if (fuelLevel > 0) {
                speed += increment;
                fuelLevel -= increment / 2;
                mileage += increment / 5;
                JOptionPane.showMessageDialog(null, "Current speed: " + speed + " km/h");
                checkMaintenance();
            } else {
                JOptionPane.showMessageDialog(null, "Out of fuel! Please refuel.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The car is off! Turn it on first.");
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 10;
            if (speed < 0) speed = 0;
            JOptionPane.showMessageDialog(null, "Braking... Current speed: " + speed + " km/h");
        } else {
            JOptionPane.showMessageDialog(null, "The car is already stopped.");
        }
    }

    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) fuelLevel = 100;
        JOptionPane.showMessageDialog(null, "Fuel refilled. Current level: " + fuelLevel + "%");
    }

    private void checkMaintenance() {
        if (mileage >= 5000) {
            maintenanceNeeded = true;
            JOptionPane.showMessageDialog(null, "Warning: The car needs maintenance!");
        }
    }

    public void performMaintenance() {
        maintenanceNeeded = false;
        mileage = 0;
        JOptionPane.showMessageDialog(null, "Maintenance completed. The car is ready to drive!");
    }

    public void displayInfo() {
        String info = """
            --- Car Information ---
            Brand: %s
            Model: %s
            Year: %d
            Color: %s
            Status: %s
            Speed: %d km/h
            Fuel Level: %d%%
            Mileage: %d km
            Maintenance Needed: %s
            """.formatted(
                brand, model, year, color,
                isOn ? "On" : "Off",
                speed, fuelLevel, mileage,
                maintenanceNeeded ? "Yes" : "No"
        );

        JOptionPane.showMessageDialog(null, info);
    }
}

// Classe derivada SportsCar
class SportsCar extends Car {
    private boolean sportsMode;

    public SportsCar(String brand, String model, int year, String color) {
        super(brand, model, year, color);
        this.sportsMode = false;
    }

    public void activateSportsMode() {
        if (isOn) {
            sportsMode = true;
            JOptionPane.showMessageDialog(null, "Sports mode activated! Increased acceleration.");
        } else {
            JOptionPane.showMessageDialog(null, "Cannot activate sports mode while the car is off.");
        }
    }

    public void deactivateSportsMode() {
        if (sportsMode) {
            sportsMode = false;
            JOptionPane.showMessageDialog(null, "Sports mode deactivated.");
        } else {
            JOptionPane.showMessageDialog(null, "Sports mode is already off.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        JOptionPane.showMessageDialog(null, "Sports Mode: " + (sportsMode ? "Activated" : "Deactivated"));
    }
}

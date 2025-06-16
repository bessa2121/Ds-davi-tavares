/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

public class CarTest {
    public static void main(String[] args) {
        String brand = JOptionPane.showInputDialog("Enter the brand of your car:");
        String model = JOptionPane.showInputDialog("Enter the model of your car:");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of your car:"));
        String color = JOptionPane.showInputDialog("Enter the color of your car:");
        String isSportsCar = JOptionPane.showInputDialog("Is your car a sports car? (yes/no):");

        Car myCar;
        if (isSportsCar.equalsIgnoreCase("yes")) {
            myCar = new SportsCar(brand, model, year, color);
        } else {
            myCar = new Car(brand, model, year, color);
        }

        int option;
        do {
            String menu = """
                --- MENU ---
                1 - Turn on the car
                2 - Turn off the car
                3 - Accelerate
                4 - Brake
                5 - Refuel
                6 - Perform maintenance
                7 - Display car information""" +
                (myCar instanceof SportsCar ? """
                \n8 - Activate sports mode
                9 - Deactivate sports mode""" : "") +
                "\n0 - Exit";
            
            option = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n\nChoose an option:"));

            switch (option) {
                case 1 -> myCar.turnOn();
                case 2 -> myCar.turnOff();
                case 3 -> {
                    int increment = Integer.parseInt(JOptionPane.showInputDialog("Enter the acceleration value:"));
                    myCar.accelerate(increment);
                }
                case 4 -> myCar.brake();
                case 5 -> {
                    int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of fuel to refill:"));
                    myCar.refuel(amount);
                }
                case 6 -> myCar.performMaintenance();
                case 7 -> myCar.displayInfo();
                case 8 -> {
                    if (myCar instanceof SportsCar sportsCar) {
                        sportsCar.activateSportsMode();
                    }
                }
                case 9 -> {
                    if (myCar instanceof SportsCar sportsCar) {
                        sportsCar.deactivateSportsMode();
                    }
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Exiting the program...");
                default -> JOptionPane.showMessageDialog(null, "Invalid option! Please try again.");
            }

        } while (option != 0);
    }
}

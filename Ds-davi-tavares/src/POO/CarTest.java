/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author DAVI
 */
// Main class to test the program
public class CarTest {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            
            // Ask the user for car details
            System.out.print("Enter the brand of your car: ");
            String brand = input.nextLine();
            
            System.out.print("Enter the model of your car: ");
            String model = input.nextLine();
            
            System.out.print("Enter the year of your car: ");
            int year = input.nextInt();
            input.nextLine();
            
            System.out.print("Enter the color of your car: ");
            String color = input.nextLine();
            
            System.out.print("Is your car a sports car? (yes/no): ");
            String isSportsCar = input.nextLine();
            Car myCar;
            
            if (isSportsCar.equalsIgnoreCase("yes")) {
                myCar = new SportsCar(brand, model, year, color);
            } else {
                myCar = new Car(brand, model, year, color);
            }   

            // Interactive menu
            int option;
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1 - Turn on the car");
                System.out.println("2 - Turn off the car");
                System.out.println("3 - Accelerate");
                System.out.println("4 - Brake");
                System.out.println("5 - Refuel");
                System.out.println("6 - Perform maintenance");
                System.out.println("7 - Display car information");
                if (myCar instanceof SportsCar) {
                    System.out.println("8 - Activate sports mode");
                    System.out.println("9 - Deactivate sports mode");
                }
                System.out.println("0 - Exit");
                System.out.print("Choose an option: ");
                option = input.nextInt();

                switch (option) {
                    case 1 ->
                        myCar.turnOn();
                    case 2 ->
                        myCar.turnOff();
                    case 3 -> {
                        System.out.print("Enter the acceleration value: ");
                        int increment = input.nextInt();
                        myCar.accelerate(increment);
                    }
                    case 4 ->
                        myCar.brake();
                    case 5 -> {
                        System.out.print("Enter the amount of fuel to refill: ");
                        int amount = input.nextInt();
                        myCar.refuel(amount);
                    }
                    case 6 ->
                        myCar.performMaintenance();
                    case 7 ->
                        myCar.displayInfo();
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
                    case 0 ->
                        System.out.println("Exiting the program...");
                    default ->
                        System.out.println("Invalid option! Please try again.");
                }
            } while (option != 0);
        }
    } // Close the Scanner to prevent resource leaks
}

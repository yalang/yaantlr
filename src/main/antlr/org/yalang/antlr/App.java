package org.yalang.antlr;

import org.yalang.antlr.entities.Car;
import org.yalang.antlr.entities.Slot;
import org.yalang.antlr.services.ParkingLotImplService;
import org.yalang.antlr.services.ParkingLotService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Class<?> primarySrc;

    private static ParkingLotService parkingLotService;

    private static List<Slot> parkingLot;

    public App(Class<?> primarySources) {
        this.primarySrc = primarySources;
    }

    public static App run(Class<?> primarySource, String... args) {

        // Getting the instance of the service
        parkingLotService = ParkingLotImplService.getInstance();

        // Parking lot to store all the slots
        parkingLot = new LinkedList<>();

        return new App(primarySource).run(args);
    }

    public App run(String... args) {

        // Check if the it is interactive or not based on that it print $ at the beginning to take commands
        boolean cmdInput = false;

        // Taking input from file or interactive shell
        Scanner scanner;
        if (args.length > 0) {
            // If file is provided as argument taking input from file
            File file = new File(args[0]);
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Invalid file");
                return this;
            }
        } else {
            // Using interactive shell
            scanner = new Scanner(System.in);
            // Set interactive shell to true
            cmdInput = true;
        }

        // Print initial $ for interactive shell
        if (cmdInput) if (cmdInput) System.out.printf("$ ");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("exit")) {
                // Exit program
                break;
            } else if (input.equals("create_parking_lot")) {
                // For creating parking lot
                if (scanner.hasNextInt()) {
                    // Getting amount
                    Integer amount = scanner.nextInt();
                    // Creating parking lot
                    parkingLot = parkingLotService.createParkingLot(amount);
                    System.out.printf("Created a parking lot with %d slots%n", amount);
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                } else {
                    System.out.println("Invalid command");
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                }
            } else if (input.equals("park")) {
                // For parking a car
                if (scanner.hasNext()) {
                    // Getting registration number of car
                    String registrationNumber = scanner.next();
                    if (scanner.hasNext()) {
                        // Getting color of the car
                        String color = scanner.next();
                        // Creating and parking the car
                        Integer slotNumber = parkingLotService.park(parkingLot, new Car(registrationNumber, color));
                        if (slotNumber != null) {
                            System.out.printf("Allocated slot number: %d%n", slotNumber);
                            // Print initial $ for interactive shell
                            if (cmdInput) System.out.printf("$ ");
                        } else {
                            System.out.println("Sorry, parking lot is full");
                            // Print initial $ for interactive shell
                            if (cmdInput) System.out.printf("$ ");
                        }
                    } else {
                        System.out.println("Invalid command");
                        // Print initial $ for interactive shell
                        if (cmdInput) System.out.printf("$ ");
                    }
                } else {
                    System.out.println("Invalid command");
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                }
            } else if (input.equals("leave")) {
                // For leaving a slot
                if (scanner.hasNextInt()) {
                    // Getting slot number to leave
                    Integer slotNumber = scanner.nextInt();
                    // Leaving the slot number
                    Integer availableSlotNumber = parkingLotService.leave(parkingLot, slotNumber);
                    if (availableSlotNumber != null) {
                        // If leaved successfully
                        System.out.printf("Slot number %d is free%n", availableSlotNumber);
                        // Print initial $ for interactive shell
                        if (cmdInput) System.out.printf("$ ");
                    } else {
                        System.out.println("Invalid slot number");
                        // Print initial $ for interactive shell
                        if (cmdInput) System.out.printf("$ ");
                    }
                } else {
                    System.out.println("Invalid command");
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                }
            } else if (input.equals("status")) {
                // Printing status of the parking lot
                System.out.println("Slot No.    Registration No    Colour");
                for (Slot slot: parkingLot) {
                    // Print only parking slot and skipping empty slot
                    if (!slot.isAvailable()) {
                        System.out.printf("%d %23s      %-1s %n", slot.getSlotNumber(), slot.getCar().getRegistrationNumber(), slot.getCar().getColor());
                    }
                }
                // Print initial $ for interactive shell
                if (cmdInput) System.out.printf("$ ");
            } else if (input.equals("registration_numbers_for_cars_with_colour")) {
                // For searching registration numbers for cars for given color
                if (scanner.hasNext()) {
                    // Getting color of the car
                    String color = scanner.next();
                    // Searching registration numbers for cars with given color
                    List<String> registrationNumbers = parkingLotService.registrationNumbersForCarsWithColour(parkingLot, color);
                    System.out.println(registrationNumbers.toString().replace("[", "").replace("]", ""));
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                } else {
                    System.out.println("Invalid command");
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                }
            } else if (input.equals("slot_numbers_for_cars_with_colour")) {
                // For searching slot numbers for cars for given color
                if (scanner.hasNext()) {
                    // Getting color of the car
                    String color = scanner.next();
                    // Searching slot numbers for cars for given color
                    List<Integer> slotNumbers = parkingLotService.slotNumbersForCarsWithColour(parkingLot, color);
                    System.out.println(slotNumbers.toString().replace("[", "").replace("]", ""));
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                } else {
                    System.out.println("Invalid command");
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                }
            } else if (input.equals("slot_number_for_registration_number")) {
                // For searching slot number for given registration number
                if (scanner.hasNext()) {
                    // Getting registration of the car
                    String registrationNumber = scanner.next();
                    // Searching slot number for given registration number
                    Integer slotNumber = parkingLotService.slotNumberForRegistrationNumber(parkingLot, registrationNumber);
                    if (slotNumber != null) {
                        System.out.println(slotNumber);
                        // Print initial $ for interactive shell
                        if (cmdInput) System.out.printf("$ ");
                    } else {
                        System.out.println("Not found");
                        // Print initial $ for interactive shell
                        if (cmdInput) System.out.printf("$ ");
                    }
                } else {
                    System.out.println("Invalid command");
                    // Print initial $ for interactive shell
                    if (cmdInput) System.out.printf("$ ");
                }
            } else {
                System.out.println("Invalid command");
                // Print initial $ for interactive shell
                if (cmdInput) System.out.printf("$ ");
            }
        }

        return this;
    }
}

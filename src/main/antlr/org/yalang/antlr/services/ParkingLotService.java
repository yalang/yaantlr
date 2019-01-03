package org.yalang.antlr.services;

import org.yalang.antlr.entities.Car;
import org.yalang.antlr.entities.Slot;

import java.util.List;

public interface ParkingLotService {

    /**
     * Creates parking lot for the given amount and returns the parking lot.
     * @param amount
     * @return List of all slots
     */
    List<Slot> createParkingLot(Integer amount);

    /**
     * Park the given car in to the nearest parking slot if is available.
     * @param parkingLot
     * @param car
     * @return Slot number where car is parking or null if slot is not available
     */
    Integer park(List<Slot> parkingLot, Car car);

    /**
     * Leave a parking slot number
     * @param parkingLot
     * @param slotNumber
     * @return Return empty slot number or null
     */
    Integer leave(List<Slot> parkingLot, Integer slotNumber);

    /**
     * Returns the list of registration numbers of the car whose color matches with the given color
     * @param parkingLot
     * @param color
     * @return List of registration numbers of the car whose color matches with the given color
     */
    List<String> registrationNumbersForCarsWithColour(List<Slot> parkingLot, String color);

    /**
     * Returns the list of slot numbers of the car whose color matches with the given color
     * @param parkingLot
     * @param color
     * @return List of slot numbers of the car whose color matches with the given color
     */
    List<Integer> slotNumbersForCarsWithColour(List<Slot> parkingLot, String color);

    /**
     * Returns the slot number of the car where its parked<br/>
     * and its registration is the given registration number
     * @param parkingLot
     * @param registrationNumber
     * @return Slot of number of the car where its parked and its registration is the given registration number or null
     */
    Integer slotNumberForRegistrationNumber(List<Slot> parkingLot, String registrationNumber);
}

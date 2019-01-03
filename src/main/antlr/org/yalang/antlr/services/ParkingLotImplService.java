package org.yalang.antlr.services;

import org.yalang.antlr.entities.Car;
import org.yalang.antlr.entities.Slot;

import java.util.LinkedList;
import java.util.List;


public class ParkingLotImplService implements ParkingLotService {

    /**
     * Return the instance of the service
     * @return
     */
    public static ParkingLotService getInstance() {
        return new ParkingLotImplService();
    }

    public List<Slot> createParkingLot(Integer amount) {

        List<Slot> parkingLot = new LinkedList<Slot>();

        for (int i = 1; i <= amount; i++) {
            Slot slot = new Slot(i);
            parkingLot.add(slot);
        }

        return parkingLot;
    }

    public Integer park(List<Slot> parkingLot, Car car) {

        for (Slot slot: parkingLot) {
            if (slot.isAvailable()) {
                slot.park(car);
                return slot.getSlotNumber();
            }
        }

        return null;
    }

    public Integer leave(List<Slot> parkingLot, Integer slotNumber) {

        for (Slot slot: parkingLot) {
            if (slot.getSlotNumber().equals(slotNumber)) {
                slot.leave();
                return slot.getSlotNumber();
            }
        }

        return null;
    }

    public List<String> registrationNumbersForCarsWithColour(List<Slot> parkingLot, String color) {
        List<String> registrationNumbers = new LinkedList<String>();
        for (Slot slot: parkingLot) {
            if (slot.colorMatched(color)) {
                registrationNumbers.add(slot.getCar().getRegistrationNumber());
            }
        }
        return registrationNumbers;
    }

    public List<Integer> slotNumbersForCarsWithColour(List<Slot> parkingLot, String color) {
        List<Integer> slotNumbers = new LinkedList<Integer>();
        for (Slot slot: parkingLot) {
            if (slot.colorMatched(color)) {
                slotNumbers.add(slot.getSlotNumber());
            }
        }
        return slotNumbers;
    }

    public Integer slotNumberForRegistrationNumber(List<Slot> parkingLot, String registrationNumber) {
        for (Slot slot: parkingLot) {
            if (slot.registrationNumberMatched(registrationNumber)) {
                return slot.getSlotNumber();
            }
        }
        return null;
    }
}

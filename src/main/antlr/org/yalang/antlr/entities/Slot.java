package org.yalang.antlr.entities;

public class Slot {
    private Integer slotNumber;
    private Car car;

    public Slot(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public Car getCar() {
        return car;
    }

    public void park(Car car) {
        this.car = car;
    }

    public void leave() {
        this.car = null;
    }

    public Boolean isAvailable() {
        if (this.car == null) {
            return true;
        }
        return false;
    }

    public Boolean colorMatched(String color) {
        if (this.car != null && this.car.getColor().equals(color)) {
            return true;
        }
        return false;
    }

    public Boolean registrationNumberMatched(String registrationNumber) {
        if (this.car != null && this.car.getRegistrationNumber().equals(registrationNumber)) {
            return true;
        }
        return false;
    }
}

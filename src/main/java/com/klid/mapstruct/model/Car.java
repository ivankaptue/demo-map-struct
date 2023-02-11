package com.klid.mapstruct.model;

/**
 * @author Ivan Kaptue
 */
public class Car {
    private String name;
    private int numberOfSeats;
    private CarType type;

    public Car(String name, int numberOfSeats, CarType type) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}

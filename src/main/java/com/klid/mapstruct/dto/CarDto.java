package com.klid.mapstruct.dto;

/**
 * @author Ivan Kaptue
 */
public class CarDto {
    private String name;
    private int seatCount;
    private String type;
    private String color;

    public CarDto(String name, int seatCount, String type, String color) {
        this.name = name;
        this.seatCount = seatCount;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "name='" + name + '\'' +
                ", seatCount=" + seatCount +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

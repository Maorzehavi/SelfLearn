package oop;

public class Car {
    protected String model;
    protected int seats;
    protected int maxSpeed;
    protected int year;
    protected int price;

    /**
     * Constructor for objects of class Car
     *
     * @param model
     * @param seats
     * @param maxSpeed
     * @param year
     * @param price
     */
    public Car(String model, int seats, int maxSpeed, int year, int price) {
        this.model = model;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "model='" + model + '\'' +
                ", seats=" + seats +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", price=" + price +
                '}';

    }
}

package org.example;

public class Car extends Vehicle
{
    private double numberSeats;   // measured in litres.  For Cars and 4x4

    public Car(String type, String make, String model, double milesPerKwH,
               String registration, double costPerMile,
               int year, int month, int day,
               int mileage, double latitude, double longitude,
               int numberSeats)

    {
        // call superclass constructor to initialize the fields defined in Vehicle
        super( type,make,model,milesPerKwH,
                registration,costPerMile,
                year,month,day,
                mileage,latitude,longitude);

        this.numberSeats = numberSeats;
    }

    public double getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(double numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberSeats=" + numberSeats +
                '}';
    }
}

/**
 * Represents a car with make, model, year, and mileage.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Car() {
        // Empty constructor
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car(String make, String model, int year, int mileage) {
        this(make, model, year);
        this.mileage = mileage;
    }

    // Get methods

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    // Set methods

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2100) {
            throw new IllegalArgumentException("Invalid year.");
        }
        this.year = year;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative.");
        }
        this.mileage = mileage;
    }

    // Additional methods

    public boolean needsMaintenance() {
        return mileage >= 100000;
    }

    public String getCarInfo() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}

package model;

/**
 *
 * @author Mario Carranza Mena
 */
public class Vehicle {
    
    private String brand;
    private String color;
    private String modelName;
    private String power;
    private String range;
    private String topSpeed; // Km/h
    private String aceleration; // 0 - 100 Km/h
    private int numberOfDoors;
    private String bodyAndChassis; //Example: Sedan, 4x4, SUV, Hatchback, etc
    private int yearModel;

    public Vehicle(String brand, String color, String modelName, int yearModel, String power, String range, String topSpeed, String aceleration, int numberOfDoors, String bodyAndChassis) {
        this.brand = brand;
        this.color = color;
        this.modelName = modelName;
        this.power = power;
        this.range = range;
        this.topSpeed = topSpeed;
        this.aceleration = aceleration;
        this.numberOfDoors = numberOfDoors;
        this.bodyAndChassis = bodyAndChassis;
        this.yearModel = yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getAceleration() {
        return aceleration;
    }

    public void setAceleration(String aceleration) {
        this.aceleration = aceleration;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getBodyAndChassis() {
        return bodyAndChassis;
    }

    public void setBodyAndChassis(String bodyAndChassis) {
        this.bodyAndChassis = bodyAndChassis;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", color=" + color + ", Year: " 
                + yearModel + ", modelName=" + modelName + ", power=" + power 
                + ", range=" + range + ", topSpeed=" + topSpeed + ", aceleration=" 
                + aceleration + ", numberOfDoors=" + numberOfDoors + ", bodyAndChassis=" 
                + bodyAndChassis + '}';
    }
}

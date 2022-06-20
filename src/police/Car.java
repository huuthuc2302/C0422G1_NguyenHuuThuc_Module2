package police;

public class Car extends Vehicle {
    private int numberOfSeats = 7 ; //số chỗ ngồi
    private String carType = "xe du lịch" ; //kiểu xe

    public Car() {
    }

    public Car(int numberOfSeats, String carType) {
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Car(String seaOfControl, String manufacturerName, int yearOfManufacture, String owner, int id, int numberOfSeats, String carType) {
        super(seaOfControl, manufacturerName, yearOfManufacture, owner, id);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "car "+super.toString() +
                "\nNumberOfSeats = " + numberOfSeats +
                "\nCarType = '" + carType + '\n';

    }
}

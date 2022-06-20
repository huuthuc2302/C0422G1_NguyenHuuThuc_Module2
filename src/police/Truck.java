package police;

public class Truck extends Vehicle {
    private int vehicleTonnage = 1000; //trọng tải xe

    public Truck() {
    }

    public Truck(int vehicleTonnage) {
        this.vehicleTonnage = vehicleTonnage;
    }

    public Truck(String seaOfControl, String manufacturerName, int yearOfManufacture, String owner, int id, int vehicleTonnage) {
        super(seaOfControl, manufacturerName, yearOfManufacture, owner, id);
        this.vehicleTonnage = vehicleTonnage;
    }

    public int getVehicleTonnage() {
        return vehicleTonnage;
    }

    public void setVehicleTonnage(int vehicleTonnage) {
        this.vehicleTonnage = vehicleTonnage;
    }

    @Override
    public String toString() {
        return "truck "+super.toString() +
                "\nVehicleTonnage = " + vehicleTonnage + "\n";

    }
}

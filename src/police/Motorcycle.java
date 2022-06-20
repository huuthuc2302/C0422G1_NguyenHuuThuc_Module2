package police;

public class Motorcycle extends Vehicle {
    private String wattage = "110cc"; //Công suất

    public Motorcycle() {
    }

    public Motorcycle(String wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String seaOfControl, String manufacturerName, int yearOfManufacture, String owner, int id, String wattage) {
        super(seaOfControl, manufacturerName, yearOfManufacture, owner, id);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "motorcycle "+ super.toString() +
                "\nWattage = " + wattage + "\n";
    }
}

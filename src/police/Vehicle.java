package police;

public class Vehicle {
    private String seaOfControl = "43C1-444.46"; //biển kiểm soát
    private String manufacturerName = "YAMAHA"; //tên hãng sản xuất
    private int yearOfManufacture = 2014;//năm sản xuất
    private String owner = "Nguyễn Hữu Thức"; //chủ sở hữu
    private int id;

    public Vehicle() {
    }

    public Vehicle(String seaOfControl, String manufacturerName, int yearOfManufacture, String owner, int id) {
        this.seaOfControl = seaOfControl;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
        this.id = id;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "vehicle " + seaOfControl + '\'' +
                "\nManufacturerName = '" + manufacturerName + '\'' +
                "\nYearOfManufacture = " + yearOfManufacture +
                "\nOwner = ' " + owner + '\'';

    }
}

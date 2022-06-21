package ss12_java_collection_framework.bai_tap;

public class Product {
    private String phoneName;
    private String manufacturerName;
    private int yearOfManufacture;
    private int id ;

    public Product() {
    }

    public Product(String phoneName, String manufacturerName, int yearOfManufacture, int id) {
        this.phoneName = phoneName;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SẢN PHẨM { " +
                "Tên điện thoại = '" + phoneName + '\'' +
                ", Hãng sản xuất = '" + manufacturerName + '\'' +
                ", Năm sản xuất = " + yearOfManufacture +
                ", id=" + id +
                '}';
    }
}

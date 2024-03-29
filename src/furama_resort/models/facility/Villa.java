package furama_resort.models.facility;

public class Villa extends Facility{
    private String standardVilla; //Tiêu chuẩn phòng
    private double areaPool; //Diện tích hồ bơi
    private int floor; //Số tầng

    public Villa() {
    }

    public Villa(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double areaPool,
                 int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa :" + super.toString() +
                "standardVilla='" + standardVilla + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor ;
    }

    @Override
    public String writeToFile(){
        return super.writeToFile() + "," +
                standardVilla + "," +
                areaPool + "," +
                floor;
    }
}

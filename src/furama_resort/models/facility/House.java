package furama_resort.models.facility;

public class House extends Facility {
    private String standardHouse; //Tiêu chuẩn phòng
    private int floor; //Số tầng

    public House() {
    }

    public House(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardHouse,
                 int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + "," + standardHouse + "," + floor;
    }

    @Override
    public String toString() {
        return "House : " + super.toString() +
                "standardHouse='" + standardHouse + '\'' +
                ", floor=" + floor ;
    }
}

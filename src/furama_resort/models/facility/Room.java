package furama_resort.models.facility;

public class Room extends Facility{
    private String freeOfCharge; //Dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String idFacility,
                String nameService,
                double areaUse,
                int rentalPrice,
                int rentalPeopleMax,
                String styleRental,
                String freeOfCharge) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeOfCharge = freeOfCharge;
    }

    public String getFreeOfCharge() {
        return freeOfCharge;
    }

    public void setFreeOfCharge(String freeOfCharge) {
        this.freeOfCharge = freeOfCharge;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + "," + freeOfCharge;
    }

    @Override
    public String toString() {
        return "Room : " + super.toString() +
                "freeOfCharge='" + freeOfCharge + '\'';
    }
}

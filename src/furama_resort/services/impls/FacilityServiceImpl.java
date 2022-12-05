package furama_resort.services.impls;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;
import furama_resort.models.person.Employee;
import furama_resort.services.interfaces.FacilityService;
import furama_resort.util.ReadAndWrite;
import furama_resort.util.regex.RegexFacility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    public static final String FACILITY_LIST = "src/furama_resort/data/facility.csv";
    public static final String VILLA_LIST = "src/furama_resort/data/villa.csv";
    public static final String HOUSE_LIST = "src/furama_resort/data/house.csv";
    public static final String ROOM_LIST = "src/furama_resort/data/room.csv";


    public static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityCsv();
        boolean check = true;
        while (check) {
            System.out.println("1.Display Facility");
            System.out.println("2.Display Villa");
            System.out.println("3.Display House");
            System.out.println("4.Display Room");
            System.out.println("0.Trở lại menu chính");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        try {
                            if (facilityIntegerMap.size() == 0) {
                                throw new NullPointerException();
                            } else {
                                for (Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()) {
                                    System.out.println("Service Name = " + map.getKey() + " , Hire Numbers = " + map.getValue());
                                }
                            }
                        } catch (NullPointerException e) {
                            System.err.println("Please add new Facility");
                        }
                        break;
                    }
                    case 2: {
                        displayVillaList();
                        break;
                    }
                    case 3: {
                        displayHouseList();
                        break;
                    }
                    case 4: {
                        displayRoomList();
                        break;
                    }
                    case 0:{
                        check = false;
                        break;
                    }
                    default:{
                        System.out.println("Thử lại");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    private void displayVillaList() {
        List<Villa> villaList = ReadAndWrite.readVillaFileCSV(VILLA_LIST);

        for (Villa villa: villaList){
            System.out.println(villa);
        }
    }

    private void displayHouseList() {
        List<House> houseList = ReadAndWrite.readHouseFileCSV(HOUSE_LIST);

        for (House house: houseList){
            System.out.println(house);
        }
    }

    private void displayRoomList() {
        List<Room> roomList = ReadAndWrite.readRoomFileCSV(ROOM_LIST);

        for (Room room: roomList){
            System.out.println(room);
        }
    }

    @Override
    public void displayMaintain() {

    }

    public void addFacilityMaintain() {

    }

    @Override
    public void addNewVilla() throws Exception {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityCsv();
        String id = RegexFacility.inputIdVilla();
        String name = RegexFacility.inputNameFacility();
        double areaUse = Double.parseDouble(RegexFacility.inputArea());
        int price = RegexFacility.inputPrice();
        int maxPeople = Integer.parseInt(RegexFacility.inputAmount());
        String style = RegexFacility.inputStyle();
        String standard = RegexFacility.inputStandard();
        double areaPool = Double.parseDouble(RegexFacility.inputAreaOfPool());
        int floor = Integer.parseInt(RegexFacility.inputFloor());

        Villa villa = new Villa(id, name, areaUse, price, maxPeople, style, standard, areaPool, floor);
        facilityIntegerMap.put(villa, 0);

        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa);

        ReadAndWrite.writeListVillaToCSV(villaList, VILLA_LIST,true);
        displayVillaList();

        ReadAndWrite.writeFacility(facilityIntegerMap,FACILITY_LIST,false);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void addNewHouse() throws Exception {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityCsv();
        String id = RegexFacility.inputIdHouse();
        String name = RegexFacility.inputNameFacility();
        double areaUse = Double.parseDouble(RegexFacility.inputArea());
        int price = RegexFacility.inputPrice();
        int maxPeople = Integer.parseInt(RegexFacility.inputAmount());
        String style = RegexFacility.inputStyle();
        String standard = RegexFacility.inputStandard();
        int floor = Integer.parseInt(RegexFacility.inputFloor());

        House house = new House(id, name, areaUse, price, maxPeople, style, standard, floor);
        facilityIntegerMap.put(house, 0);

        List<House> houseList = new ArrayList<>();
        houseList.add(house);

        ReadAndWrite.writeListHouseToCSV(houseList, HOUSE_LIST,true);
        displayHouseList();
        ReadAndWrite.writeFacility(facilityIntegerMap, FACILITY_LIST, false);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void addNewRoom() throws Exception {
        Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityCsv();
        String id = RegexFacility.inputIdRoom();
        String name = RegexFacility.inputNameFacility();
        double areaUse = Double.parseDouble(RegexFacility.inputArea());
        int price = RegexFacility.inputPrice();
        int maxPeople = Integer.parseInt(RegexFacility.inputAmount());
        String style = RegexFacility.inputStyle();
        String freeOfCharge = RegexFacility.inputFOC();

        Room room = new Room(id, name, areaUse, price, maxPeople, style, freeOfCharge);
        facilityIntegerMap.put(room, 0);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room);

        ReadAndWrite.writeListRoomToCSV(roomList, ROOM_LIST,true);
        displayRoomList();
        ReadAndWrite.writeFacility(facilityIntegerMap, FACILITY_LIST, false);
        System.out.println("Thêm mới thành công");
    }
}

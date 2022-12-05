package furama_resort.util;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;
import furama_resort.models.person.Customer;
import furama_resort.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWrite {

    public static final String FACILITY_LIST = "src/furama_resort/data/facility.csv";
    public static final String VILLA_LIST = "src/furama_resort/data/villa.csv";
    public static final String HOUSE_LIST = "src/furama_resort/data/house.csv";
    public static final String ROOM_LIST = "src/furama_resort/data/room.csv";

    private static void writeListStringToCSV(List<String> stringList, String pathFile, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);

            for ( String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeListEmployeeToCSV(List<Employee> employeeList, String pathFile, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Employee employee: employeeList ){
            stringList.add(employee.getInfoToCSV());
        }
        writeListStringToCSV(stringList,pathFile,append);
    }

    public static void writeListCustomerToCSV(List<Customer> customerList, String pathFile, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Customer customer: customerList ){
            stringList.add(customer.getInfoToCSV());
        }
        writeListStringToCSV(stringList,pathFile,append);
    }

    public static void writeListVillaToCSV(List<Villa> villaList, String pathFile, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Villa villa: villaList ){
            stringList.add(villa.writeToFile());
        }
        writeListStringToCSV(stringList,pathFile,append);
    }

    public static void writeListHouseToCSV(List<House> houseList, String pathFile, boolean append){
        List<String> stringList = new ArrayList<>();
        for (House house: houseList ){
            stringList.add(house.writeToFile());
        }
        writeListStringToCSV(stringList,pathFile,append);
    }

    public static void writeListRoomToCSV(List<Room> roomList, String pathFile, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Room room: roomList ){
            stringList.add(room.writeToFile());
        }
        writeListStringToCSV(stringList,pathFile,append);
    }

    public static void writeFacility(Map<Facility, Integer> facilityIntegerMap , String path,boolean append){
        try {
            FileWriter fileWriter = new FileWriter(new File(path),append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for(Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()){
                line = map.getKey().writeToFile() + "," + map.getValue();
                if (checkToWrite(path, line)){
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static List<String> readStringFileCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);

            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }
        return stringList;
    }

    public static List<Employee> readEmployeeFileCSV(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readStringFileCSV(pathFile);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Employee employee = new Employee(Integer.parseInt(array[0]), array[1],
                    array[2], array[3], array[4], Integer.parseInt(array[5]), Integer.parseInt(array[6]), array[7], array[8], array[9], Double.parseDouble(array[10]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static List<Customer> readCustomerFileCSV(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = readStringFileCSV(pathFile);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Customer customer = new Customer(Integer.parseInt(array[0]), array[1],
                    array[2], array[3], array[4], Integer.parseInt(array[5]), Integer.parseInt(array[6]), array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    public static List<Villa> readVillaFileCSV(String pathFile) {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = readStringFileCSV(pathFile);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Villa villa = new Villa(array[0], array[1],
                    Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]),
                    array[5], array[6], Double.parseDouble(array[7]), Integer.parseInt(array[8]));
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<House> readHouseFileCSV(String pathFile) {
        List<House> houseList = new ArrayList<>();
        List<String> stringList = readStringFileCSV(pathFile);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            House house = new House(array[0], array[1],
                    Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]),
                    array[5], array[6], Integer.parseInt(array[7]));
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Room> readRoomFileCSV(String pathFile) {
        List<Room> roomList = new ArrayList<>();
        List<String> stringList = readStringFileCSV(pathFile);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Room room = new Room(array[0], array[1],
                    Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]),
                    array[5], array[6]);
            roomList.add(room);
        }
        return roomList;
    }

    public static Map<Facility, Integer> readFacilityCsv() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FACILITY_LIST));
            String line = "";
            String[] arr;
            Villa villa;
            House house;
            Room room;
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
                if (arr[0].contains("SVVL")){
                    villa = new Villa(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6],
                            Double.parseDouble(arr[7]),
                            Integer.parseInt(arr[8]));
                    facilityIntegerMap.put(villa,Integer.parseInt(arr[9]));
                } else if (arr[0].contains("SVHO")) {
                    house = new House(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6],
                            Integer.parseInt(arr[7]));
                    facilityIntegerMap.put(house,Integer.parseInt(arr[8]));
                }else if (arr[0].contains("SVRO")){
                    room = new Room(arr[0],
                            arr[1],
                            Double.parseDouble(arr[2]),
                            Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]),
                            arr[5],
                            arr[6]);
                    facilityIntegerMap.put(room,Integer.parseInt(arr[7]));
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return facilityIntegerMap;
    }

    public static boolean checkToWrite(String path, String line){
        boolean check = false;
        if (path.equals(VILLA_LIST) && line.contains("SVVL") ||
                path.equals(HOUSE_LIST) && line.contains("SVHO") ||
                path.equals(ROOM_LIST) && line.contains("SVRO") ||
                path.equals(FACILITY_LIST)){
            check = true;
        }
        return check;
    }
}

package police;

import police.Motorcycle;
import police.Car;
import police.Truck;
import police.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        int check;
        vehicles.add(new Car("43A - 555.55", "Audi", 2022, "Thức",1, 4, "sport car"));
        vehicles.add(new Truck("43C - 068.68", "HuynDai", 2020, "Thìn", 2,1000));
        vehicles.add(new Motorcycle("43C1 - 4444.46", "Yamaha", 2014, "Thức",3, "110cc"));
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG!");
            System.out.println("1.Thêm mới phương tiện.");
            System.out.println("2.Hiển thị phương tiện.");
            System.out.println("3.Xóa phương tiện.");
            System.out.println("4.Tìm kiếm theo biển kiểm soát.");
            System.out.println("5.Thoát");
            Scanner input = new Scanner(System.in);
            System.out.println("nhập vào chức năng muốn dùng:");
            check = input.nextInt();
            switch (check) {
                case 1: //Thêm mới phương tiện
                    System.out.println("1.add new car");
                    System.out.println("2.add new truck");
                    System.out.println("3.add new bike");
                    int add = input.nextInt();
                    if (add == 1)
                        vehicles.add(new Car());
                    if (add == 2)
                        vehicles.add(new Truck());
                    if (add == 3)
                        vehicles.add(new Motorcycle());
                    break;

                case 2: //Hiển thị phương tiện
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.println("STT." + i + "\n" + vehicles.get(i));
                        System.out.println("==================================");
                    }
                    break;

                case 3: //Xóa phương tiện
                    System.out.println("nhập vào số thứ tự mún xóa:");
                    int i = input.nextInt();
                    vehicles.remove(i);
                    System.out.println("đã xóa!!! bấm phím 2 để hiển thị danh sách phương tiện:");
                    break;

                case 4: //Tìm kiếm theo biển kiểm soát
                    System.out.println("nhập vào biển kiểm soát cần tìm:");
                    int id = input.nextInt();
                    boolean flg = true;
                    for (int j = 0; j < vehicles.size(); j++) {
                        if (vehicles.get(j).getId() == id) {
                            System.out.println(vehicles.get(j));
                            flg = false;
                        }
                    }
                    if (flg)
                        System.out.println("biển kiểm soát này không tồn tại !");
                    break;
                case 5: //Thoát
                    System.out.println("zĩnh biệt bạn!!!!");
                    break;
            }
            System.out.println();
        } while (check < 5);
    }
}

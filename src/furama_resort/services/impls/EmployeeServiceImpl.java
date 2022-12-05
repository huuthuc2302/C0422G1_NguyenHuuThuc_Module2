package furama_resort.services.impls;

import furama_resort.models.person.Employee;
import furama_resort.services.interfaces.EmployeeService;
import furama_resort.util.ReadAndWrite;
import furama_resort.util.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    public static final String EMPLOYEE_FILE = "src/furama_resort/data/employee.csv";
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void display() throws Exception {

        List<Employee> employeeList = ReadAndWrite.readEmployeeFileCSV(EMPLOYEE_FILE);

        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() throws Exception {

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Nhập mã nhân viên");
        int id = Regex.inputIDEmployee(employeeList);

        System.out.println("Nhập tên nhân viên:");
        String name = Regex.inputName();

        System.out.println("Nhập ngày sinh:");
        String dateOfBirth = Regex.getDateOfBirth();

        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();

        System.out.println("Chọn giới tính:");
        String gender = sc.nextLine();

        System.out.println("Nhập số CMND:");
        int idCard = Integer.parseInt(Regex.inputIdCard());

        System.out.println("Nhập số điện thoại:");
        int phoneNumber = Integer.parseInt(Regex.inputPhoneNumber());

        System.out.println("Nhập emai:");
        String email = Regex.inputEmail();

        System.out.println("Chọn trình độ:");
        String level = chooseLevel();

        System.out.println("Chọn vị trí:");
        String position = choosePosition();

        System.out.println("Nhập lương:");
        double salary = Double.parseDouble(sc.nextLine());

        Employee employee = new Employee(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);

        ReadAndWrite.writeListEmployeeToCSV(employeeList,EMPLOYEE_FILE, true);

        System.out.println("Thêm mới thành công");
    }

    public String chooseLevel() {
        while (true) {
            try {
                System.out.println("1.Trung cấp");
                System.out.println("2.Cao đẳng");
                System.out.println("3.Đại học");
                System.out.println("4.Sau đại học");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "Sau đại học";
                    default:
                        System.out.println("Thử lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    public String choosePosition() {
        while (true) {
            try {
                System.out.println("1.Lễ tân");
                System.out.println("2.Phục vụ");
                System.out.println("3.Chuyên viên");
                System.out.println("4.Giám sát");
                System.out.println("5.Quản lý");
                System.out.println("6.Giám đốc");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lý";
                    case 6:
                        return "Giám đốc";
                    default:
                        System.out.println("Thử lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    @Override
    public void edit() throws Exception {

        List<Employee> employeeList = ReadAndWrite.readEmployeeFileCSV(EMPLOYEE_FILE);

        boolean result = true;
        System.out.println("Nhập ID nhân viên muốn chỉnh sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < employeeList.size() ; i++){
            if (employeeList.get(i).getId() == id){
                System.out.println(employeeList.get(i));
                boolean check = true;
                while (check) {
                    System.out.println("1.Chỉnh ID nhân viên.\n" +
                            "2.Chỉnh tên nhân viên.\n" +
                            "3.Chỉnh ngày sinh.\n" +
                            "4.Chỉnh địa chỉ.\n" +
                            "5.Chỉnh giới tính.\n" +
                            "6.Chỉnh CMND.\n" +
                            "7.Chỉnh SĐT.\n" +
                            "8.Chỉnh Email.\n" +
                            "9.Chỉnh trình độ.\n" +
                            "10.Chỉnh vị trí.\n" +
                            "11.Chỉnh lương.\n" +
                            "0.Trở lại menu chính");
                    System.out.println("Chọn tùy chọn của bạn");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1: {
                            System.out.println("Nhập id mới: ");
                            employeeList.get(i).setId(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 2: {
                            System.out.println("Nhập tên mới: ");
                            employeeList.get(i).setName(sc.nextLine());
                            break;
                        }
                        case 3: {
                            System.out.println("Nhập ngày sinh mới: ");
                            employeeList.get(i).setDateOfBirth(sc.nextLine());
                            break;
                        }
                        case 4: {
                            System.out.println("Nhập địa chỉ mới: ");
                            employeeList.get(i).setAddress(sc.nextLine());
                            break;
                        }

                        case 5: {
                            System.out.println("Nhập giới tính mới");
                            employeeList.get(i).setGender(sc.nextLine());
                            break;
                        }
                        case 6: {
                            System.out.println("Nhập CMND mới: ");
                            employeeList.get(i).setIdCard(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 7: {
                            System.out.println("Nhập SĐT mới: ");
                            employeeList.get(i).setPhoneNumber(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 8: {
                            System.out.println("Nhập Email mới: ");
                            employeeList.get(i).setEmail(sc.nextLine());
                            break;
                        }
                        case 9:
                            System.out.println("Nhập trình độ mới: ");
                            employeeList.get(i).setLevel(chooseLevel());
                            break;
                        case 10: {
                            System.out.println("Nhập vị trí mới: ");
                            employeeList.get(i).setPosition(choosePosition());
                            break;
                        }
                        case 11: {
                            System.out.println("Nhập lương mới: ");
                            employeeList.get(i).setSalary(Double.parseDouble(sc.nextLine()));
                            break;
                        }
                        case 0:
                            check = false;
                            break;

                        default:
                            System.out.println("Thử lại");
                            break;
                    }
                }

                ReadAndWrite.writeListEmployeeToCSV(employeeList,EMPLOYEE_FILE, false);

                System.out.println("Cập nhật thành công");
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void delete() throws Exception {

        List<Employee> employeeList = ReadAndWrite.readEmployeeFileCSV(EMPLOYEE_FILE);

        System.out.println("Nhập tên nhân viên muốn xóa: ");
        String nameDelete = sc.nextLine();

        int index=-1;
        for (int i = 0 ; i < employeeList.size() ; i++){
            if (employeeList.get(i).getName().equalsIgnoreCase(nameDelete)){
                index = i;
                System.out.println(employeeList.get(i));
                break;
            }
        }
        if (index == -1){
            System.out.println("Không tìm thấy");
        }else {
            employeeList.remove(index);
            System.out.println("Xoá thành công");
        }
        ReadAndWrite.writeListEmployeeToCSV(employeeList,EMPLOYEE_FILE, false);
    }

    @Override
    public void findByName() {

        List<Employee> employeeList = ReadAndWrite.readEmployeeFileCSV(EMPLOYEE_FILE);

        System.out.println("Nhập tên nhân viên cần tìm : ");
        String findName = sc.nextLine();
        boolean check = false;
        for (int i = 0 ; i < employeeList.size() ; i++){
            if (employeeList.get(i).getName().contains(findName)){
                System.out.println(employeeList.get(i));
                check = true;

            }
        }
        if (!check) {
            System.out.println("Không tìm thấy");
        }
    }
}

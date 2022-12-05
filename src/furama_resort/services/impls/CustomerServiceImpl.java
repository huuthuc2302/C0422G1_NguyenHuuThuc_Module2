package furama_resort.services.impls;

import furama_resort.models.person.Customer;
import furama_resort.services.interfaces.CustomerService;
import furama_resort.util.ReadAndWrite;
import furama_resort.util.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    public static final String CUSTOMER_FILE = "src/furama_resort/data/customer.csv";
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void display() throws Exception {

        List<Customer> customerList = ReadAndWrite.readCustomerFileCSV(CUSTOMER_FILE);

        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    @Override
    public void addNew() throws Exception {

        List<Customer> customerList = new ArrayList<>();

        System.out.println("Mã khách hàng");
        int id = Regex.inputIDCustomer(customerList);

        System.out.println("Họ tên");
        String name = Regex.inputName();

        System.out.println("Ngày sinh");
        String dateOfBirth = Regex.getDateOfBirth();

        System.out.println("Địa chỉ");
        String address = sc.nextLine();

        System.out.println("Giới tính");
        String gender = sc.nextLine();

        System.out.println("Số CMND");
        int idCard = Integer.parseInt(Regex.inputIdCard());

        System.out.println("Số điện thoại");
        int phoneNumber = Integer.parseInt(Regex.inputPhoneNumber());

        System.out.println("Email");
        String email = Regex.inputEmail();

        System.out.println("Loại khách");
        String typeCustomer = chooseTypeCustomer();

        Customer customer = new Customer(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email, typeCustomer);
        customerList.add(customer);

        ReadAndWrite.writeListCustomerToCSV(customerList, CUSTOMER_FILE, true);

        System.out.println("Thêm mới thành công");
    }

    public String chooseTypeCustomer() {
        while (true) {
            try {
                System.out.println("1.Diamond");
                System.out.println("2.Platinum");
                System.out.println("3.Gold");
                System.out.println("4.Silver");
                System.out.println("5.Member");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinum";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
                    default:
                        System.out.println("Thử lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    @Override
    public void edit() throws Exception {

        List<Customer> customerList = ReadAndWrite.readCustomerFileCSV(CUSTOMER_FILE);

        boolean result = true;
        System.out.println("Nhập ID khách hàng muốn chỉnh sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println(customerList.get(i));
                boolean check = true;
                while (check) {
                    System.out.println("1.Mã khách hàng\n" +
                            "2.Họ tên\n" +
                            "3.Ngày sinh\n" +
                            "4.Địa chỉ \n" +
                            "5.Giới tính\n" +
                            "6.Số CMND\n" +
                            "7.Số Điện Thoại\n" +
                            "8.Email\n" +
                            "9.Loại khách\n" +
                            "0.Trở lại menu chính");
                    System.out.println("Chọn tùy chọn của bạn");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Nhập mã KH mới");
                            customerList.get(i).setId(Integer.parseInt(sc.nextLine()));
                            break;

                        case 2:
                            System.out.println("Nhập tên mới");
                            customerList.get(i).setName(sc.nextLine());
                            break;

                        case 3:
                            System.out.println("Nhập ngày sinh mới");
                            customerList.get(i).setDateOfBirth(sc.nextLine());
                            break;

                        case 4:
                            System.out.println("Nhập địa chỉ mới");
                            customerList.get(i).setAddress(sc.nextLine());
                            break;

                        case 5:
                            System.out.println("Nhập giới tính mới");
                            customerList.get(i).setGender(sc.nextLine());
                            break;

                        case 6:
                            System.out.println("Nhập CMND mới");
                            customerList.get(i).setIdCard(Integer.parseInt(sc.nextLine()));
                            break;

                        case 7:
                            System.out.println("Nhập SĐT mới");
                            customerList.get(i).setPhoneNumber(Integer.parseInt(sc.nextLine()));
                            break;

                        case 8:
                            System.out.println("Nhập email mới");
                            customerList.get(i).setEmail(sc.nextLine());
                            break;

                        case 9:
                            System.out.println("Nhập loại khách mới");
                            customerList.get(i).setTypeCustomer(chooseTypeCustomer());
                            break;

                        case 0:
                            check = false;
                            break;

                        default:
                            System.out.println("Thử lại");
                            break;
                    }
                }

                ReadAndWrite.writeListCustomerToCSV(customerList, CUSTOMER_FILE, false);

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

        List<Customer> customerList = ReadAndWrite.readCustomerFileCSV(CUSTOMER_FILE);

        System.out.println("Nhập tên khách hàng muốn xóa: ");
        String nameDelete = sc.nextLine();

        int index = -1;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equalsIgnoreCase(nameDelete)) {
                index = i;
                System.out.println(customerList.get(i));
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            customerList.remove(index);
            System.out.println("Xoá thành công");
        }
        ReadAndWrite.writeListCustomerToCSV(customerList, CUSTOMER_FILE, false);
    }

    @Override
    public void findByName() {

        List<Customer> customerList = ReadAndWrite.readCustomerFileCSV(CUSTOMER_FILE);

        System.out.println("Nhập tên khách hàng cần tìm : ");
        String findName = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(findName)) {
                System.out.println(customerList.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy");
        }
    }
}

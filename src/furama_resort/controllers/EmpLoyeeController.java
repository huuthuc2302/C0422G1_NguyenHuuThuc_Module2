package furama_resort.controllers;

import furama_resort.services.impls.EmployeeServiceImpl;

import java.util.Scanner;

public class EmpLoyeeController {
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public static void displayEmpLoyeeMenu() throws Exception {

        while (true){
            System.out.println("1. Hiển thị danh sách nhân viên.");
            System.out.println("2. Thêm nhân viên mới.");
            System.out.println("3. Chỉnh sửa nhân viên.");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm nhân viên");
            System.out.println("0. Trở lại menu chính.");
            try {
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        employeeService.display();
                        break;

                    case 2:
                        employeeService.addNew();
                        break;

                    case 3:
                        employeeService.edit();
                        break;

                    case 4:
                        employeeService.delete();
                        break;

                    case 5:
                        employeeService.findByName();
                        break;
                    case 0:
                        return;

                    default:{
                        System.out.println("Thử lại");
                        break;
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Thử lại");
            }
        }
    }
    }


package furama_resort.controllers;

import furama_resort.services.impls.CustomerServiceImpl;


import java.util.Scanner;

public class CustomerController {
    static Scanner sc = new Scanner(System.in);
    static CustomerServiceImpl customerService = new CustomerServiceImpl();

    public static void displayCustomerMenu() throws Exception {

        while (true) {
            System.out.println("1. Display list customers.");
            System.out.println("2. Add new customer.");
            System.out.println("3. Edit customer.");
            System.out.println("4. Delete customer.");
            System.out.println("5. Find customer.");
            System.out.println("0. Return main menu");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        customerService.display();
                        break;

                    case 2:
                        customerService.addNew();
                        break;

                    case 3:
                        customerService.edit();
                        break;

                    case 4:
                        customerService.delete();
                        break;

                    case 5:
                        customerService.findByName();
                        break;

                    case 0:
                        return;

                    default:
                        System.out.println("Thử lại");
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }
    }
}

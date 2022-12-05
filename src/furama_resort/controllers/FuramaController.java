package furama_resort.controllers;

import java.util.Scanner;

import static furama_resort.controllers.BookingController.displayBookingMenu;
import static furama_resort.controllers.CustomerController.displayCustomerMenu;
import static furama_resort.controllers.EmpLoyeeController.displayEmpLoyeeMenu;
import static furama_resort.controllers.FacilityController.displayFacilityMenu;
import static furama_resort.controllers.PromotionController.displayPromotionMenu;

public class FuramaController {
    public static Scanner sc = new Scanner(System.in);





    public static void main(String[] args) throws Exception {
        displayMainMenu();
    }

    public static void displayMainMenu() throws Exception {
        boolean check = true;
        while (check){
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("0.Exit");
            System.out.println("Chọn tùy chọn của bạn: ");
            try{
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        displayEmpLoyeeMenu();
                        break;
                    case 2:
                        displayCustomerMenu();
                        break;
                    case 3:
                        displayFacilityMenu();
                        break;
                    case 4:
                        displayBookingMenu();
                        break;
                    case 5:
                        displayPromotionMenu();
                        break;
                    case 6:
                        System.exit(0);

                    default:
                        System.out.println("Thử lại");
                        break;

                }
            }catch (NumberFormatException e){
                System.out.println("Thử lại");
            }
        }
    }




}

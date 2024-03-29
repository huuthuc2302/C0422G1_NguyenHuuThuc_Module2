package furama_resort.controllers;

import furama_resort.services.impls.FacilityServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class FacilityController {
    static Scanner sc = new Scanner(System.in);
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static void displayFacilityMenu() throws IOException {
        boolean check = true;
        while (check){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("0. Return main menu");
            try {
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        addNewFacilityMenu();
                        break;
                    case 3:
                        facilityService.addFacilityMaintain();
                        break;
                    case 0:
                        check = false;
                        break;

                    default:
                        System.out.println("Thử lại");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }

    }

    public static void addNewFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new Villa.");
            System.out.println("2. Add new House.");
            System.out.println("3. Add new Room.");
            System.out.println("0. Trở lại menu chính");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        facilityService.addNewVilla();
                        displayFacilityMenu();
                        break;
                    }
                    case 2: {
                        facilityService.addNewHouse();
                        displayFacilityMenu();
                        break;
                    }
                    case 3:
                        facilityService.addNewRoom();
                        displayFacilityMenu();
                        break;
                    case 0:
                        check = false;
                        break;
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Please enter number");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

package furama_resort.controllers;

import furama_resort.services.impls.BookingServiceImpl;

import java.util.Scanner;

public class BookingController {
    static Scanner sc = new Scanner(System.in);
    static BookingServiceImpl bookingService = new BookingServiceImpl();

    public static void displayBookingMenu() throws Exception {
        boolean check = true;
        while (check){
            System.out.println("1.Add new booking.");
            System.out.println("2.Display list booking.");
            System.out.println("3.Create new contracts.");
            System.out.println("4.Display list contracts.");
            System.out.println("5.Edit contracts.");
            System.out.println("0.Return main menu.");
            try {
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 0:
                    default:{
                        System.out.println("Retry");
                        break;
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter number");
            }
        }
    }
}

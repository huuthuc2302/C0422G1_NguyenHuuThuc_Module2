package furama_resort.controllers;

import java.io.IOException;
import java.util.Scanner;

public class PromotionController {
    static Scanner sc = new Scanner(System.in);

    public static void displayPromotionMenu() throws IOException {
        boolean check = true;
        while (check){
            System.out.println("Display list customers use service");
            System.out.println("Display list customers get voucher");
            System.out.println("Return main menu");
            try {
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                    case 2:
                    case 3:
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

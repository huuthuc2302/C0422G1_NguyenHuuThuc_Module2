package ss1_prodution_to_java.Bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số cần đọc ");
        int number = scanner.nextInt();

        int a = number % 10;
        int b = (number / 10) % 10;
        int c = number / 100;
        switch (c) {
            case 1:
                System.out.print("one hundred ");
                break;
            case 2:
                System.out.print("two hundred ");
                break;
            case 3:
                System.out.print("three hundred ");
                break;
            case 4:
                System.out.print("four hundred ");
                break;
            case 5:
                System.out.print("five hundred ");
                break;
            case 6:
                System.out.print("six hundred ");
                break;
            case 7:
                System.out.print("seven hundred ");
                break;
            case 8:
                System.out.print("eight hundred ");
                break;
            case 9:
                System.out.print("nine hundred ");
                break;
        }
        switch (b) {
            case 1:
                System.out.print("ten ");
                break;
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixties ");
                break;
            case 7:
                System.out.print("seventies ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
        switch (a) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }
}
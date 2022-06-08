package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum is: " + sum);
    }
}

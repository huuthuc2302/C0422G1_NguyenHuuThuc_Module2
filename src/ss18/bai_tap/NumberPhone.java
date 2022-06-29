package ss18.bai_tap;

import java.util.Scanner;

public class NumberPhone {
    private static final String NUMBER_REGEX = "^(\\d{2}[-][0]\\d{9})$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do{
            System.out.println("Nhập vào");
            String str = scanner.nextLine();
            check = str.matches(NUMBER_REGEX);
            if (check){
                System.out.println("Đủ điều kiện");
            }else {
                System.out.println("Sai điều kiện");
            }
        }while (true);
    }
}

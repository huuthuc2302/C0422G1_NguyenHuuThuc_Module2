package ss18.bai_tap;

import java.util.Scanner;

public class Validate {
    private static final String NAME_REGEX = "^([CAP]\\d{4}[GHIKLM])$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do{
            System.out.println("Nhập tên của lớp");
            String name = scanner.nextLine();
            check = name.matches(NAME_REGEX);
            if (check){
                System.out.println("đúng");
                break;
            }else {
                System.out.println("Nhập sai vui lòng nhập lại");
            }
        }while (true);
    }
}

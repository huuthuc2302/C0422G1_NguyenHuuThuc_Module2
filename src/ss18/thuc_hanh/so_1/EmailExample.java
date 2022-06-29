package ss18.thuc_hanh.so_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập email");
        String email = scanner.nextLine();
        if (email.matches(EMAIL_REGEX)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

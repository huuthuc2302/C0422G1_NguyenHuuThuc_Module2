package ss18.thuc_hanh.so_2;

import java.util.Scanner;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tài khoản");
        String account = scanner.nextLine();
        if (account.matches(ACCOUNT_REGEX)){
            System.out.println("Đạt yêu cầu ");
        }else {
            System.out.println("Không đạt yêu cầu");
        }
    }
}

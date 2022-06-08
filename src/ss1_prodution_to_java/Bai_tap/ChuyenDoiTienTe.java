package ss1_prodution_to_java.Bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int vnd ;
        int usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiền USD cần chuyển");
        usd = scanner.nextInt();
        vnd = usd * 23000;
        System.out.println( usd + " USD = " + vnd + " VNĐ");
    }
}

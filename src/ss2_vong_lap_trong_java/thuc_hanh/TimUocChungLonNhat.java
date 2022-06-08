package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập a");
        a = input.nextInt();
        System.out.println(" Nhập b");
        b = input.nextInt();

        //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        //Kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0){
            System.out.println(" Không có ước chung lớn nhất ");

            //Tìm ước số chung lớn nhất của a, b
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
                System.out.println("Ước chung lớn nhất : " + a);
            }
        }
    }
}

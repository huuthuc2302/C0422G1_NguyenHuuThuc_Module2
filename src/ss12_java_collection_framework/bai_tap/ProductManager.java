package ss12_java_collection_framework.bai_tap;

import java.util.Scanner;

import static ss12_java_collection_framework.bai_tap.Function.products;

public class ProductManager {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int check;

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("1.Thêm mới sản phẩm.");
            System.out.println("2.Hiển thị sản phẩm.");
            System.out.println("3.Xóa sản phẩm.");
            System.out.println("4.Tìm kiếm theo ID.");
            System.out.println("5.Thoát");
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào chức năng muốn dùng:");
            check = Integer.parseInt(input.nextLine());
            switch (check) {
                case 1: //Thêm mới sản phẩm
                    products.add(Function.add());
                    break;

                case 2: //Hiển thị sản phẩm
                    Function.display();
                    break;

                case 3: //Xóa sản phẩm
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(input.nextLine());
                    Function.del(id);
                    break;

                case 4: //Tìm kiếm theo ID
                    System.out.println("Nhập id");
                    int id1 = Integer.parseInt(input.nextLine());
                    Function.find(id1);
                    break;

                case 5: //Thoát
                    System.out.println("Kết thúc");
                    break;
            }
            System.out.println();
        } while (check < 5);
    }
}

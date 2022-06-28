package ss17.bai_tap;

import ss17.thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static Scanner scanner = new Scanner(System.in);
    public void  addToFile(){
        List<Product> products = ReadAndWrite.read();
        System.out.println("Nhâp mã sản phẩm : ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm : ");
        String productName = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất : ");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập giá : ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println(" Các mô tả khác : ");
        String otherDescriptions = scanner.nextLine();
        products.add(new Product(code, productName, manufacturer, price, otherDescriptions));
        ReadAndWrite.write(products);

    }
}

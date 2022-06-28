package ss17.bai_tap_1.service;

import ss17.bai_tap_1.model.Products;

import java.util.List;
import java.util.Scanner;

public class ProductManger implements ICrud{
    private Scanner sc = new Scanner(System.in);
    @Override
    public void add() {
        List<Products> productsList = ReadAndWrite.read();
        String code, name, produce;
        int price;
        System.out.println("nhập mã sản phẩm:");
        code = sc.nextLine();
        System.out.println("nhập tên sản phẩm:");
        name = sc.nextLine();
        System.out.println("nhập hãng sản xuất:");
        produce = sc.nextLine();
        System.out.println("nhập giá sản phẩm:");
        price = Integer.parseInt(sc.nextLine());
        productsList.add(new Products(code,name,produce,price));
        ReadAndWrite.write(productsList);
    }

    @Override
    public void remove() {
        boolean flg = true;
        String code;
        System.out.println("nhập mã sản phẩm cần xóa");
        code = sc.nextLine();
        List<Products> list = ReadAndWrite.read();
        for (int i = 0; i < list.size(); i++) {
            if (code.equals(list.get(i).getCode())){
                list.remove(list.get(i));
                flg = false;
            }
        }
        if (flg){
            System.out.println("sản phẩm không tồn tại nên không thể xóa!");
        }
        ReadAndWrite.write(list);
    }

    @Override
    public void find() {
        System.out.println("nhập tên sản phẩm cần tìm:");
        String name = sc.nextLine();
        List<Products> list1 = ReadAndWrite.read();
        boolean flg = true;
        for (int i = 0; i < list1.size(); i++) {
            if (name.equals(list1.get(i).getName())){
                System.out.println(list1.get(i));
                flg = false;
            }
        }
        if (flg){
            System.out.println("sản phẩm không tồn tại!");
        }
    }

    @Override
    public void display() {
        List<Products> productsList = ReadAndWrite.read();
        for(Products p: productsList){
            System.out.println(p);
        }
    }
}

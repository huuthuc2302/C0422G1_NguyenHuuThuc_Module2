package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product("iPhone 14", "Apple", 2022, 4));
        products.add(new Product("iPhone 12 Pro Max", "Apple", 2020, 2));
        products.add(new Product("iPhone 13 Pro", "Apple", 2021, 3));
    }

    public static Product add(){
        Scanner snc = new Scanner(System.in);

        System.out.println("Tên sản phẩm : ");
        String name = snc.nextLine();

        System.out.println("Hãng sản xuất : ");
        String manu = snc.nextLine();

        System.out.println("Năm sản xuất : ");
        int year = Integer.parseInt(snc.nextLine());

        System.out.println("ID sản phẩm : ");
        int id = Integer.parseInt(snc.nextLine());

        return new Product(name,manu,year,id);
    }
    public static void display(){
        for (Product s: products) {
            System.out.println(s);
        }
    }

    public static void del(int id){
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                products.remove(products.get(i));
            }
        }
    }

    public static void find(int id){
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println(products.get(i));
            }
        }
    }
}

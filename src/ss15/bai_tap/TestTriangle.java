package ss15.bai_tap;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        boolean flag;
        do {
            try {
                System.out.println("Nhập độ dài cạnh a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập độ dài cạnh b");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập độ dài cạnh c");
                int c = Integer.parseInt(scanner.nextLine());
                triangle = new Triangle(a, b, c);
                System.out.println("3 cạnh của tam giác");
                flag = true;
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                flag = false;
//            e.printStackTrace();
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                flag = false;
//            e.printStackTrace();
//            System.out.println(e);
            }

        } while (!flag);
        System.out.println(triangle);
    }

}

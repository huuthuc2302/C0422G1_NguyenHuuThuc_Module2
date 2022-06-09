package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng 1");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        input(array1);

        System.out.println("Nhập kích thước mảng 2");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        input(array2);

        System.out.println("Mảng 1 vừa nhập: ");
        output(array1);

        System.out.println("\nMảng 2 vừa nhập: ");
        output(array2);

        System.out.println("\nMảng sau khi gộp : ");
        concac(array1, array2);

    }//tạo hàm để nhập mảng

    public static void input(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử : " + i);
            array[i] = scanner.nextInt();
        }
    }//tạo hàm để xuất mảng

    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }//nối mảng lại với nhau

    public static void concac(int[] array1, int[] array2) {
        int size3 = array1.length + array2.length;
        int[] array3 = new int[size3];
        int count = 0;
        for (int apple : array1) {
            array3[count] = apple;
            count++;
        }
        for (int apple : array2) {
            array3[count] = apple;
            count++;
        }
        System.out.println(Arrays.toString(array3));
    }
}

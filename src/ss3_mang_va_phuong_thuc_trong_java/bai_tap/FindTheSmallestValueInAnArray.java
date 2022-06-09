package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

//Tìm giá trị nhỏ nhất trong mảng
public class FindTheSmallestValueInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        input(array);
        System.out.println("Mảng bạn vừa nhập là ");
        output(array);
        min(array);

    }
    public static void input(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào a[" + i +"] = ");
            array[i] = scanner.nextInt();
        }
    }
    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static void min(int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("\nGiá trị bé nhất trong mảng là : " + min + "\nNằm ở vị trí " + index);
    }
}

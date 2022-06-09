package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

//Tìm phần tử lớn nhất trong mảng hai chiều
public class FindTheLargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng : ");
        int soDong = scanner.nextInt();
        System.out.println("Nhập số cột : ");
        int soCot = scanner.nextInt();

        int[][] array = new int[soDong][soCot];
        input(array, soDong, soCot);

        System.out.println("Mảng vừa nhập  : ");
        output(array, soDong, soCot);

        System.out.println("Giá trị lớn nhất " + max(array, soDong, soCot));
    }

    //tạo hàm để nhập mảng
    public static void input(int[][] array, int soDong, int soCot) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập vào phần tử : " + i + j);
                array[i][j] = scanner.nextInt();
            }
        }
    }

    //tạo hàm để xuất mảng
    public static void output(int[][] array, int soDong, int soCot) {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static int max(int[][] array, int soDong, int soCot){
        int max = array[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}

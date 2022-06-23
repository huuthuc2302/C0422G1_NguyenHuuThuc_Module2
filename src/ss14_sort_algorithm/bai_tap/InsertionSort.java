package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;
        //Cài đặt thuật toán sắp xếp chèn
public class InsertionSort {
    static int[] list = {12,45,6,1,8,9,7,0};

    public static void insertionSort(int[] arr){
        int x;
        int pos;
        for (int i = 1; i < arr.length ; i++) {
            //Lấy giá trị để đi chèn
            x = arr[i];
            pos = i;
            // chèn vào vị trí thích hợp ở mảng con
            while (0 < pos && x < arr[pos - 1]){
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("Lần thứ " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Mảng sau khi được sắp xếp chèn :");
        for (int i = 0; i < list.length; i++)
            System.out.print( list[i] + " ");
    }
}

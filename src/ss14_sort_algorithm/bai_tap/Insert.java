package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class Insert {
    public static void insert (int[] arr){
        int x;
        int pos;
        for (int i = 1; i < arr.length ; i++) {
            x = arr[i];
            pos = i;
            System.out.println( " Lần chèn thứ " + i );
            System.out.println("Lấy ra phần tử thứ " + pos + " có giá trị là " + x);
            while ( 0 < pos && x <arr[pos - 1]){
                arr[pos] = arr[pos - 1];
                System.out.println("Di chuyển phần tử thứ " + (pos - 1) + " sang vị trí thứ " + pos);
                System.out.println(Arrays.toString(arr)+"\n");
                pos--;
            }
            arr[pos] = x;
            System.out.println("Gán giá trị " + x + " vào vị trí " + pos);
            System.out.println(Arrays.toString(arr)+"\n");
        }
    }

    public static void main(String[] args) {
        int[] list = {4,3,8,51,64,5};
        System.out.println("Trước khi sắp xếp : " + Arrays.toString(list));
        insert(list);
        System.out.println("Sau khi sắp xếp : " + Arrays.toString(list));
    }
}

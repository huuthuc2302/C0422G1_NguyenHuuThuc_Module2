package ss11_dsa_stack_queue.optional_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }
        String str1 = "";
        while (!queue.isEmpty()) {
            str1 += queue.remove();
        }
        if (str.equals(str1))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}

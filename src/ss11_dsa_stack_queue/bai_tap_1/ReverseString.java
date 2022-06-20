package ss11_dsa_stack_queue.bai_tap_1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    //Đảo ngược chuỗi sử dụng Stack
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<String>();

        System.out.println("Nhập vào chuỗi: ");
        String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for(int i = 0; i < s.length(); i++){
            System.out.print(stackChuoi.pop());
        }
    }
}

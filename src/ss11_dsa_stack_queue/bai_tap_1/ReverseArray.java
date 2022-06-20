package ss11_dsa_stack_queue.bai_tap_1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số ");
        Stack<Integer> stackSo = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stackSo.push(Integer.parseInt(sc.nextLine()));
        }
        Integer[] number = new Integer[stackSo.size()];
        for (int i = 0; i < number.length; i++) {
            number[i] = stackSo.pop();
        }

        for (int i = 0; i < number.length; i++) {
            stackSo.push(number[i]);
//            System.out.println(number[i]);
        }
        for (int i = stackSo.size(); i > 0 ; i--) {
            System.out.println(stackSo.pop());
        }
    }


}

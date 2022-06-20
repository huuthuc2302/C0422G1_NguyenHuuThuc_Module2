package ss11_dsa_stack_queue.optional_1;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stacksoDu = new Stack<String>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int x = scanner.nextInt();
        while (x > 0){
            int soDu = x%2;
            System.out.println(soDu);
            stacksoDu.push(soDu+"");
            x = x/2;
        }
        System.out.print("Số nhị phân là ");
        int n = stacksoDu.size();
        for( int i = 0; i < n; i++){
            System.out.print(stacksoDu.pop());
        }
    }

}

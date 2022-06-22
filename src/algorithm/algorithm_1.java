package algorithm;

import java.util.Scanner;

public class algorithm_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        System.out.println("Chuỗi sau khi sửa là: " + solution(str));
    }
    public static String solution(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                result += " " + (char)(str.charAt(i) + 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result.trim();
    }
}
